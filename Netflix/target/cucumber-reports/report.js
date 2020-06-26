$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/features/HomePage.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Kids Page Title",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am at Netflix home page",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_am_at_Netflix_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter my  correct email",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_enter_my_correct_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter my pass word",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_enter_my_pass_word()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the login button I should load in the my netflix account",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_the_login_button_I_should_load_in_the_my_netflix_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Team4 profile the page should display properly",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_Team4_profile_the_page_should_display_properly()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"appMountPoint\"]/div/div/div[1]/div[1]/div[2]/div/div/ul/li[1]/div/a/div/div\"}\n  (Session info: chrome\u003d83.0.4103.116)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Salahs-MBP.home\u0027, ip: \u0027fd4b:8d38:69ba:1:a8c8:c861:7ff1:3635%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.5\u0027, java.version: \u002711.0.6\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.116, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: /var/folders/pm/vhs96q256t9...}, goog:chromeOptions: {debuggerAddress: localhost:55761}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 83b187f89aec3e66a68d0af738d88e8e\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"appMountPoint\"]/div/div/div[1]/div[1]/div[2]/div/div/ul/li[1]/div/a/div/div}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat common.WebAPI.clickByXpath(WebAPI.java:568)\n\tat step_definitions.HomePage_StepDefinition.i_click_on_Team4_profile_the_page_should_display_properly(HomePage_StepDefinition.java:57)\n\tat ✽.I click on Team4 profile the page should display properly(file:///Users/salahmouloudi/IdeaProjects/BDD_Selenium_Automation_Framework_Team4/Netflix/src/main/java/features/HomePage.feature:41)\n",
  "status": "failed"
});
formatter.step({
  "name": "I click kids button the page should land properly",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_kids_button_the_page_should_land_properly()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on Pokemon Play button the video should display properly",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_Pokemon_Play_button_the_video_should_display_properly()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on the return arrow the video should be closed",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_the_return_arrow_the_video_should_be_closed()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});