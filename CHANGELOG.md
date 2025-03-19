# 0.21.7

**Full Changelog**: [v0.21.6...v0.21.7](https://github.com/kestra-io/kestra/compare/v0.21.6...v0.21.7)

### 🩹 Fixes

- **core:** Avoid ClassCastException when parsing flow inputs ([#7882](https://github.com/kestra-io/kestra/pull/7882))
- **ui:** Amend displaying large amount of logs ([ce94c9ad2](https://github.com/kestra-io/kestra/commit/ce94c9ad2))
- **script:** Change centOS docker image because EOL ([7dd7d4507](https://github.com/kestra-io/kestra/commit/7dd7d4507))
- **test:** Backport flacky tests fixed on develop ([17ed32556](https://github.com/kestra-io/kestra/commit/17ed32556))

### 🏡 Chore

- **version:** Update the CHANGELOG.MD with details for 0.21.6 ([f0fcdf485](https://github.com/kestra-io/kestra/commit/f0fcdf485))
- **version:** Update to version 'v0.21.7' ([54da3fc26](https://github.com/kestra-io/kestra/commit/54da3fc26))

### ❤️ Contributors

- NKwiatkowski <nkwiatkowski@kestra.io>
- MilosPaunovic ([@MilosPaunovic](https://github.com/MilosPaunovic))
- Florian Hussonnois ([@fhussonnois](https://github.com/fhussonnois))



# 0.21.6

**Full Changelog**: [v0.21.5...v0.21.6](https://github.com/kestra-io/kestra/compare/v0.21.5...v0.21.6)

### 🚀 Enhancements

- **core:** Allow reading file from any namespaces ([4bb2de219](https://github.com/kestra-io/kestra/commit/4bb2de219))

### 🩹 Fixes

- **core:** Avoid duplicates in plugins subgroups + properly retrieve subgroup title ([33ac1ac53](https://github.com/kestra-io/kestra/commit/33ac1ac53))
- align to EE ([YannC](https://github.com/kestra-io/kestra/commit/3d29077a99c209a1f30c369618c29ad52c46a5a6))
- **runner-memory:** Delete MemorySchedulerTriggerState back due to cherry-pick ([27c876262](https://github.com/kestra-io/kestra/commit/27c876262))
- **core:** Possible NPE when an execution has no labels ([67e415406](https://github.com/kestra-io/kestra/commit/67e415406))
- **jdbc:** Resubmit worker job to the good worker group ([49a8d13b8](https://github.com/kestra-io/kestra/commit/49a8d13b8))
- **core:** #7740 http configuration bearer token may change to basic because of allowFailed ([#7788](https://github.com/kestra-io/kestra/pull/7788), [#7740](https://github.com/kestra-io/kestra/issues/7740))
- **core:** Use AbstractFileFunction in file functions ([3f7c385ab](https://github.com/kestra-io/kestra/commit/3f7c385ab))
- **cli:** Fix binding for plugin repository config ([368f4f22d](https://github.com/kestra-io/kestra/commit/368f4f22d))

### 🏡 Chore

- Update the CHANGELOG.MD with details for 0.21.5 ([eec8fb9fb](https://github.com/kestra-io/kestra/commit/eec8fb9fb))
- **version:** Update to version 'v0.21.6' ([2aeb11e2d](https://github.com/kestra-io/kestra/commit/2aeb11e2d))

### ❤️ Contributors

- Brian.mulier ([@brian-mulier-p](https://github.com/brian-mulier-p))
- Florian Hussonnois ([@fhussonnois](https://github.com/fhussonnois))
- Nicolas K. <nk_mikmak@hotmail.com>
- Loïc Mathieu ([@loicmathieu](https://github.com/loicmathieu))
- YannC <ycoornaert@kestra.io>
- MilosPaunovic ([@MilosPaunovic](https://github.com/MilosPaunovic))



# 0.21.5

**Full Changelog**: [v0.21.4...v0.21.5](https://github.com/kestra-io/kestra/compare/v0.21.4...v0.21.5)

### 🚀 Enhancements

- **core:** Add default options for HttpClient ([#7650](https://github.com/kestra-io/kestra/pull/7650))

### 🩹 Fixes

- **ui:** Plugins TOC is now handling every type of plugins ([278289a0c](https://github.com/kestra-io/kestra/commit/278289a0c))
- **ui:** Styling enhancements for plugin doc ([e4c7c0f10](https://github.com/kestra-io/kestra/commit/e4c7c0f10))
- **core:** Render list ([d84d66005](https://github.com/kestra-io/kestra/commit/d84d66005))
- **core:** Properly render list properties ([4abbc4cbc](https://github.com/kestra-io/kestra/commit/4abbc4cbc))
- **ui:** Replace alert blocks upon markdown rendering to display them properly ([9774d46d8](https://github.com/kestra-io/kestra/commit/9774d46d8))
- **core:** Validation error when timeWindow.type is null ([c004ba1a6](https://github.com/kestra-io/kestra/commit/c004ba1a6))
- **core:** MultipleCondition documentation ([1dc8401a0](https://github.com/kestra-io/kestra/commit/1dc8401a0))
- make subflow not found a warning instead of an error (#7649) ([YannC](https://github.com/kestra-io/kestra/commit/d4b76506330553a43832026f70dec6391b0236c3))
- recoverMissedSchedules behavior on long running executions (#7617) ([YannC](https://github.com/kestra-io/kestra/commit/cfe4e2a3c21f7d953458a32d5f9a663e977e1b40))
- avoid crash on injectDefault ([YannC](https://github.com/kestra-io/kestra/commit/49977f505f7ba45fd7e6e11019721de3ea9151b1))

### 💅 Refactors

- **ui:** Remove obsolete `chartjs-chart-treemap` library ([#7529](https://github.com/kestra-io/kestra/pull/7529))

### 📦 Build

- **deps:** Bump io.micronaut.platform:micronaut-platform ([527c13dec](https://github.com/kestra-io/kestra/commit/527c13dec))

### 🏡 Chore

- Update the CHANGELOG.MD with details for 0.21.4 ([07329555c](https://github.com/kestra-io/kestra/commit/07329555c))
- **ui:** Amend item labels in left menu ([#7590](https://github.com/kestra-io/kestra/pull/7590))
- **ui:** Make sure chart stacks are following the same order every time ([#7664](https://github.com/kestra-io/kestra/pull/7664))
- **deps**: upgrade Micronaut core to 4.7.15 ([Loïc Mathieu](https://github.com/kestra-io/kestra/commit/b3699eda5f9293887f58f0304bb42dcb951dcef4))
- **deps**: bump ui-libs to 0.0.151 ([brian.mulier](https://github.com/kestra-io/kestra/commit/312221ef73eebdc7f7cd05112f56b2eecd526fac))
- **deps**: upgrade ui-libs version to v0.0.153 ([YannC](https://github.com/kestra-io/kestra/commit/5b1d216c409f6af7cc4d676a53cda3b3cd751144))
- **deps**: upgrade ui-libs version to v0.0.154 ([YannC](https://github.com/kestra-io/kestra/commit/ea26e4dda7e6f4a8fdb0c1ab9780525784774a52))
- **deps**: upgrade ui-libs version to v0.0.154 ([MilosPaunovic](https://github.com/kestra-io/kestra/commit/65999abb3fef73bf50f9736d219524e47c659a08))
- 09d5b2f: Feat/npe on runcontext cleanup (#7585) (Nicolas K.)
- b7259cc: feat(#7636): add default options for HttpClient (#7650) (Nicolas K.)
- **webserver**: merging ([nKwiatkowski](https://github.com/kestra-io/kestra/commit/5131c347cd1ed1cf429e46ed346e70182de57c95))
- **version:** Update to version 'v0.21.5' ([df5d13467](https://github.com/kestra-io/kestra/commit/df5d13467))

### ❤️ Contributors

- Mathieu Gabelle <mgabelle@kestra.io>
- NKwiatkowski <nkwiatkowski@kestra.io>
- YannC ([@Skraye](http://github.com/Skraye))
- Loïc Mathieu ([@loicmathieu](https://github.com/loicmathieu))
- Brian.mulier ([@brian-mulier-p](https://github.com/brian-mulier-p))
- MilosPaunovic ([@MilosPaunovic](https://github.com/MilosPaunovic))



# 0.21.4

**Full Changelog**: [v0.21.3...v0.21.4](https://github.com/kestra-io/kestra/compare/v0.21.3...v0.21.4)

### 🩹 Fixes

- **core:** Http proxy was not passed to configuration ([6929ca196](https://github.com/kestra-io/kestra/commit/6929ca196))
- **ci:** QEMU issue ([38ba665ef](https://github.com/kestra-io/kestra/commit/38ba665ef))
- **tasks:** Remove useless format metrics on return ([#7486](https://github.com/kestra-io/kestra/pull/7486))
- **core:** Add package-info.java to dashboard package ([bed0470b7](https://github.com/kestra-io/kestra/commit/bed0470b7))
- **core:** Handle http request with no content type ([6966779f3](https://github.com/kestra-io/kestra/commit/6966779f3))
- **core:** Add package-info.java to script + handle subgroups properly ([035d9a56d](https://github.com/kestra-io/kestra/commit/035d9a56d))
- **core:** Try to log message for unhandled realtime trigger exception ([f3c3c6537](https://github.com/kestra-io/kestra/commit/f3c3c6537))
- **core:** Move package-info.java to proper dashboard packages ([6f24dac81](https://github.com/kestra-io/kestra/commit/6f24dac81))
- **core:** Rename dashboards subgroups ([01e4f7f8c](https://github.com/kestra-io/kestra/commit/01e4f7f8c))
- **core:** Camel to snake-case for app-blocks in RegisteredPlugin ([fffac0f90](https://github.com/kestra-io/kestra/commit/fffac0f90))
- **core:** Missing content type on http client ([e312ece25](https://github.com/kestra-io/kestra/commit/e312ece25))
- **core:** Content type encoding should not be mandatory ([82ef34c08](https://github.com/kestra-io/kestra/commit/82ef34c08))
- **core:** #172 add reactor into classloader blacklist ([#172](https://github.com/kestra-io/kestra/issues/172))
- **core:** Handle space in HTTP request URI ([51e5d35e6](https://github.com/kestra-io/kestra/commit/51e5d35e6))
- **core:** Subflow using the old task name never ends ([9aeda7160](https://github.com/kestra-io/kestra/commit/9aeda7160))

### 💅 Refactors

- **ui:** Move changelog file to root ([f866af5ee](https://github.com/kestra-io/kestra/commit/f866af5ee))
- Migrate CommandsWrapper commands to dynamic properties ([bdf7a1681](https://github.com/kestra-io/kestra/commit/bdf7a1681))

### 🏡 Chore

- **ui:** Improve links inside changelog file ([4c2317ddd](https://github.com/kestra-io/kestra/commit/4c2317ddd))
- **ui:** Improve the labels behavior ([b0fa3ddd5](https://github.com/kestra-io/kestra/commit/b0fa3ddd5))
- **ui:** Improve the doughnut chart legend ([#7321](https://github.com/kestra-io/kestra/pull/7321))
- Bump version ([49cfb8f42](https://github.com/kestra-io/kestra/commit/49cfb8f42))

### ❤️ Contributors

- NKwiatkowski <nkwiatkowski@kestra.io>
- Loïc Mathieu ([@loicmathieu](http://github.com/loicmathieu))
- Ludovic DEHON ([@tchiotludo](http://github.com/tchiotludo))
- Brian.mulier ([@brian-mulier-p](http://github.com/brian-mulier-p))
- Mathieu Gabelle ([@mgabelle](http://github.com/mgabelle))
- Shamar ([@Shamar12334](http://github.com/Shamar12334))
- MilosPaunovic ([@MilosPaunovic](http://github.com/MilosPaunovic))



# 0.21.3

**Full Changelog**: [v0.21.2...v0.21.3](https://github.com/kestra-io/kestra/compare/v0.21.2...v0.21.3)

### 🩹 Fixes

- **scheduler:** Delete trigger when flow is not found ([#7366](https://github.com/kestra-io/kestra/pull/7366))
- Enable rendering of commands properties inside CommandsWrapper " ([#7381](https://github.com/kestra-io/kestra/pull/7381))
- **ui:** Improve modifying inputs from no code editor ([#7440](https://github.com/kestra-io/kestra/pull/7440))
- **core:** Provide tenantId when looking for subflow ([#7442](https://github.com/kestra-io/kestra/pull/7442))
- **core:** Remove props with default from `required` in json schema to avoid validation errors ([3a39c6582](https://github.com/kestra-io/kestra/commit/3a39c6582))
- **core:** Render `delete` property at the beginning in Docker task runner ([1fa026f0e](https://github.com/kestra-io/kestra/commit/1fa026f0e))
- **tests:** Increase timeout on JdbcServiceLivenessCoordinatorTest.taskResubmitSkipExecution ([d30b331b3](https://github.com/kestra-io/kestra/commit/d30b331b3))

### 💅 Refactors

- Introduce render in commands wrapper for property string ([#7430](https://github.com/kestra-io/kestra/pull/7430))

### 🏡 Chore

- **ui:** Add link to filtered triggers page from backfill dialog ([#7380](https://github.com/kestra-io/kestra/pull/7380))
- **ui:** Include autocompletion shortcut in the preview list ([#7384](https://github.com/kestra-io/kestra/pull/7384))
- **ui:** Improve breadcrumbs on namespace view ([#7386](https://github.com/kestra-io/kestra/pull/7386))
- **ui:** Improve the labels behavior ([#7397](https://github.com/kestra-io/kestra/pull/7397))
- Update version to v0.21.3 ([23bde6b71](https://github.com/kestra-io/kestra/commit/23bde6b71))

### 🤖 CI

- **publish-docker:** Usage of qemu-user-static ([0b2df61c2](https://github.com/kestra-io/kestra/commit/0b2df61c2))

### ❤️ Contributors

- Brian.mulier ([@brian-mulier-p](http://github.com/brian-mulier-p))
- YannC ([@Skraye](http://github.com/Skraye))
- Miloš Paunović ([@MilosPaunovic](http://github.com/MilosPaunovic))
- Mathieu Gabelle ([@mgabelle](http://github.com/mgabelle))



# 0.21.2

**Full Changelog**: [v0.21.1...v0.21.2](https://github.com/kestra-io/kestra/compare/v0.21.1...v0.21.2)

### 🚀 Enhancements

- Theme switch to "theme switch" the charts ([#7151](https://github.com/kestra-io/kestra/pull/7151))
- **ci:** Add workflows for release process ([10fad2992](https://github.com/kestra-io/kestra/commit/10fad2992))

### 🩹 Fixes

- **ui:** Prevent doubling the executions chart on flow overview ([e086099d6](https://github.com/kestra-io/kestra/commit/e086099d6))
- **ui:** Amend bar chart colors on the main dashboard ([0e3218c7b](https://github.com/kestra-io/kestra/commit/0e3218c7b))
- **core:** Possible NPE on LabelService.containsAll ([8c943b43f](https://github.com/kestra-io/kestra/commit/8c943b43f))
- **ui:** Amend the language switching issue ([#7235](https://github.com/kestra-io/kestra/pull/7235))
- Add comment on i18n code ([60b189d10](https://github.com/kestra-io/kestra/commit/60b189d10))
- Labels should not be purple if inactive ([d9962a89a](https://github.com/kestra-io/kestra/commit/d9962a89a))
- **ci:** Fix and remove unecessary setps in set version workflows ([b651f53e8](https://github.com/kestra-io/kestra/commit/b651f53e8))
- Use the udpated labelsFromQuery in labels ([c26252534](https://github.com/kestra-io/kestra/commit/c26252534))
- **core:** Make flow/namespace variables available for input expr ([44c149e8d](https://github.com/kestra-io/kestra/commit/44c149e8d))
- **core:** Http client was not using deprecated setter ([5d5b74613](https://github.com/kestra-io/kestra/commit/5d5b74613))
- **core:** Do not validate subflow if namespace or id is pebble ([#7294](https://github.com/kestra-io/kestra/pull/7294))
- **h2:** Remove indenting in sql file ([#7306](https://github.com/kestra-io/kestra/pull/7306))

### 🏡 Chore

- **ui:** Re-order the list of optional columns ([#7213](https://github.com/kestra-io/kestra/pull/7213))
- Remove console.log ([df3bec4d6](https://github.com/kestra-io/kestra/commit/df3bec4d6))
- **ui:** Amended global pagination coloring ([#7201](https://github.com/kestra-io/kestra/pull/7201))
- **ui:** Generate random flow ID using combination of animal names and numbers ([#7223](https://github.com/kestra-io/kestra/pull/7223))
- **ui:** Only show warning on bulk execution deletion if nonTerminated is true ([#7211](https://github.com/kestra-io/kestra/pull/7211))
- **ui:** Align chart duration label with switch toggle ([#7259](https://github.com/kestra-io/kestra/pull/7259))
- **ui:** Disable saving flow actions if there are errors ([#7278](https://github.com/kestra-io/kestra/pull/7278))
- **ui:** Make action columns always visible on executions and flows ([#7291](https://github.com/kestra-io/kestra/pull/7291))
- **ui:** Remove the option to change editor theme separately ([#7192](https://github.com/kestra-io/kestra/pull/7192))
- Update version to v0.21.2 ([da6d0f57b](https://github.com/kestra-io/kestra/commit/da6d0f57b))

### ❤️ Contributors

- YannC ([@Skraye](http://github.com/Skraye))
- Miloš Paunović ([@MilosPaunovic](http://github.com/MilosPaunovic))
- Ludovic DEHON ([@tchiotludo](http://github.com/tchiotludo))
- Florian Hussonnois ([@fhussonnois](http://github.com/fhussonnois))
- Bart Ledoux <bledoux@kestra.io>
- Aabhas Sao ([@aabhas-sao](http://github.com/aabhas-sao))
- 咬轮猫 <10928033@qq.com>
- Loïc Mathieu ([@loicmathieu](http://github.com/loicmathieu))
- Piyush Bhaskar ([@Piyush-r-bhaskar](http://github.com/Piyush-r-bhaskar))
- Pravesh-Sudha ([@Pravesh-Sudha](http://github.com/Pravesh-Sudha))



# 0.21.1

**Full Changelog**: [v0.21.0...v0.21.1](https://github.com/kestra-io/kestra/compare/v0.21.0...v0.21.1)

### 🚀 Enhancements

- Show a lock on EE only pages ([#7093](https://github.com/kestra-io/kestra/pull/7093))
- **ui:** Add keyboard shortcuts dialog to editor ([#6628](https://github.com/kestra-io/kestra/pull/6628))
- **ui:** Add option to choose visible columns in flow and execution listings ([#6932](https://github.com/kestra-io/kestra/pull/6932))
- **ui:** Docs markdown alert styled based on alert level in product. ([#6818](https://github.com/kestra-io/kestra/pull/6818))

### 🩹 Fixes

- **ui:** Global plugin doc with new redesign + auto-expand properties initially ([9f76cae55](https://github.com/kestra-io/kestra/commit/9f76cae55))
- Avoid clearing selected value on every error ([f7df60419](https://github.com/kestra-io/kestra/commit/f7df60419))
- Use the proper variable for select header in table ([#7107](https://github.com/kestra-io/kestra/pull/7107))
- Make table links primary instead of purple ([#7106](https://github.com/kestra-io/kestra/pull/7106))
- **ui:** Amend pagination on namespace flows listing ([#7163](https://github.com/kestra-io/kestra/pull/7163))
- **ui:** Amend translation string for no results ([#7172](https://github.com/kestra-io/kestra/pull/7172))
- **ui:** Align dashboard button label to icon ([#7175](https://github.com/kestra-io/kestra/pull/7175))
- **core:** #7181 log level rendered as string ([#7198](https://github.com/kestra-io/kestra/pull/7198), [#7181](https://github.com/kestra-io/kestra/issues/7181))
- Remove editor theme from english ([8d3b3a849](https://github.com/kestra-io/kestra/commit/8d3b3a849))
- **core:** Request option doesn't initialize properly ([47cc38d89](https://github.com/kestra-io/kestra/commit/47cc38d89))

### 🏡 Chore

- **ui:** Show each plugin deprecation warning in new line ([#6839](https://github.com/kestra-io/kestra/pull/6839))
- **translations:** Auto generate values for languages other than english ([1f09f53a8](https://github.com/kestra-io/kestra/commit/1f09f53a8))
- **ui:** Amend color of the input length counter ([#6990](https://github.com/kestra-io/kestra/pull/6990))
- **ui:** Enable command palette for monaco editor ([#6944](https://github.com/kestra-io/kestra/pull/6944))
- **translations:** Auto generate values for languages other than english ([210fc246a](https://github.com/kestra-io/kestra/commit/210fc246a))
- **translations:** Auto generate values for languages other than english ([38720e96a](https://github.com/kestra-io/kestra/commit/38720e96a))
- **ui:** Improve the example for not condition ([#6820](https://github.com/kestra-io/kestra/pull/6820))
- **ui:** Update the visual of no data component ([#7179](https://github.com/kestra-io/kestra/pull/7179))
- **ui:** Improve the states options list inside filter values ([#7176](https://github.com/kestra-io/kestra/pull/7176))
- **translations:** Auto generate values for languages other than english ([a92312410](https://github.com/kestra-io/kestra/commit/a92312410))
- **ui:** Rename advanced properties to other in no code ([#7189](https://github.com/kestra-io/kestra/pull/7189))
- **translations:** Auto generate values for languages other than english ([bfee53a9b](https://github.com/kestra-io/kestra/commit/bfee53a9b))
- **ui:** Rename advanced properties to other in no code ([#7190](https://github.com/kestra-io/kestra/pull/7190))
- **translations:** Auto generate values for languages other than english ([23846d610](https://github.com/kestra-io/kestra/commit/23846d610))
- **translations:** Remove extra keys from translation files ([#7193](https://github.com/kestra-io/kestra/pull/7193))
- **ui:** Add the missing chart component ([c36cc504e](https://github.com/kestra-io/kestra/commit/c36cc504e))
- **ui:** Replace the visual for no tabs opened on namespace editor ([#7204](https://github.com/kestra-io/kestra/pull/7204))
- **version:** Update to version 'v0.21.1' ([0e891f64a](https://github.com/kestra-io/kestra/commit/0e891f64a))

### ❤️ Contributors

- Florian Hussonnois ([@fhussonnois](http://github.com/fhussonnois))
- NKwiatkowski <nkwiatkowski@kestra.io>
- Miloš Paunović ([@MilosPaunovic](http://github.com/MilosPaunovic))
- Bart Ledoux <bledoux@kestra.io>
- Nicolas K. <nk_mikmak@hotmail.com>
- GitHub Action ([@Github-Action-Bot](http://github.com/Github-Action-Bot))
- Piyush Bhaskar ([@Piyush-r-bhaskar](http://github.com/Piyush-r-bhaskar))
- Shruti Mantri <shruti1810@gmail.com>
- Aabhas Sao ([@aabhas-sao](http://github.com/aabhas-sao))
- Rajatsingh23 ([@rajatsingh23](http://github.com/rajatsingh23))
- Brian.mulier ([@brian-mulier-p](http://github.com/brian-mulier-p))
 


# 0.21.0

**Full Changelog**: [v0.20.0...v0.21.0](https://github.com/kestra-io/kestra/compare/v0.20.0...v0.21.0)

### 🚀 Enhancements

- **ui:** Add right click menu on file tree view in editor ([#5936](https://github.com/kestra-io/kestra/pull/5936))
- **core:** Add displayName to flow level outputs(backend) " ([#5605](https://github.com/kestra-io/kestra/pull/5605))
- **ui:** Add triggers sorting by next execution date ([#6318](https://github.com/kestra-io/kestra/pull/6318))
- **core,jdbc:** Small trigger / scheduler improvements ([a27bb1a85](https://github.com/kestra-io/kestra/commit/a27bb1a85))
- **ui:** Add flow validation to FlowCreate component ([#6370](https://github.com/kestra-io/kestra/pull/6370))
- **plugins:** Add typesense plugin ([7979809ae](https://github.com/kestra-io/kestra/commit/7979809ae))
- **core:** Log at ERROR level for script logs to stderr ([0e0928d51](https://github.com/kestra-io/kestra/commit/0e0928d51))
- **ui:** Make filters expand fully if we omit some of the non required buttons ([#6364](https://github.com/kestra-io/kestra/pull/6364))
- **ui:** Improvement in filter for adding clear all filters. ([#6359](https://github.com/kestra-io/kestra/pull/6359))
- **ui:** Improve Gantt page. ([#6358](https://github.com/kestra-io/kestra/pull/6358))
- **ui:** Triggers: The expanded button displays an empty area. ([#6337](https://github.com/kestra-io/kestra/pull/6337))
- **ui:** Add missing filter options for metrics ([#6409](https://github.com/kestra-io/kestra/pull/6409))
- **UI:** Added new filters to Flows -> Metrics tab ([#6305](https://github.com/kestra-io/kestra/pull/6305))
- **ui:** Add new filters to Administration -> Triggers page ([#6328](https://github.com/kestra-io/kestra/pull/6328))
- **ui:** Introduce new filters bar to audit logs ([#6419](https://github.com/kestra-io/kestra/pull/6419))
- **main-gha-workflow:** Add dispatch event with new version ([#6443](https://github.com/kestra-io/kestra/pull/6443))
- **tests:** Move the extension into the right folder ([008c03ce2](https://github.com/kestra-io/kestra/commit/008c03ce2))
- **webserver:** Small improvements to our OpenAPI spec ([6a34c04e3](https://github.com/kestra-io/kestra/commit/6a34c04e3))
- **core:** Use the Sleep official task instead of a custom test one ([aa8ad1520](https://github.com/kestra-io/kestra/commit/aa8ad1520))
- **script:** Include task null outputs ([b133210fa](https://github.com/kestra-io/kestra/commit/b133210fa))
- **core:** Throw an error if the secret is not found ([da1bbb51a](https://github.com/kestra-io/kestra/commit/da1bbb51a))
- **core:** Allow SELECT input to be radio UI type ([18a2b553c](https://github.com/kestra-io/kestra/commit/18a2b553c))
- Add Huggingface Plugin ([2290b9933](https://github.com/kestra-io/kestra/commit/2290b9933))
- **ci:** Parallelize frontend testing workflow with Storybook, vitest and linter ([#6529](https://github.com/kestra-io/kestra/pull/6529))
- **ui:** Implement initial stories for filter components ([#6542](https://github.com/kestra-io/kestra/pull/6542))
- **jdbc:** Small improvement to the worker trigger queue ([3559b640e](https://github.com/kestra-io/kestra/commit/3559b640e))
- **core:** Add audit log when killing an execution ([53af6a38b](https://github.com/kestra-io/kestra/commit/53af6a38b))
- **core:** Add a Write task ([a27ef2ace](https://github.com/kestra-io/kestra/commit/a27ef2ace))
- **core:** Added a Pebble function [uniq] to deduplice array #6417 ([#6417](https://github.com/kestra-io/kestra/issues/6417))
- **core:** Add an Exit task ([ff83e25c0](https://github.com/kestra-io/kestra/commit/ff83e25c0))
- **ui:** Introduce log font size property in settings ([#6600](https://github.com/kestra-io/kestra/pull/6600))
- **webserver:** OpenAPI spec improvement ([6db49aebf](https://github.com/kestra-io/kestra/commit/6db49aebf))
- **tasks:** Move http task to apache http client ([93dc50888](https://github.com/kestra-io/kestra/commit/93dc50888))
- **core:** Add a http client abstraction on top of apache http client ([1772ed45f](https://github.com/kestra-io/kestra/commit/1772ed45f))
- **core:** Use http abstraction on http tasks ([6dfe29adf](https://github.com/kestra-io/kestra/commit/6dfe29adf))
- **core:** Add an audit log for executions created by a trigger ([e5b0ff459](https://github.com/kestra-io/kestra/commit/e5b0ff459))
- **script:** Add privileged flags to docker ([e8ee97e26](https://github.com/kestra-io/kestra/commit/e8ee97e26))
- **core:** Add taskrun.iteration inside Pebble variables ([aa9af94c1](https://github.com/kestra-io/kestra/commit/aa9af94c1))
- **webserver:** Add a configuration to change app html title ([622f158bd](https://github.com/kestra-io/kestra/commit/622f158bd))
- ***:** Maintenance mode ([9901470b7](https://github.com/kestra-io/kestra/commit/9901470b7))
- **core-ee:** Add log shipper first implementation ([#6596](https://github.com/kestra-io/kestra/pull/6596))
- **core:** Add run context to log shipper ([#6651](https://github.com/kestra-io/kestra/pull/6651))
- **core:** Restarting Subflow ([1e36d1eb2](https://github.com/kestra-io/kestra/commit/1e36d1eb2))
- **ui:** Add an alert block for restarted execution ([576e023d9](https://github.com/kestra-io/kestra/commit/576e023d9))
- **core:** Add `taskRunner` output on ScriptOutput to get detailled information on underlying taskrunner ([c265b49a8](https://github.com/kestra-io/kestra/commit/c265b49a8))
- ***:** Fixes and improvements for custom dashboard ([#6684](https://github.com/kestra-io/kestra/pull/6684))
- **core:** Add partial fix to micronaut hibernate validator and ValueExtractor ([81f08f00c](https://github.com/kestra-io/kestra/commit/81f08f00c))
- **core:** Validate tasks and triggers with dynamic properties ([c5e23d43d](https://github.com/kestra-io/kestra/commit/c5e23d43d))
- **core:** Add log record serialization ([#6683](https://github.com/kestra-io/kestra/pull/6683))
- **core, ui, webserver:** Add replay system labels ([b3ed3d8df](https://github.com/kestra-io/kestra/commit/b3ed3d8df))
- Add support for deleting empty namespace parent folders ([#5699](https://github.com/kestra-io/kestra/pull/5699))
- **ui:** Add status remapping to status component to match the real name of the CSS vars ([a8be084e7](https://github.com/kestra-io/kestra/commit/a8be084e7))
- **core:** Add outputs and ID to log shippers ([a994120d3](https://github.com/kestra-io/kestra/commit/a994120d3))
- **core-ee:** Remove pagination from fetchAsync and use logRecord attributes ([#6698](https://github.com/kestra-io/kestra/pull/6698))
- **core-ee:** Change log shipper properties names and use KV instead of state store ([#6709](https://github.com/kestra-io/kestra/pull/6709))
- **core:** Introduce an `finally` block on flow & flowable ([#6686](https://github.com/kestra-io/kestra/pull/6686))
- **webserver, ui:** Avoid cancelled SSE connection from following exec ([717d5560a](https://github.com/kestra-io/kestra/commit/717d5560a))
- **ui:** Introduce the revamped no code editor ([#6787](https://github.com/kestra-io/kestra/pull/6787))
- Add a story for executions list ([#6784](https://github.com/kestra-io/kestra/pull/6784))
- **ui:** Allow exporting the flow to yaml file ([#6610](https://github.com/kestra-io/kestra/pull/6610))
- **ui:** Improvements of no code editor ([#6804](https://github.com/kestra-io/kestra/pull/6804))
- Various design fixes asked by nico ([#6798](https://github.com/kestra-io/kestra/pull/6798))
- **core:** Validate in editor if subflow with namespace present ([#6717](https://github.com/kestra-io/kestra/pull/6717))
- **core:** Add a randomPort pebble function ([4d074cb05](https://github.com/kestra-io/kestra/commit/4d074cb05))
- **tasks:** Introduce an Assert tasks ([4d4963abd](https://github.com/kestra-io/kestra/commit/4d4963abd))
- **core:** Schema title annotation for Custom Dashboard Filter ([c337d5527](https://github.com/kestra-io/kestra/commit/c337d5527))
- Export oss chunks of vite config ([b542dda8e](https://github.com/kestra-io/kestra/commit/b542dda8e))
- Simplify logs chunks by packaging markdown ([306d4ecd7](https://github.com/kestra-io/kestra/commit/306d4ecd7))
- **ui:** Improvements of no code editor ([#6876](https://github.com/kestra-io/kestra/pull/6876))
- ***:** OpenTelemetry traces ([e87b97a2e](https://github.com/kestra-io/kestra/commit/e87b97a2e))
- **ui:** Re-work the task array field for the no code editor ([#6885](https://github.com/kestra-io/kestra/pull/6885))
- **ui:** New plugin doc redesign ([1b0ce4d6a](https://github.com/kestra-io/kestra/commit/1b0ce4d6a))
- Add support for multiple blueprint kinds ([ad719a97f](https://github.com/kestra-io/kestra/commit/ad719a97f))
- **ui:** Make the one of component work properly ([#6900](https://github.com/kestra-io/kestra/pull/6900))
- **ui:** Add the ability to remove tasks and other items ([#6902](https://github.com/kestra-io/kestra/pull/6902))
- **ui:** Improve the one of task section ([#6903](https://github.com/kestra-io/kestra/pull/6903))
- **ui:** New gantt layout to display taskrun state & duration with also attempts one ([f08bd94d5](https://github.com/kestra-io/kestra/commit/f08bd94d5))
- **ui:** Improvements of no code editor ([#6916](https://github.com/kestra-io/kestra/pull/6916))
- **ui:** Multiple improvements of no code editor ([#6923](https://github.com/kestra-io/kestra/pull/6923))
- **ui:** Improve custom dashboard access ([#6940](https://github.com/kestra-io/kestra/pull/6940))
- **ui:** New 404 page layout ([36675d90f](https://github.com/kestra-io/kestra/commit/36675d90f))
- **core:** Add system.restarted: true label when changing the status of a task ([4f2d35fc4](https://github.com/kestra-io/kestra/commit/4f2d35fc4))
- **ui, webserver:** Rename "Change status" to "Change state" and enhance the infos ([4e3ed33a4](https://github.com/kestra-io/kestra/commit/4e3ed33a4))
- **core, jdbc:** Change the state of a subflow restart parent execution ([7cf495581](https://github.com/kestra-io/kestra/commit/7cf495581))
- **ui:** Pretty layout for status on filters ([0a93b10a7](https://github.com/kestra-io/kestra/commit/0a93b10a7))
- **ui:** Multiple improvements of no code editor ([#6951](https://github.com/kestra-io/kestra/pull/6951))
- **ui:** Make DashboardEdit.vue overrided components ([#6954](https://github.com/kestra-io/kestra/pull/6954))
- **ui:** Multiple improvements of no code editor ([#6981](https://github.com/kestra-io/kestra/pull/6981))
- **core:** Rename WaitFor task to LoopUntil ([#6978](https://github.com/kestra-io/kestra/pull/6978))
- **ui:** Don't load all revisions, optimize unnecessary calls and add back query params upon changing revisions ([69b5093d6](https://github.com/kestra-io/kestra/commit/69b5093d6))
- **ui:** Design change on dashboard creation ([#6984](https://github.com/kestra-io/kestra/pull/6984))
- **ui:** Better empty chart view + default view to documentation ([5f8a45305](https://github.com/kestra-io/kestra/commit/5f8a45305))
- **deps:** Add support for OpenTelemetry metrics ([32112d2ff](https://github.com/kestra-io/kestra/commit/32112d2ff))
- **ui:** Multiple improvements of no code editor ([#6991](https://github.com/kestra-io/kestra/pull/6991))
- Add demo page for EE only features ([#7003](https://github.com/kestra-io/kestra/pull/7003))
- **ui:** Add quick theme switcher ([3194a8926](https://github.com/kestra-io/kestra/commit/3194a8926))
- Add enterprise edition empty to flow edition audit logs ([4375dc387](https://github.com/kestra-io/kestra/commit/4375dc387))
- Add gradient animation on enterprise edition ([966b8fb3a](https://github.com/kestra-io/kestra/commit/966b8fb3a))
- **ui:** Multiple improvements of no code editor ([#7028](https://github.com/kestra-io/kestra/pull/7028))
- **core:** Remove deprecated properties and reduce duplication ([afabdf883](https://github.com/kestra-io/kestra/commit/afabdf883))
- **ui:** Added Dashboards icons ([0661899e4](https://github.com/kestra-io/kestra/commit/0661899e4))
- **ui:** Don't show deprecated tasks in the plugins list ([ab796dff9](https://github.com/kestra-io/kestra/commit/ab796dff9))
- **webserver:** If no date provided for dashboard, then use default timewindow ([efa2d44e7](https://github.com/kestra-io/kestra/commit/efa2d44e7))
- **ui:** Multiple improvements of no code editor ([#7076](https://github.com/kestra-io/kestra/pull/7076))
- **ui:** Improve the task array component ([#7095](https://github.com/kestra-io/kestra/pull/7095))
- **ui:** Allow task re-ordering from no code editor ([#7120](https://github.com/kestra-io/kestra/pull/7120))
- **ui:** Add finally block to no code editor ([#7123](https://github.com/kestra-io/kestra/pull/7123))
- **ui:** Multiple improvements of no code editor ([#7146](https://github.com/kestra-io/kestra/pull/7146))

### 🩹 Fixes

- **core:** Possible NPE when the Executor didn't have the flow ([0f2c5bb57](https://github.com/kestra-io/kestra/commit/0f2c5bb57))
- **core:** Possible NPE when the Executor didn't have the flow ([2e9a0d132](https://github.com/kestra-io/kestra/commit/2e9a0d132))
- **docs:** Keep use in docs sidebar when clicking in TOC page ([#6262](https://github.com/kestra-io/kestra/pull/6262))
- **test:** Add metadata assertion to storage listing ([6dbdfad9c](https://github.com/kestra-io/kestra/commit/6dbdfad9c))
- **ui:** Improve debug outputs expression on initial load ([#6094](https://github.com/kestra-io/kestra/pull/6094))
- **ui:** Generalize filter width across browsers ([#5980](https://github.com/kestra-io/kestra/pull/5980))
- **jdbc:** Possible race when initializing the JdbcMapper ([91dd6170f](https://github.com/kestra-io/kestra/commit/91dd6170f))
- **core:** Correctly parse Content-Disposition in the Download task ([973ba0342](https://github.com/kestra-io/kestra/commit/973ba0342))
- **core, webserver:** Properly close the queue on Flux.onFinally ([348547268](https://github.com/kestra-io/kestra/commit/348547268))
- **ui:** Properly filter flows in namespace tab ([#6046](https://github.com/kestra-io/kestra/pull/6046))
- **ui:** Handle logs selector overflow in a good manner ([#6224](https://github.com/kestra-io/kestra/pull/6224))
- Rollback router update ([f02cf1f51](https://github.com/kestra-io/kestra/commit/f02cf1f51))
- **core:** Fix Pause property annotation, exclude Input subtypes from definitions ([#6265](https://github.com/kestra-io/kestra/pull/6265))
- **core:** Copy the list to avoid concurrent modification exception in count ([9cb1e5d46](https://github.com/kestra-io/kestra/commit/9cb1e5d46))
- **ui:** Only apply editor padding on main editor ([#6310](https://github.com/kestra-io/kestra/pull/6310))
- **ui:** Filter out system labels from executing using prefill ([#6311](https://github.com/kestra-io/kestra/pull/6311))
- **webserver:** Automatically handle trailing slash in delete endpoint for namespace files ([#6266](https://github.com/kestra-io/kestra/pull/6266))
- **docs:** Table formatting ([13fe55dc9](https://github.com/kestra-io/kestra/commit/13fe55dc9))
- **ui:** Show status label in dialog for changing execution status ([#6323](https://github.com/kestra-io/kestra/pull/6323))
- **ui:** Properly handle pebble expression if it contains dash character ([#6062](https://github.com/kestra-io/kestra/pull/6062))
- **core:** Fix potential NPE in AbstractServiceLivenessCoordinator ([85a22bcfa](https://github.com/kestra-io/kestra/commit/85a22bcfa))
- **jdbc:** Topology was built across all tenants ([21bf09df1](https://github.com/kestra-io/kestra/commit/21bf09df1))
- **ui:** Axios missing content type ([525fcf6b7](https://github.com/kestra-io/kestra/commit/525fcf6b7))
- **core:** Catch errors on task run ([8a26e3745](https://github.com/kestra-io/kestra/commit/8a26e3745))
- **ui:** Make sure that property exists ([948347ace](https://github.com/kestra-io/kestra/commit/948347ace))
- **core:** Fix cannot create Metric from null in Worker class ([6c6f072c2](https://github.com/kestra-io/kestra/commit/6c6f072c2))
- **ui:** Properly handle filename with multiple dots in editor sidebar ([#6362](https://github.com/kestra-io/kestra/pull/6362))
- **ui:** Prevent undefined on triggers that don't have sources anymore ([34c4ece23](https://github.com/kestra-io/kestra/commit/34c4ece23))
- **tests:** Select file for metadata checks in list() test ([db41d81f6](https://github.com/kestra-io/kestra/commit/db41d81f6))
- **jdbc:** Don't delete from the queues table ([fe6d6c85b](https://github.com/kestra-io/kestra/commit/fe6d6c85b))
- **core:** Ensure child-first strategy for plugin class loading ([#4621](https://github.com/kestra-io/kestra/pull/4621))
- Add typescript tsconfig ([#6316](https://github.com/kestra-io/kestra/pull/6316))
- **ui:** Pass flow revision on execution overview ([#6380](https://github.com/kestra-io/kestra/pull/6380))
- **core:** Exclude reactivestreams from classloading isolation ([#4621](https://github.com/kestra-io/kestra/pull/4621))
- **core:** Exclude common libs from classloading isolation ([#4621](https://github.com/kestra-io/kestra/pull/4621))
- **ui:** Add Nuxt alias + bump some deps in package-lock.json ([d98488526](https://github.com/kestra-io/kestra/commit/d98488526))
- Deprecated condition ([200cedaca](https://github.com/kestra-io/kestra/commit/200cedaca))
- **ui:** Flow create was no longer generating graph ([99227a644](https://github.com/kestra-io/kestra/commit/99227a644))
- **ui:** Total is not needed in FlowCreate.vue ([495f2cd39](https://github.com/kestra-io/kestra/commit/495f2cd39))
- **ui:** Avoid unsaved changes pop-up upon clicking on plugin property type definition anchors ([88bb0748d](https://github.com/kestra-io/kestra/commit/88bb0748d))
- Required Boolean & Multiselect rules ([#6445](https://github.com/kestra-io/kestra/pull/6445))
- Avoid redirect loops when axios calls an unauthorized API ([#6450](https://github.com/kestra-io/kestra/pull/6450))
- **tests:** Load only required flows for runner tests ([#6447](https://github.com/kestra-io/kestra/pull/6447))
- **core-ee:** Change Objects.equals for tenant id to prevent NPE ([#6411](https://github.com/kestra-io/kestra/pull/6411))
- **tests:** Remove merge namespace mistake ([870a3217e](https://github.com/kestra-io/kestra/commit/870a3217e))
- **core:** Exclude def.failsafe from classloading isolation ([#4621](https://github.com/kestra-io/kestra/pull/4621))
- **core:** Wait for running executor for liveness executor ([89ccdfc77](https://github.com/kestra-io/kestra/commit/89ccdfc77))
- **webserver:** TriggerController endpoint issues ([9238b5600](https://github.com/kestra-io/kestra/commit/9238b5600))
- **jdbc:** Missing SKIPPED state in DB migrations ([#6487](https://github.com/kestra-io/kestra/pull/6487))
- **core:** Handle input & output with id of 1 chars ([73026d064](https://github.com/kestra-io/kestra/commit/73026d064))
- **jdbc-postgres:** Escape special chars on full text search ([506460635](https://github.com/kestra-io/kestra/commit/506460635))
- **core:** Properly check next scheduled date for backfill execution ([#6413](https://github.com/kestra-io/kestra/pull/6413))
- **ui:** Put 0.0.0 version in package.json as we don't update it and rely on gradle.properties version instead ([a1f1987d7](https://github.com/kestra-io/kestra/commit/a1f1987d7))
- **core:** Save flowable's output when flowable is child of another flowable ([#6500](https://github.com/kestra-io/kestra/pull/6500))
- **webserver:** Correct the triger find endpoint URL ([556fabc3a](https://github.com/kestra-io/kestra/commit/556fabc3a))
- **jdbc:** Read the disabled flag from the DB ([01e6d529f](https://github.com/kestra-io/kestra/commit/01e6d529f))
- Add missing mutation when loading plugin doc form cache ([#6502](https://github.com/kestra-io/kestra/pull/6502))
- **core:** Remove race condition on trigger runner test ([#6516](https://github.com/kestra-io/kestra/pull/6516))
- **run:** Add LD_PRELOAD to handle duckdb/rocksdb libc conflict ([0ab4b6d10](https://github.com/kestra-io/kestra/commit/0ab4b6d10))
- Subflow docs ([7a8d2aeb9](https://github.com/kestra-io/kestra/commit/7a8d2aeb9))
- **webserver:** Rework tests in order to load only required flows ([#6517](https://github.com/kestra-io/kestra/pull/6517))
- **ui:** If no trigger state filter is selected, show them all ([#6522](https://github.com/kestra-io/kestra/pull/6522))
- **core:** Existing ns based on KV and not only flows ([f550fde76](https://github.com/kestra-io/kestra/commit/f550fde76))
- **runner-kafka:** Interface contract of template test changed ([#6536](https://github.com/kestra-io/kestra/pull/6536))
- **ui:** Only silence the necessary sass warnings ([edb7f5443](https://github.com/kestra-io/kestra/commit/edb7f5443))
- **ui:** Improve namespaces filtering ([#6564](https://github.com/kestra-io/kestra/pull/6564))
- **core:** Enable runIf property on flowable tasks ([462c50562](https://github.com/kestra-io/kestra/commit/462c50562))
- **core:** Better method when looking for 'value' prop in a JsonNode for auditLog patch application ([#6569](https://github.com/kestra-io/kestra/pull/6569))
- **ui:** Add check for property existence ([5da044c80](https://github.com/kestra-io/kestra/commit/5da044c80))
- Update package json again to fix storybook tests ([7b4b90581](https://github.com/kestra-io/kestra/commit/7b4b90581))
- **core:** Killing paused without subtask should transition to KILLED ([a9ff469f7](https://github.com/kestra-io/kestra/commit/a9ff469f7))
- **core:** Configuration of log on the http client ([5fee07e76](https://github.com/kestra-io/kestra/commit/5fee07e76))
- **core:** Handle http auth ([a33f85bf1](https://github.com/kestra-io/kestra/commit/a33f85bf1))
- **core:** Fix download http tasks ([153d4ced9](https://github.com/kestra-io/kestra/commit/153d4ced9))
- **core:** Restore deprecated on the ui for http task ([73b68294c](https://github.com/kestra-io/kestra/commit/73b68294c))
- **core:** Make http client creation explicit ([4a5f46132](https://github.com/kestra-io/kestra/commit/4a5f46132))
- **deps:** Include httpcore5 in platform deps ([88709a2db](https://github.com/kestra-io/kestra/commit/88709a2db))
- **cicd:** Don't build docker image & maven if failed test ([9ebf2ac75](https://github.com/kestra-io/kestra/commit/9ebf2ac75))
- **jdbc:** Avoid duplicating the source when deleting the flow ([44f363911](https://github.com/kestra-io/kestra/commit/44f363911))
- **storage-local:** Path traversal guard should include File.separator ([b7f9a3201](https://github.com/kestra-io/kestra/commit/b7f9a3201))
- **core:** ExitTest is flaky ([409d78615](https://github.com/kestra-io/kestra/commit/409d78615))
- Fixes on select boxes ([68646b07a](https://github.com/kestra-io/kestra/commit/68646b07a))
- Alert colors and place of figma theme ([5bec2fc06](https://github.com/kestra-io/kestra/commit/5bec2fc06))
- Select multiple choices icon color an shape ([50a9f6132](https://github.com/kestra-io/kestra/commit/50a9f6132))
- Element alert background ([e1987ed2e](https://github.com/kestra-io/kestra/commit/e1987ed2e))
- **core:** Path traversal guard ([f12a0a054](https://github.com/kestra-io/kestra/commit/f12a0a054))
- **core:** Multiple conditon tests are flaky ([eaa72dde4](https://github.com/kestra-io/kestra/commit/eaa72dde4))
- More fixes on css variables ([e1c202a3c](https://github.com/kestra-io/kestra/commit/e1c202a3c))
- Finish the overload of buttons ([0cdc6f062](https://github.com/kestra-io/kestra/commit/0cdc6f062))
- Add proper typing for vuex ([73c100ce1](https://github.com/kestra-io/kestra/commit/73c100ce1))
- **core:** Http proxy was not used ([d67d44b93](https://github.com/kestra-io/kestra/commit/d67d44b93))
- Set the flowEditor docId on new ([869c6877b](https://github.com/kestra-io/kestra/commit/869c6877b))
- **core:** Correctly displayed errors icons ([#6654](https://github.com/kestra-io/kestra/pull/6654))
- **core:** Worker log are displaying the wrong state on terminated tasks ([f2a3ad557](https://github.com/kestra-io/kestra/commit/f2a3ad557))
- **webserver:** Reset correctly nextExecutionDate when enabling schedule ([35ffe7e63](https://github.com/kestra-io/kestra/commit/35ffe7e63))
- Fix no execution layout ([155f9b9d7](https://github.com/kestra-io/kestra/commit/155f9b9d7))
- **ui:** Update CSS variable for log icon color in LogLine component ([e09e21633](https://github.com/kestra-io/kestra/commit/e09e21633))
- Logline when there is a {{ ([86cb11fb8](https://github.com/kestra-io/kestra/commit/86cb11fb8))
- **core:** Continue WaitFor loop if tasks are not failed ([#6572](https://github.com/kestra-io/kestra/pull/6572))
- **core:** Handle runIf inside workingDirectory ([#6690](https://github.com/kestra-io/kestra/pull/6690))
- **core:** Plugin default was not validating correctly boolean methods ([841f32a9f](https://github.com/kestra-io/kestra/commit/841f32a9f))
- **core:** NPE in ExecutableUtils ([#6699](https://github.com/kestra-io/kestra/pull/6699))
- ***:** Create real chart preview endpoint ([3c19c910a](https://github.com/kestra-io/kestra/commit/3c19c910a))
- **jdbc:** Resubmitting a worker job running should create a new attempt ([b9a74b875](https://github.com/kestra-io/kestra/commit/b9a74b875))
- **core:** If with only disabled tasks ([1c705e2d7](https://github.com/kestra-io/kestra/commit/1c705e2d7))
- **ui:** Fix reset of flow import input ([159927d39](https://github.com/kestra-io/kestra/commit/159927d39))
- Improve storybook styles ([6691575fa](https://github.com/kestra-io/kestra/commit/6691575fa))
- Async docs were failing beause of issue in ui-libs MDC ([e4698b0f1](https://github.com/kestra-io/kestra/commit/e4698b0f1))
- Storybook - only i18nize once in preview ([55b672033](https://github.com/kestra-io/kestra/commit/55b672033))
- **jdbc:** Batch query expand query and lead to overflow of metrics ([c73305921](https://github.com/kestra-io/kestra/commit/c73305921))
- **core, ui:** Send a "start" event to be sure the UI receive the SSE ([0c0ff37c6](https://github.com/kestra-io/kestra/commit/0c0ff37c6))
- **core:** Always close the queue after receive ([f217d3376](https://github.com/kestra-io/kestra/commit/f217d3376))
- **core:** Graph on dag are not attaching finally at the end of the dag task ([e98543822](https://github.com/kestra-io/kestra/commit/e98543822))
- **ui:** Missing icons for finally ([52aba32c1](https://github.com/kestra-io/kestra/commit/52aba32c1))
- Allow custom translations to be passed ([#6752](https://github.com/kestra-io/kestra/pull/6752))
- **jdbc:** Ensure JdbcIndexer is only closed once ([94545fe2f](https://github.com/kestra-io/kestra/commit/94545fe2f))
- **core:** Remove 64 characters limitation for displayName ([#6470](https://github.com/kestra-io/kestra/pull/6470))
- **jdbc:** Update test config for flaky test on liveness ([#6656](https://github.com/kestra-io/kestra/pull/6656))
- **core:** Parallel task should not resolved error and finally in parallel ([f1c147cc4](https://github.com/kestra-io/kestra/commit/f1c147cc4))
- **core:** Flow should not continue tasks when having a finally ([9f12f9a63](https://github.com/kestra-io/kestra/commit/9f12f9a63))
- Add ellipsis for Namespace charts ([#6730](https://github.com/kestra-io/kestra/pull/6730))
- Topology css issues ([4c6f8bd90](https://github.com/kestra-io/kestra/commit/4c6f8bd90))
- **core:** Property with default ([b2c411956](https://github.com/kestra-io/kestra/commit/b2c411956))
- **webserver:** Add check in file creation path for _flows* ([#6228](https://github.com/kestra-io/kestra/pull/6228))
- **ui:** Flows overview are not scoped to current flow ([554ea5850](https://github.com/kestra-io/kestra/commit/554ea5850))
- **jdbc:** Summary count should be a prefix on the namespace ([9a19c0108](https://github.com/kestra-io/kestra/commit/9a19c0108))
- Update custom upload button ([f5dc67f0e](https://github.com/kestra-io/kestra/commit/f5dc67f0e))
- El-empty needed a backdrop ([979c131b9](https://github.com/kestra-io/kestra/commit/979c131b9))
- **core:** ForEach failed with errors, finally and concurrency = 0 ([246602f9f](https://github.com/kestra-io/kestra/commit/246602f9f))
- Reduce log borders on gantt chart logs ([960a1bba4](https://github.com/kestra-io/kestra/commit/960a1bba4))
- **ui:** Properly encode text filter parameter to url string ([#6803](https://github.com/kestra-io/kestra/pull/6803))
- **ui:** Amend the ability to create tasks ([#6808](https://github.com/kestra-io/kestra/pull/6808))
- **ui:** Improve the editing of labels and variables ([#6810](https://github.com/kestra-io/kestra/pull/6810))
- **core:** Fix some labels are lost when having same prefix key ([207e8c3a7](https://github.com/kestra-io/kestra/commit/207e8c3a7))
- Color of active item in sidebar ([05e5af73a](https://github.com/kestra-io/kestra/commit/05e5af73a))
- Correct the description for DayWeek condition ([#6834](https://github.com/kestra-io/kestra/pull/6834))
- **core:** Deprecated allowFailed should not have any default ([02831295b](https://github.com/kestra-io/kestra/commit/02831295b))
- **sidebar:** Implement the _hover class in addition to hover pseudo class ([7e926fc8e](https://github.com/kestra-io/kestra/commit/7e926fc8e))
- **core:** Avoid double STRING schema type for types that resolves to a String ([1a130daa2](https://github.com/kestra-io/kestra/commit/1a130daa2))
- Correct the condition name ([#6843](https://github.com/kestra-io/kestra/pull/6843))
- **core:** RandomInt receive a Long not an Integer ([01a77aff0](https://github.com/kestra-io/kestra/commit/01a77aff0))
- Update the vite config to use the rollup dependencies properly ([#6853](https://github.com/kestra-io/kestra/pull/6853))
- **Count:** Fix Count task ([db496a8fa](https://github.com/kestra-io/kestra/commit/db496a8fa))
- Logs page redirect ([40c43256a](https://github.com/kestra-io/kestra/commit/40c43256a))
- **core:** FromIon is reading only the first rows by default, adding a parameter to read all rows ([1926ad5e0](https://github.com/kestra-io/kestra/commit/1926ad5e0))
- **ui:** Amend namespace editor problem ([#6883](https://github.com/kestra-io/kestra/pull/6883))
- Add title to TemplatedTask ([#6891](https://github.com/kestra-io/kestra/pull/6891))
- **ui:** Properly handle file explorer visibility in namespace files section ([#6895](https://github.com/kestra-io/kestra/pull/6895))
- **ui:** Fix multiple issues on blueprints ([2e18c295e](https://github.com/kestra-io/kestra/commit/2e18c295e))
- **ui:** Fix blueprints use button ([8e5ffe835](https://github.com/kestra-io/kestra/commit/8e5ffe835))
- **ui:** Amend flow concurrency overview ([0a047a7b7](https://github.com/kestra-io/kestra/commit/0a047a7b7))
- **webserver:** Continue to warn, but do not return trigger with missing flow ([#6905](https://github.com/kestra-io/kestra/pull/6905))
- **ui:** Prevent responsive on monaco editor for diff ([c99476276](https://github.com/kestra-io/kestra/commit/c99476276))
- **ui:** Fix use button for dashboard blueprint ([699e232dd](https://github.com/kestra-io/kestra/commit/699e232dd))
- **ui:** Add missing use button into blueprin details ([9781ff156](https://github.com/kestra-io/kestra/commit/9781ff156))
- **ui:** Make disabled select less visible ([fc84ee3e5](https://github.com/kestra-io/kestra/commit/fc84ee3e5))
- **ui:** Proper log display without multiple line ([a97448f19](https://github.com/kestra-io/kestra/commit/a97448f19))
- **ui:** Add confirmation message for crud on custom dashboard ([c795f3756](https://github.com/kestra-io/kestra/commit/c795f3756))
- **ui:** Rollouver on side menu was blinking ([ae2d55570](https://github.com/kestra-io/kestra/commit/ae2d55570))
- **ui:** Left menu is blinking on blueprint page ([6bc66d66e](https://github.com/kestra-io/kestra/commit/6bc66d66e))
- **ui:** Remove some warnings about missing props for blueprints ([fccaef462](https://github.com/kestra-io/kestra/commit/fccaef462))
- **ui:** More explicit else-if branches for switch view ([ae408209f](https://github.com/kestra-io/kestra/commit/ae408209f))
- **ui:** Cleanup imports and get rid of some warnings ([09ef11507](https://github.com/kestra-io/kestra/commit/09ef11507))
- **core:** Flow equalsWithoutRevision don't use serialization to compare flows so that map orders don't matter ([275951011](https://github.com/kestra-io/kestra/commit/275951011))
- **ui:** Save content to proper file using the namespace file editor ([#6931](https://github.com/kestra-io/kestra/pull/6931))
- **script:** Update release-plugins ([3073d9e92](https://github.com/kestra-io/kestra/commit/3073d9e92))
- **ui:** Invalid hover on left menu for white theme ([17e0340ab](https://github.com/kestra-io/kestra/commit/17e0340ab))
- Update ui-libs for docs ([2e23269a9](https://github.com/kestra-io/kestra/commit/2e23269a9))
- See all is-text button color closes #6898 ([#6898](https://github.com/kestra-io/kestra/issues/6898))
- Return task docs ([fedb388e5](https://github.com/kestra-io/kestra/commit/fedb388e5))
- **ui:** Namepsace > blueprint display 404 page ([4f96f8124](https://github.com/kestra-io/kestra/commit/4f96f8124))
- **core:** Fix unit test on DocumentationGeneratorTest ([f8ff2e020](https://github.com/kestra-io/kestra/commit/f8ff2e020))
- **webserver:** Ensure queues are not closed in nioEventLoop ([c52fdd064](https://github.com/kestra-io/kestra/commit/c52fdd064))
- **ui:** Let filter dropdown fit width of the content ([adb8d9a9d](https://github.com/kestra-io/kestra/commit/adb8d9a9d))
- **core, jdbc:** Count task ([2359c4f74](https://github.com/kestra-io/kestra/commit/2359c4f74))
- **ui:** Missing translations ([a1a1fbc31](https://github.com/kestra-io/kestra/commit/a1a1fbc31))
- **ui:** Remove dot from template ([e0e7bd132](https://github.com/kestra-io/kestra/commit/e0e7bd132))
- Dashboards in plural ([#6971](https://github.com/kestra-io/kestra/pull/6971))
- **core:** ThresholdFilter is now stricly lower ([bd82f5e3b](https://github.com/kestra-io/kestra/commit/bd82f5e3b))
- Use new color scheme for execution stats on flows list ([1c08176c9](https://github.com/kestra-io/kestra/commit/1c08176c9))
- **ui:** Taskrun filters and new charts ([f1c5555f6](https://github.com/kestra-io/kestra/commit/f1c5555f6))
- **ui:** Don't display max displayable since not relevant ([bcaa613f7](https://github.com/kestra-io/kestra/commit/bcaa613f7))
- **ui:** Better layout filters comparator ([125a277aa](https://github.com/kestra-io/kestra/commit/125a277aa))
- **ui:** Use color for log on custom charts ([5268c793e](https://github.com/kestra-io/kestra/commit/5268c793e))
- **core:** Generate properly taskrunners and log exporters implementations in json schema after adding generic types ([94e42a9dc](https://github.com/kestra-io/kestra/commit/94e42a9dc))
- **core:** Add log exporters to plugins ([16be38aaf](https://github.com/kestra-io/kestra/commit/16be38aaf))
- **ui:** Add log exporters to plugins ([0438fbff6](https://github.com/kestra-io/kestra/commit/0438fbff6))
- **ui:** Better filtering for yamlUtils.extractFieldFromMaps ([cf316eb83](https://github.com/kestra-io/kestra/commit/cf316eb83))
- **ui:** Missing image ([325c68094](https://github.com/kestra-io/kestra/commit/325c68094))
- **ui:** Rename cluster to instance ([41e4abba7](https://github.com/kestra-io/kestra/commit/41e4abba7))
- **ui:** Avoid monaco to show every words used as autocompletion when there is no suggestion ([fd4a51259](https://github.com/kestra-io/kestra/commit/fd4a51259))
- **core:** Reset the MDC when we clean the run context ([c9095bd87](https://github.com/kestra-io/kestra/commit/c9095bd87))
- **core:** Use DCL when creating the logger ([3640b0863](https://github.com/kestra-io/kestra/commit/3640b0863))
- **core:** Use the MDC from the loggin context ([151d4d9da](https://github.com/kestra-io/kestra/commit/151d4d9da))
- **ui:** Fix blueprints ([9d974ad84](https://github.com/kestra-io/kestra/commit/9d974ad84))
- **ui:** Handle light theme properly in plugin doc ([dc13e9117](https://github.com/kestra-io/kestra/commit/dc13e9117))
- **ui:** Better css with in editor doc for dashboard ([49d64b7f8](https://github.com/kestra-io/kestra/commit/49d64b7f8))
- **ui:** Better handling of plugin type to display in doc from editor ([7ec9f6c81](https://github.com/kestra-io/kestra/commit/7ec9f6c81))
- **ui:** Remove console.log() ([035f6b3b6](https://github.com/kestra-io/kestra/commit/035f6b3b6))
- **core:** Dashboard end date should apply to the execution start date ([82150e606](https://github.com/kestra-io/kestra/commit/82150e606))
- Ee empty pages background and add flare ([34247a971](https://github.com/kestra-io/kestra/commit/34247a971))
- Debouncing of input validation ([3a01a44b2](https://github.com/kestra-io/kestra/commit/3a01a44b2))
- **ui:** Easier gantt painting handling ([e4016ebb7](https://github.com/kestra-io/kestra/commit/e4016ebb7))
- Set docId for namespace demo ([48427f185](https://github.com/kestra-io/kestra/commit/48427f185))
- **core:** Add de app block to plugin controller (kestra-io/kestra-ee#2773) ([#2773](https://github.com/kestra-io/kestra/issues/2773))
- Align the flare regardless of language ([80d1f2d6c](https://github.com/kestra-io/kestra/commit/80d1f2d6c))
- **core:** Catch linkageError when a class in already in classpath ([#7029](https://github.com/kestra-io/kestra/pull/7029))
- **cli:** Doc generation failure handling to avoid infinite wait ([1a23df3a7](https://github.com/kestra-io/kestra/commit/1a23df3a7))
- Various fixes for the empty pages ([a10f65c1d](https://github.com/kestra-io/kestra/commit/a10f65c1d))
- Wrong title for apps page ([061e4f5ec](https://github.com/kestra-io/kestra/commit/061e4f5ec))
- **core:** Properties as map is now working properly with expression within base maps ([b846f11b3](https://github.com/kestra-io/kestra/commit/b846f11b3))
- **script:** InjectDefault need the runContext ([c5e7b4281](https://github.com/kestra-io/kestra/commit/c5e7b4281))
- **script:** TargetOS must be rendered ([3e8d32cfc](https://github.com/kestra-io/kestra/commit/3e8d32cfc))
- Realign vue tour ui element for onboarding closes #7010 ([#7010](https://github.com/kestra-io/kestra/issues/7010))
- **ui:** Better inputs validation for backfill ([95ea6536c](https://github.com/kestra-io/kestra/commit/95ea6536c))
- Label colors in executions list ([6dfa08af8](https://github.com/kestra-io/kestra/commit/6dfa08af8))
- **cli:** Flow watcher should compute plugin defaults ([2d98f909d](https://github.com/kestra-io/kestra/commit/2d98f909d))
- **ui:** Dynamic format date ([acdb46cea](https://github.com/kestra-io/kestra/commit/acdb46cea))
- **core:** RestartForEachItem() is flaky ([d12fbf05b](https://github.com/kestra-io/kestra/commit/d12fbf05b))
- **ui:** Amend no code editor breadcrumbs issue ([#7054](https://github.com/kestra-io/kestra/pull/7054))
- **script:** AbstractExecScript.injectDefaults should throw IllegalVariableEvaluationException ([c08f4f24c](https://github.com/kestra-io/kestra/commit/c08f4f24c))
- **cli:** Repeate flaky tests FileChangedEventListenerTest ([c792d9b6e](https://github.com/kestra-io/kestra/commit/c792d9b6e))
- **docs:** Remove custom dashboard website component ([5f7468a9a](https://github.com/kestra-io/kestra/commit/5f7468a9a))
- **core:** Subflow validation didn't work anymore ([ceda5eb8e](https://github.com/kestra-io/kestra/commit/ceda5eb8e))
- **core:** Subflow labels must not be overriden by parent flow ones ([d12dd179c](https://github.com/kestra-io/kestra/commit/d12dd179c))
- **core:** Retry flaky test TimeoutTest.timeout() ([95d2d1dfa](https://github.com/kestra-io/kestra/commit/95d2d1dfa))
- **ui:** Fix missing param kind for blueprint in flow editor ([#7087](https://github.com/kestra-io/kestra/pull/7087))
- **ci:** Update scripts/workflows for plugins ([2b72306b3](https://github.com/kestra-io/kestra/commit/2b72306b3))
- **ui:** Restore namespace filter manual typing & various improvements ([#7127](https://github.com/kestra-io/kestra/pull/7127))
- **core:** Remove the dynamic property patterns ([1ed882e8f](https://github.com/kestra-io/kestra/commit/1ed882e8f))
- **ui:** Switching from custom Flow blueprints tab to dashboard was not working ([3f2d91014](https://github.com/kestra-io/kestra/commit/3f2d91014))
- **ui:** Custom Dashboard name overflows. ([#7124](https://github.com/kestra-io/kestra/pull/7124))
- **ui:** Get the string fields in no code to use editor and have auto completion back ([#7150](https://github.com/kestra-io/kestra/pull/7150))
- Setup docId for blueprints ([39a2293a4](https://github.com/kestra-io/kestra/commit/39a2293a4))
- Sidemenu bring back the gray hover ([33ecf8d5f](https://github.com/kestra-io/kestra/commit/33ecf8d5f))
- Bring back hover in main menu ([cf4b91f44](https://github.com/kestra-io/kestra/commit/cf4b91f44))
- Enterprise edition tag in light mode ([cb3195900](https://github.com/kestra-io/kestra/commit/cb3195900))
- **core:** Process runner are not serialized correctly on worker ([4392c89ec](https://github.com/kestra-io/kestra/commit/4392c89ec))
- **ui:** Null-safe search filters ([a6ce86d70](https://github.com/kestra-io/kestra/commit/a6ce86d70))

### 💅 Refactors

- **ui:** Enforce block order in ESLint configuration ([#6299](https://github.com/kestra-io/kestra/pull/6299))
- Replace getCurrentInstance router access with useRouter ([#6210](https://github.com/kestra-io/kestra/pull/6210))
- **core:** Optimize keepLastVersionCollector method ([ff0b7c4a0](https://github.com/kestra-io/kestra/commit/ff0b7c4a0))
- **test:** Create an ExecutionUtils to load flow ([bfea840fa](https://github.com/kestra-io/kestra/commit/bfea840fa))
- **test:** Use application context from the current test suite on FlowLoad ([706764415](https://github.com/kestra-io/kestra/commit/706764415))
- **ui:** Move stories to tests/storybook ([#6515](https://github.com/kestra-io/kestra/pull/6515))
- Migrate AbstractExecScript, CommandsWrapper, NamespaceFiles, OutputFilesInterface to dynamic properties ([c6a09cd9d](https://github.com/kestra-io/kestra/commit/c6a09cd9d))
- Major css variable overhaul ([#6497](https://github.com/kestra-io/kestra/pull/6497))
- Removed unused css in sidebar ([20276a9e7](https://github.com/kestra-io/kestra/commit/20276a9e7))
- Remove spacer form sidebar ([035a27c91](https://github.com/kestra-io/kestra/commit/035a27c91))
- Remove bootstrap color from sidebar ([9b59c75d2](https://github.com/kestra-io/kestra/commit/9b59c75d2))
- **core:** Add new interface HasSource ([d96742d7d](https://github.com/kestra-io/kestra/commit/d96742d7d))
- **webserver:** Move method to read source file/archive to HasSource interface ([17120cff8](https://github.com/kestra-io/kestra/commit/17120cff8))
- Add async loading for better performance ([#6643](https://github.com/kestra-io/kestra/pull/6643))
- Migrate package plugin.core.http to dynamic properties ([a934414db](https://github.com/kestra-io/kestra/commit/a934414db))
- Add [at]deprecated javadoc message : sonar ([589638cc3](https://github.com/kestra-io/kestra/commit/589638cc3))
- Migrate package plugin.core.kv to dynamic properties ([d052a87c0](https://github.com/kestra-io/kestra/commit/d052a87c0))
- Address sonar issues ([f2e4a3531](https://github.com/kestra-io/kestra/commit/f2e4a3531))
- Migrate plugin.core.output to dynamic properties ([4de65e7a3](https://github.com/kestra-io/kestra/commit/4de65e7a3))
- Migrate package plugin.core.debug to dynamic properties ([#6697](https://github.com/kestra-io/kestra/pull/6697))
- Migrate package plugin.core.state to dynamic properties ([#6755](https://github.com/kestra-io/kestra/pull/6755))
- Migrate package plugin.core.storage to dynamic properties ([#6770](https://github.com/kestra-io/kestra/pull/6770))
- Migrate package plugin.core.templating to dynamic properties ([#6775](https://github.com/kestra-io/kestra/pull/6775))
- Avoid usage of runtime template to smaller bundle ([#6779](https://github.com/kestra-io/kestra/pull/6779))
- Migrate package plugin.core.execution to dynamic properties ([#6708](https://github.com/kestra-io/kestra/pull/6708))
- Migrate plugin.core.log to dynamic properties ([#6823](https://github.com/kestra-io/kestra/pull/6823))
- Migrate plugin.core.namespace to dynamic properties ([#6832](https://github.com/kestra-io/kestra/pull/6832))
- Migrate plugin.core.log to dynamic properties ([#6732](https://github.com/kestra-io/kestra/pull/6732))

### 📖 Documentation

- Context docs appId basic setup ([#6341](https://github.com/kestra-io/kestra/pull/6341))
- Make windows instructions more specific ([7cdc04029](https://github.com/kestra-io/kestra/commit/7cdc04029))
- Conditional inputs and outputs ([2594f2816](https://github.com/kestra-io/kestra/commit/2594f2816))
- Add more keyboard shortcuts ([0f23d3382](https://github.com/kestra-io/kestra/commit/0f23d3382))
- Add nested loop example ([#6948](https://github.com/kestra-io/kestra/pull/6948))
- **custom-dashboard:** Update example to use metrics and logs ([#7007](https://github.com/kestra-io/kestra/pull/7007))

### 📦 Build

- Setup storybook for development in isolation ([#6499](https://github.com/kestra-io/kestra/pull/6499))
- **ci:** Allow docker-build when skipping tests ([729972fd1](https://github.com/kestra-io/kestra/commit/729972fd1))
- Use husky instead of ghooks ([dba5c39de](https://github.com/kestra-io/kestra/commit/dba5c39de))
- Attempt to fix storybook tests swc issue ([0cc5fb964](https://github.com/kestra-io/kestra/commit/0cc5fb964))
- Fix storybook tests ([5f7695e3e](https://github.com/kestra-io/kestra/commit/5f7695e3e))
- Add new project properties for release ([d79e40dd9](https://github.com/kestra-io/kestra/commit/d79e40dd9))
- Add script and github workflow to tag all plugins ([64dcc9649](https://github.com/kestra-io/kestra/commit/64dcc9649))
- Try and fix FE CI ([f3852a3c2](https://github.com/kestra-io/kestra/commit/f3852a3c2))
- Prevent corepack crash ([f609d57a0](https://github.com/kestra-io/kestra/commit/f609d57a0))

### 🏡 Chores

- **version:** Update to version 'v0.20.0'. ([279be8344](https://github.com/kestra-io/kestra/commit/279be8344))
- **version:** Update snapshot version 'v0.21.0-SNAPSHOT'. ([fba4a7929](https://github.com/kestra-io/kestra/commit/fba4a7929))
- **version:** Update to version 'v0.20.0'. ([aa1ba5998](https://github.com/kestra-io/kestra/commit/aa1ba5998))
- **ui:** Properly highlight selected options in all of the filter dropdowns ([#6173](https://github.com/kestra-io/kestra/pull/6173))
- **ui:** Add top and left padding to editor component ([#6191](https://github.com/kestra-io/kestra/pull/6191))
- **ui:** Add a confirmation dialog before removing a bookmark ([#6217](https://github.com/kestra-io/kestra/pull/6217))
- **translations:** Auto generate values for languages other than english ([02898d29a](https://github.com/kestra-io/kestra/commit/02898d29a))
- **ui:** Remove search field background on single plugin page ([#6220](https://github.com/kestra-io/kestra/pull/6220))
- **ui:** Amend spacing on plugins page ([#6223](https://github.com/kestra-io/kestra/pull/6223))
- **core:** Avoid using applicationContext.init() in the RunContext ([fb9691d67](https://github.com/kestra-io/kestra/commit/fb9691d67))
- **core:** Remove deprecated RunContext.render(Property) methods ([e16505269](https://github.com/kestra-io/kestra/commit/e16505269))
- **ci:** Add workflow to release all plugins ([5330aa0e8](https://github.com/kestra-io/kestra/commit/5330aa0e8))
- **ui:** Improvement in Welcome Page. ([#6077](https://github.com/kestra-io/kestra/pull/6077))
- **translations:** Auto generate values for languages other than english ([7171c5697](https://github.com/kestra-io/kestra/commit/7171c5697))
- **ui:** Amend tags design on blueprints section ([#6229](https://github.com/kestra-io/kestra/pull/6229))
- **ui:** Automatically add namespace filter where needed ([#6296](https://github.com/kestra-io/kestra/pull/6296))
- **ui:** Make confirmation dialogs properly render markdown content ([#5986](https://github.com/kestra-io/kestra/pull/5986))
- **ui:** Initial work on debug expression sidebar resizing on outputs page ([#5878](https://github.com/kestra-io/kestra/pull/5878))
- **ui:** Initial work on output icons issue ([#5746](https://github.com/kestra-io/kestra/pull/5746))
- Upgrade vue-router to 4.5.0 ([#6298](https://github.com/kestra-io/kestra/pull/6298))
- **ui:** Remove default editor outline ([#6303](https://github.com/kestra-io/kestra/pull/6303))
- **ui:** Uniform the height of cards on main dashboard ([#6213](https://github.com/kestra-io/kestra/pull/6213))
- **ui:** Clean up of welcome page usage of markdown files ([#6315](https://github.com/kestra-io/kestra/pull/6315))
- **translations:** Auto generate values for languages other than english ([b63c2361c](https://github.com/kestra-io/kestra/commit/b63c2361c))
- **ui:** Uniform log line buttons styling ([#6254](https://github.com/kestra-io/kestra/pull/6254))
- **core:** Remove Flow source auto-generation ([985a10610](https://github.com/kestra-io/kestra/commit/985a10610))
- **translations:** Align keys with english ([#6324](https://github.com/kestra-io/kestra/pull/6324))
- **ui:** Add tooltips for filter section buttons ([#5942](https://github.com/kestra-io/kestra/pull/5942))
- **ui:** Improve bulk actions design in the executions listing ([#6240](https://github.com/kestra-io/kestra/pull/6240))
- **ui:** Add scrolling to totals chart legend if more than 4 items present ([#5971](https://github.com/kestra-io/kestra/pull/5971))
- **ui:** Respect date format form setting inside filter label ([#6335](https://github.com/kestra-io/kestra/pull/6335))
- **ui:** Prevent text wrap inside trigger id column ([#6336](https://github.com/kestra-io/kestra/pull/6336))
- **ui:** Vertically center content in flows table rows ([#6330](https://github.com/kestra-io/kestra/pull/6330))
- **ui:** Improve the styling of boolean buttons on inputs form ([#6055](https://github.com/kestra-io/kestra/pull/6055))
- **ui:** Initial work on improving display of topology ([#5606](https://github.com/kestra-io/kestra/pull/5606))
- **jdbc:** Remove not used method ([6a953d194](https://github.com/kestra-io/kestra/commit/6a953d194))
- **ui:** Remove unused files ([#6348](https://github.com/kestra-io/kestra/pull/6348))
- **ui:** Improve text label in filter bar ([#6350](https://github.com/kestra-io/kestra/pull/6350))
- **ci:** Remove generation of latest-full tag ([6bb521f4e](https://github.com/kestra-io/kestra/commit/6bb521f4e))
- **core:** Add unit test for if nested in parallel ([c6a7c1270](https://github.com/kestra-io/kestra/commit/c6a7c1270))
- **ui:** Amend font size in tables ([#6363](https://github.com/kestra-io/kestra/pull/6363))
- **ui:** Prevent opening flow trigger details on row double click ([#6354](https://github.com/kestra-io/kestra/pull/6354))
- ***:** Bump node version used in project ([#6327](https://github.com/kestra-io/kestra/pull/6327))
- **docs:** Switch link to good first issues in readme file ([a78566fc5](https://github.com/kestra-io/kestra/commit/a78566fc5))
- **core:** Avoid serialzing the value multiple time ([3cd0c7fbe](https://github.com/kestra-io/kestra/commit/3cd0c7fbe))
- **ui:** Respect system theme for editor ([#6376](https://github.com/kestra-io/kestra/pull/6376))
- **ui:** Amend description color of system namespace ([#6382](https://github.com/kestra-io/kestra/pull/6382))
- **ui:** Temporarily disable filters bar highlighting ([e9be78947](https://github.com/kestra-io/kestra/commit/e9be78947))
- **translations:** Auto generate values for languages other than english ([3ddfe5e8d](https://github.com/kestra-io/kestra/commit/3ddfe5e8d))
- **ui:** Amended the css for filter bar width ([e9033462c](https://github.com/kestra-io/kestra/commit/e9033462c))
- **translations:** Auto generate values for languages other than english ([c867db8ae](https://github.com/kestra-io/kestra/commit/c867db8ae))
- **translations:** Auto generate values for languages other than english ([41e64cc04](https://github.com/kestra-io/kestra/commit/41e64cc04))
- **ui:** Removing recent filter functionality ([#6420](https://github.com/kestra-io/kestra/pull/6420))
- **translations:** Auto generate values for languages other than english ([019097465](https://github.com/kestra-io/kestra/commit/019097465))
- **ui:** Improve filters expanding ([#6415](https://github.com/kestra-io/kestra/pull/6415))
- **ui:** Prevent applying same filter multiple times ([#6219](https://github.com/kestra-io/kestra/pull/6219))
- Update ESlint to v9 (next major) ([#6389](https://github.com/kestra-io/kestra/pull/6389))
- **deps-dev:** Bump typescript-eslint from 8.17.0 to 8.18.0 in /ui ([#6432](https://github.com/kestra-io/kestra/pull/6432))
- **ui:** Align with new version of linter ([2358bf43f](https://github.com/kestra-io/kestra/commit/2358bf43f))
- **core:** Refactor SecretService ([1267e9b02](https://github.com/kestra-io/kestra/commit/1267e9b02))
- **ui:** Amend filter selection ([25818878e](https://github.com/kestra-io/kestra/commit/25818878e))
- **translations:** Add missing keys ([3f104ae9b](https://github.com/kestra-io/kestra/commit/3f104ae9b))
- **translations:** Auto generate values for languages other than english ([909015467](https://github.com/kestra-io/kestra/commit/909015467))
- **ui:** Improve design of the flow overview page with no executions ([#6446](https://github.com/kestra-io/kestra/pull/6446))
- **translations:** Auto generate values for languages other than english ([aae4e6b93](https://github.com/kestra-io/kestra/commit/aae4e6b93))
- Exclude liveness/readiness health checks from access logs ([#6453](https://github.com/kestra-io/kestra/pull/6453))
- **ui:** Use global scope for translations throughout the product ([#6466](https://github.com/kestra-io/kestra/pull/6466))
- **ui:** Add clearable property to select fields on inputs form ([#6477](https://github.com/kestra-io/kestra/pull/6477))
- Avoid global constants (use window instead) ([#6478](https://github.com/kestra-io/kestra/pull/6478))
- **ui:** Rework the file structure in filters section ([#6452](https://github.com/kestra-io/kestra/pull/6452))
- **translations:** Auto generate values for languages other than english ([3fb12a66d](https://github.com/kestra-io/kestra/commit/3fb12a66d))
- **translations:** Handle filters key translation ([#6479](https://github.com/kestra-io/kestra/pull/6479))
- **ui:** Improve passing of props to filter component ([#6483](https://github.com/kestra-io/kestra/pull/6483))
- **translations:** Auto generate values for languages other than english ([c57984709](https://github.com/kestra-io/kestra/commit/c57984709))
- **ui:** Improve the styling of error component on executions overview ([#6465](https://github.com/kestra-io/kestra/pull/6465))
- **ui:** Autmatically open date picker if absolute date is selected as type ([#6484](https://github.com/kestra-io/kestra/pull/6484))
- **ui:** Amend scope lables on dasboard filters ([#6485](https://github.com/kestra-io/kestra/pull/6485))
- **ui:** Re-work same filter applying multiple times ([6f3aff146](https://github.com/kestra-io/kestra/commit/6f3aff146))
- **ui:** Make tab arrows hidden when there is no need for them ([#6486](https://github.com/kestra-io/kestra/pull/6486))
- **ui:** Complete the audit log filtering options ([#6496](https://github.com/kestra-io/kestra/pull/6496))
- **translations:** Auto generate values for languages other than english ([aa8588c3b](https://github.com/kestra-io/kestra/commit/aa8588c3b))
- **ui:** Improved filter usage throughout the product ([#6513](https://github.com/kestra-io/kestra/pull/6513))
- **translations:** Auto generate values for languages other than english ([cdc30080f](https://github.com/kestra-io/kestra/commit/cdc30080f))
- **ui:** Implement new filtering system where it was missing ([#6531](https://github.com/kestra-io/kestra/pull/6531))
- **translations:** Auto generate values for languages other than english ([5b6b501bc](https://github.com/kestra-io/kestra/commit/5b6b501bc))
- **ui:** Expand doughnut chart if there is no legend shown ([804c3b2d5](https://github.com/kestra-io/kestra/commit/804c3b2d5))
- **ui:** Make the entire row clickable on the gantt page ([#6539](https://github.com/kestra-io/kestra/pull/6539))
- **ui:** Improve behavior on changing theme or language ([#6520](https://github.com/kestra-io/kestra/pull/6520))
- **ui:** Lint code properly for ci to pass ([4a94b2237](https://github.com/kestra-io/kestra/commit/4a94b2237))
- **ui:** Rename flow editor tab to edit ([#6552](https://github.com/kestra-io/kestra/pull/6552))
- **ui:** Limit accepted file types for flow import ([#6550](https://github.com/kestra-io/kestra/pull/6550))
- **ui:** Improvement to blueprints inside flow editor tab ([#6548](https://github.com/kestra-io/kestra/pull/6548))
- **ui:** Executions in progress link is taking proper filters into account ([#6556](https://github.com/kestra-io/kestra/pull/6556))
- **ui:** Show artwork on flow triggers page instead of locking it ([#6555](https://github.com/kestra-io/kestra/pull/6555))
- **translations:** Auto generate values for languages other than english ([f0a15cdae](https://github.com/kestra-io/kestra/commit/f0a15cdae))
- **ui:** Handle creation of nested folders properly ([#6554](https://github.com/kestra-io/kestra/pull/6554))
- **ui:** Prevent adding filter parameters if decode prop is passed as false ([#6563](https://github.com/kestra-io/kestra/pull/6563))
- **ui:** Replace language right after saving changes ([#6566](https://github.com/kestra-io/kestra/pull/6566))
- **ui:** Prevent display of file helpers if there is no file ([#6568](https://github.com/kestra-io/kestra/pull/6568))
- **ui:** Tweak font size for tag component ([8357e0e23](https://github.com/kestra-io/kestra/commit/8357e0e23))
- **ui:** Introduce new filter bar on namespace kv page ([#6570](https://github.com/kestra-io/kestra/pull/6570))
- **ui:** Prevent ability to add multiple filters on second try ([#6573](https://github.com/kestra-io/kestra/pull/6573))
- **ui:** Always show flow revision column on executions listing ([807a44d18](https://github.com/kestra-io/kestra/commit/807a44d18))
- **ui:** Introduce horizontal scroll to cascader items ([96d8239b5](https://github.com/kestra-io/kestra/commit/96d8239b5))
- **ui:** Add limit to environment name length ([#6597](https://github.com/kestra-io/kestra/pull/6597))
- **ui:** Add a horizontal scroll bar to editor file tree ([#6598](https://github.com/kestra-io/kestra/pull/6598))
- **translations:** Auto generate values for languages other than english ([27f1430ff](https://github.com/kestra-io/kestra/commit/27f1430ff))
- **ui:** Add header title for column on triggers page ([#6608](https://github.com/kestra-io/kestra/pull/6608))
- **tasks:** Improve unit test of http tasks ([9e643dcc4](https://github.com/kestra-io/kestra/commit/9e643dcc4))
- **core:** Tiny perf improvement in MapUtils.merge() ([92ff55751](https://github.com/kestra-io/kestra/commit/92ff55751))
- **build:** Increase Gradle memory limits ([2307b2452](https://github.com/kestra-io/kestra/commit/2307b2452))
- **translations:** Auto generate values for languages other than english ([4dbf938de](https://github.com/kestra-io/kestra/commit/4dbf938de))
- **core:** Move builder default on TableColumnDescriptor ([4fa6adc9c](https://github.com/kestra-io/kestra/commit/4fa6adc9c))
- **test:** Minor pebble error ([47d2b0938](https://github.com/kestra-io/kestra/commit/47d2b0938))
- **translations:** Auto generate values for languages other than english ([a1238a947](https://github.com/kestra-io/kestra/commit/a1238a947))
- **translations:** Auto generate values for languages other than english ([4e543a29c](https://github.com/kestra-io/kestra/commit/4e543a29c))
- **ui:** Add utility method extratFileNameFromContentDisposition ([16a7e06c5](https://github.com/kestra-io/kestra/commit/16a7e06c5))
- Remove an unwanted comment ([2a56ba88c](https://github.com/kestra-io/kestra/commit/2a56ba88c))
- **docs:** Split pause title and description ([#6733](https://github.com/kestra-io/kestra/pull/6733))
- **core:** Reduce log level of property validation ([708c1127c](https://github.com/kestra-io/kestra/commit/708c1127c))
- **ui:** Amend passing of disabled property to no code editor ([33c5cb507](https://github.com/kestra-io/kestra/commit/33c5cb507))
- **translations:** Amend translation key/value pairs ([#6788](https://github.com/kestra-io/kestra/pull/6788))
- **translations:** Auto generate values for languages other than english ([3c6aa6980](https://github.com/kestra-io/kestra/commit/3c6aa6980))
- **ui:** Amend width of execute flow inputs section ([#6720](https://github.com/kestra-io/kestra/pull/6720))
- **ui:** Mark taskruns with multiple attemps in gantt view ([#6721](https://github.com/kestra-io/kestra/pull/6721))
- **ui:** Amend dialog close button styling ([fdbe16387](https://github.com/kestra-io/kestra/commit/fdbe16387))
- **ui:** Add empty view on flow concurrency page ([#6640](https://github.com/kestra-io/kestra/pull/6640))
- **translations:** Auto generate values for languages other than english ([46c3e3ff7](https://github.com/kestra-io/kestra/commit/46c3e3ff7))
- **translations:** Auto generate values for languages other than english ([3435e345e](https://github.com/kestra-io/kestra/commit/3435e345e))
- **ui:** Mark places where we need to replace old charts with the new ones ([#6623](https://github.com/kestra-io/kestra/pull/6623))
- **ui:** Change filter value by clicking on already selected one ([#6705](https://github.com/kestra-io/kestra/pull/6705))
- **test:** Add required attributes for e2e test ([#6797](https://github.com/kestra-io/kestra/pull/6797))
- **translations:** Auto generate values for languages other than english ([e037e548b](https://github.com/kestra-io/kestra/commit/e037e548b))
- **ui:** Show status label on dialog ([96780a976](https://github.com/kestra-io/kestra/commit/96780a976))
- **ui:** Amend flow export method ([#6835](https://github.com/kestra-io/kestra/pull/6835))
- **translations:** Auto generate values for languages other than english ([a01170572](https://github.com/kestra-io/kestra/commit/a01170572))
- **ui:** Handle task dict type fields ([#6884](https://github.com/kestra-io/kestra/pull/6884))
- **ui:** Make sure input pair component updates only what's needed ([#6892](https://github.com/kestra-io/kestra/pull/6892))
- **translations:** Auto generate values for languages other than english ([c6d69762c](https://github.com/kestra-io/kestra/commit/c6d69762c))
- **cli:** Invalid description on worker thread ([61e0668ad](https://github.com/kestra-io/kestra/commit/61e0668ad))
- **ui:** Start product tour by clicking on first car on welcome page ([#6934](https://github.com/kestra-io/kestra/pull/6934))
- **ui:** Start product tour by clicking on first card on welcome page ([#6935](https://github.com/kestra-io/kestra/pull/6935))
- **build:** Fix .plugins file ([01e565f3c](https://github.com/kestra-io/kestra/commit/01e565f3c))
- **build:** Fix release-plugins script ([83e99edcf](https://github.com/kestra-io/kestra/commit/83e99edcf))
- **script:** Update release-plugins to support pushReleaseVersionBranch ([4d7d8e008](https://github.com/kestra-io/kestra/commit/4d7d8e008))
- **ui:** Improvements of welcome page ([#6938](https://github.com/kestra-io/kestra/pull/6938))
- **translations:** Auto generate values for languages other than english ([cb7ee6a0b](https://github.com/kestra-io/kestra/commit/cb7ee6a0b))
- **cli:** Improve CLI help messages ([#6920](https://github.com/kestra-io/kestra/pull/6920))
- **ui:** Refactor the namespace flows ([a69f8b94f](https://github.com/kestra-io/kestra/commit/a69f8b94f))
- **translations:** Auto generate values for languages other than english ([4aa0a57e0](https://github.com/kestra-io/kestra/commit/4aa0a57e0))
- **translations:** Auto generate values for languages other than english ([2bca260a3](https://github.com/kestra-io/kestra/commit/2bca260a3))
- **ui:** Amend plus button action on flow editor topology ([#6983](https://github.com/kestra-io/kestra/pull/6983))
- **translations:** Auto generate values for languages other than english ([32da58eee](https://github.com/kestra-io/kestra/commit/32da58eee))
- **translations:** Auto generate values for languages other than english ([9c56ffa91](https://github.com/kestra-io/kestra/commit/9c56ffa91))
- Remove plugin-langchain ([dd8a45f42](https://github.com/kestra-io/kestra/commit/dd8a45f42))
- **version:** Update to version 'v0.21.0-rc0-SNAPSHOT'. ([f4fdfc250](https://github.com/kestra-io/kestra/commit/f4fdfc250))
- **ui:** Move apps link in left menu just below the flows ([#7063](https://github.com/kestra-io/kestra/pull/7063))
- **ui:** Properly check the existence of fields inside schema ([aa24c888a](https://github.com/kestra-io/kestra/commit/aa24c888a))
- **translations:** Auto generate values for languages other than english ([804ff6a81](https://github.com/kestra-io/kestra/commit/804ff6a81))
- **version:** Update to version 'v0.21.0-rc1-SNAPSHOT' ([86aec88de](https://github.com/kestra-io/kestra/commit/86aec88de))
- **ui:** Properly pass a prop related to saved searches ([6afe5ff41](https://github.com/kestra-io/kestra/commit/6afe5ff41))
- Version 0.21.0-rc2-SNAPSHOT ([d74a31ba7](https://github.com/kestra-io/kestra/commit/d74a31ba7))
- Version 0.21.0 ([aca5a9ff4](https://github.com/kestra-io/kestra/commit/aca5a9ff4))

### ✅ Tests

- **runner tests:** Add logs to track race condition ([#6455](https://github.com/kestra-io/kestra/pull/6455))
- Add a story & tests for filter labels ([#6526](https://github.com/kestra-io/kestra/pull/6526))
- **core:** Add coverage on http logger ([62badb1e5](https://github.com/kestra-io/kestra/commit/62badb1e5))
- **core:** Request test use an internal https server to be stable ([bccd95345](https://github.com/kestra-io/kestra/commit/bccd95345))
- **core:** Add configurable timeout on ExecuteFlow ([317284dfe](https://github.com/kestra-io/kestra/commit/317284dfe))

### 🎨 Styles

- **ui:** Update SideBar link styles to match design ([6a5ec8dcf](https://github.com/kestra-io/kestra/commit/6a5ec8dcf))

### 🤖 CI

- Update workflow docker ([a246ac38f](https://github.com/kestra-io/kestra/commit/a246ac38f))
- Update workflow docker ([c33d08afd](https://github.com/kestra-io/kestra/commit/c33d08afd))
- Fix workflow docker ([4e4ab80b2](https://github.com/kestra-io/kestra/commit/4e4ab80b2))
- Fix workflow docker for all plugins ([f0d5d4b93](https://github.com/kestra-io/kestra/commit/f0d5d4b93))
- Fix runner on release workflows ([6919848ab](https://github.com/kestra-io/kestra/commit/6919848ab))
- Fix release workflows ([41149a83b](https://github.com/kestra-io/kestra/commit/41149a83b))

### 📖 Commits

- 987f491: keep active state on hover (Bart Ledoux)
- 828d9a7: add taskrun.iteration (#6723) (AJ Emerich) [#6723](https://github.com/kestra-io/kestra/pull/6723)
- 0c0ff37: fix(core, ui): send a "start" event to be sure the UI receive the SSE (Loïc Mathieu) [#6731](https://github.com/kestra-io/kestra/pull/6731)
- fbfab90: fix(#6745) vue flow needs a height on the container 🥸 (Bart Ledoux)
- 717d556: feat(webserver, ui): avoid cancelled SSE connection from following exec (Loïc Mathieu) [#6738](https://github.com/kestra-io/kestra/pull/6738)
- 51088c8: fix logline css variables (Bart Ledoux)
- 7f048af: add full logline stories (Bart Ledoux)
- Define the langchain4j ollama, openai & gemini plugins in the .plugin file list (#6813) [#6813](https://github.com/kestra-io/kestra/pull/6813) ([aeSouid](https://github.com/kestra-io/kestra/commit/1ddb544c3662e9a14cbabfdbe4f9d673a4e1025e))
- aa869eb: closes https://github.com/kestra-io/kestra/issues/6814 (Anna Geller)
- 4e3ed33: feat(ui, webserver): rename "Change status" to "Change state" and enhance the infos (Loïc Mathieu) [#6799](https://github.com/kestra-io/kestra/pull/6799)
- 7cf4955: feat(core, jdbc): change the state of a subflow restart parent execution (Loïc Mathieu) [#6799](https://github.com/kestra-io/kestra/pull/6799)
- 2359c4f: fix(core, jdbc): Count task (Loïc Mathieu) [#6952](https://github.com/kestra-io/kestra/pull/6952)
- db84595: (docs): add custom dashboard in app documentation (AJ Emerich) [#6988](https://github.com/kestra-io/kestra/pull/6988)
- b8bc50f: fix flare effect (Bart Ledoux)

### ⚠️ Breaking Changes

#### Git Plugin: **Default Branch Name Changed**

The default branch within Git tasks has been renamed from `kestra` to `main` ([PR #98](https://github.com/kestra-io/plugin-git/pull/98)). Make sure to update any workflows that implicitly rely on the former default branch.

#### Secrets: **Exception Thrown on Missing Secret**

Fetching a non-existing secret using the `secret()` function now throws an exception instead of returning `null`, aligning the open-source behavior with the behavior in the Enterprise Edition ([PR #6495](https://github.com/kestra-io/kestra/pull/6495)).

#### Change State: **Restart Downstream Task Runs**

Manually changing a task run's status from `Failed` to a non-failed state (e.g. `Success`) via the Change state interface now restarts all downstream task runs, including subflows ([PR #6799](https://github.com/kestra-io/kestra/pull/6799)).

#### Restarting Parent Flow with Failed Subflow

When restarting an execution, `Subflow` or `ForEachItem` tasks now restart the existing failed subflow execution rather than creating a new one. This behavior is configurable via the new `restartBehavior` enum property; setting it to `NEW_EXECUTION` retains the previous behavior ([PR #6799](https://github.com/kestra-io/kestra/pull/6799); [Issue #6722](https://github.com/kestra-io/kestra/issues/6722)). A `system.restarted: true` label is added during restart for tracking, and the underlying subflow execution storage table is retained to avoid migration issues (scheduled for removal in v0.22).

#### Script Tasks: **STDERR Logged at ERROR Level**

Script tasks now log output sent to `stderr` at the ERROR level instead of WARNING ([PR #6383](https://github.com/kestra-io/kestra/pull/6383); [Issue #190](https://github.com/kestra-io/plugin-scripts/issues/190)).

#### Flows Created Before v0.9: **Redeployment Required**

Flows created before v0.9 and not updated since require editing or redeployment due to changes in source auto-generation ([PR #6264](https://github.com/kestra-io/kestra/pull/6264)).


### ❤️ Contributors

- Loïc Mathieu ([@loicmathieu](http://github.com/loicmathieu))
- Ludovic DEHON ([@tchiotludo](http://github.com/tchiotludo))
- Bart Ledoux <bledoux@kestra.io>
- Miloš Paunović ([@MilosPaunovic](http://github.com/MilosPaunovic))
- Piyush Bhaskar ([@Piyush-r-bhaskar](http://github.com/Piyush-r-bhaskar))
- Florian Hussonnois ([@fhussonnois](http://github.com/fhussonnois))
- Brian-mulier-p ([@brian-mulier-p](http://github.com/brian-mulier-p))
- GitHub Action ([@Github-Action-Bot](http://github.com/Github-Action-Bot))
- AJ Emerich ([@aj-emerich](http://github.com/aj-emerich))
- YannC ([@Skraye](http://github.com/Skraye))
- Nicolas K. <nk_mikmak@hotmail.com>
- Rajat Singh <rs2382001@gmail.com>
- Barthélémy Ledoux <ledouxb@me.com>
- Rajatsingh23 ([@rajatsingh23](http://github.com/rajatsingh23))
- Anna Geller <anna.m.geller@gmail.com>
- Yuri <1969yuri1969@gmail.com>
- Mathieu Gabelle ([@mgabelle](http://github.com/mgabelle))
- Shruti Mantri <shruti1810@gmail.com>
- Aabhas Sao ([@aabhas-sao](http://github.com/aabhas-sao))
- CoderKill ([@coderkill](http://github.com/coderkill))
- Saumya Gaur ([@SaumyaG1318](http://github.com/SaumyaG1318))
- Hashim Khalifa ([@hashimzs](http://github.com/hashimzs))
- Malay Dewangan ([@Malaydewangan09](http://github.com/Malaydewangan09))
- NKwiatkowski <nkwiatkowski@kestra.io>
- Rajarajan <rajarajangunapal985@gmail.com>
- Ruturaj Dhakane ([@rd-99](http://github.com/rd-99))
- Sayed Qassim ([@SayedQassim](http://github.com/SayedQassim))
- Maheshwara  Sampath ([@sampath24-ss](http://github.com/sampath24-ss))
- Shreeup <shree912@yahoo.com>
- Arpit Gupta ([@arpitgupta-ITT](http://github.com/arpitgupta-ITT))
- Yoann Vernageau ([@yvrng](http://github.com/yvrng))
- Marco Sabatini ([@MarcoSaba](http://github.com/MarcoSaba))
- Kratos ([@kratosmy](http://github.com/kratosmy))
- Michascant ([@MichaScant](http://github.com/MichaScant))
- Tejas Patil ([@tejas2292](http://github.com/tejas2292))
- Shivam ([@shivam221098](http://github.com/shivam221098))
- ANKIT KUMAR <ankit1842kumar@gmail.com>
- Sanketmagar2001 ([@sanketmagar2001](http://github.com/sanketmagar2001))
- Nitin Kumar Pal ([@nitinkumarpals](http://github.com/nitinkumarpals))
- Yerin Lee ([@DVUN716](http://github.com/DVUN716))
- Manoj Balaraj ([@ManojTauro](http://github.com/ManojTauro))
- Will Russell <wrussell@kestra.io>
- Abhishek Pawar ([@abhishekpawar1060](http://github.com/abhishekpawar1060))
- Rohit Ghumare ([@rohitg00](http://github.com/rohitg00))
- OsmaneTKT ([@osmaneTKT](http://github.com/osmaneTKT))
- Bardan Putra Prananto <bppdanto@gmail.com>
- Pphy03 ([@pphy03](http://github.com/pphy03))
- Ian Cheng ([@chengtc-dev](http://github.com/chengtc-dev))
- Nitin Bisht ([@nitsbat](http://github.com/nitsbat))
- Joe Celaster ([@JoeCelaster](http://github.com/JoeCelaster))
- Morri12 ([@morri12](http://github.com/morri12))
- Ines Qian ([@inesqyx](http://github.com/inesqyx))