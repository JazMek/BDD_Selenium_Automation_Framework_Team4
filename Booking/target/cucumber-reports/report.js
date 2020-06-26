$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/features/HomePage.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am at Booking home page",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_am_at_Booking_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Flights button the page should display properly",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_Flights_button_the_page_should_display_properly()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on One Way Button it should get selected",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_One_Way_Button_it_should_get_selected()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"flight-search-form\"]/div[1]/div[2]/label/div/svg\"}\n  (Session info: chrome\u003d83.0.4103.116)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Salahs-MBP.home\u0027, ip: \u0027fd4b:8d38:69ba:1:a8c8:c861:7ff1:3635%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.5\u0027, java.version: \u002711.0.6\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.116, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: /var/folders/pm/vhs96q256t9...}, goog:chromeOptions: {debuggerAddress: localhost:57781}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 60c7de24a78106ce5c9fc13b656337c2\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"flight-search-form\"]/div[1]/div[2]/label/div/svg}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy20.click(Unknown Source)\n\tat step_definitions.HomePage_StepDefinition.i_click_on_One_Way_Button_it_should_get_selected(HomePage_StepDefinition.java:113)\n\tat ✽.I click on One Way Button it should get selected(file:///Users/salahmouloudi/IdeaProjects/BDD_Selenium_Automation_Framework_Team4/Booking/src/main/java/features/HomePage.feature:36)\n",
  "status": "failed"
});
formatter.step({
  "name": "the page should wait for 5 seconds",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.the_page_should_wait_for_seconds(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "it should get clean up",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.it_should_get_clean_up()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});