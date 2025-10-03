package io.kestra.webserver.utils;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.http.HttpClient;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

public class HttpClientUtils {
    public static HttpClient.Builder withPemCertificate(InputStream pemIs) throws KeyStoreException, IOException, NoSuchAlgorithmException, CertificateException, KeyManagementException {
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());

        keyStore.load(null, null);

        CertificateFactory cf = CertificateFactory.getInstance("X.509");

        Certificate caCert = cf.generateCertificate(pemIs);
        keyStore.setCertificateEntry("kestra-ca", caCert);
        pemIs.close();

        TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        tmf.init(keyStore);

        SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(null, tmf.getTrustManagers(), new java.security.SecureRandom());

        return HttpClient.newBuilder().sslContext(sslContext);
    }
}
