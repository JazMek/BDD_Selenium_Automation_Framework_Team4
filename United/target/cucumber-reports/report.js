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
  "name": "I am at united home page",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_am_at_united_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Book button the Page should land properly",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_the_Book_button_the_Page_should_land_properly()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Route Map button the Map page should land properly",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_Route_Map_button_the_Map_page_should_land_properly()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Type \"NY\" destination in a search box the it should show it out in the map",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_Type_destination_in_a_search_box_the_it_should_show_it_out_in_the_map(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click on the search button should look for the destination",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_Click_on_the_search_button_should_look_for_the_destination()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the second destination \"chicago\" it should link it to the first one",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_select_the_second_destination_it_should_link_it_to_the_first_one(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});