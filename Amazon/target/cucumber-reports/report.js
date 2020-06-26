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
  "name": "I click on Find Gift button I should see the page",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_Find_Gift_button_I_should_see_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Preschooler the page should display properly",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_Preschooler_the_page_should_display_properly()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Play Dol",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_Play_Dol()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Play Dol Add To The Card should Add it properly",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_the_Play_Dol_Add_To_The_Card_should_Add_it_properly()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});