$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/features/HomePage.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am at geico home page",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_am_at_geico_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test homepage Title",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am at geico home page",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_am_at_geico_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Land on the home page I will check if I land in the correct page",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_Land_on_the_home_page_I_will_check_if_I_land_in_the_correct_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am at geico home page",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_am_at_geico_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test homepage url",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I Land on the home page I will check if the link url is derecting me to the right page",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_Land_on_the_home_page_I_will_check_if_the_link_url_is_derecting_me_to_the_right_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am at geico home page",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_am_at_geico_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Test text is present in the home page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I land in the home page I should see the text",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_land_in_the_home_page_I_should_see_the_text()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[More than just car insurance]\u003e but was:\u003c[]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:117)\n\tat org.junit.Assert.assertEquals(Assert.java:146)\n\tat home.HomePage.land_in_the_home_page_I_should_see_the_text(HomePage.java:25)\n\tat step_definitions.HomePage_StepDefinition.i_land_in_the_home_page_I_should_see_the_text(HomePage_StepDefinition.java:50)\n\tat ✽.I land in the home page I should see the text(file:///Users/karimmekdoud/IdeaProjects/BDD_Selenium_Automation_Framework_Team4/Geico/src/main/java/features/HomePage.feature:13)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});