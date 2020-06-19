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
  "name": "I am at Amazon home page",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_am_at_Amazon_home_page()"
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
  "name": "I enter my  correct email",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_enter_my_correct_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_continue_button()"
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
  "name": "I click on the login button I should load in the my Amazon account",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_the_login_button_I_should_load_in_the_my_Amazon_account()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});