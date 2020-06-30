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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am at netflix home page",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_am_at_netflix_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the signin button",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_the_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter my  correct email \"email\"",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_enter_my_correct_email(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter my pass word \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_enter_my_pass_word(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the scond signin button",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_the_scond_signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});