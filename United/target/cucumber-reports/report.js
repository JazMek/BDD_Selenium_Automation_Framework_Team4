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
  "name": "I am at United home page",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_am_at_United_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the BookLink",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_the_BookLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the checkBoxOneWay",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_the_checkBoxOneWay()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the FromTextField",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_the_FromTextField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the FromTextField_ClearButton",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_the_FromTextField_ClearButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the value \"user1\" on FromTextField",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_enter_the_value_on_FromTextField(dataBase.UnitedList)"
});
formatter.result({
  "error_message": "io.cucumber.core.exception.CucumberException: Could not invoke step [I enter the value {string} on FromTextField] defined at \u0027step_definitions.HomePage_StepDefinition.i_enter_the_value_on_FromTextField(dataBase.UnitedList)\u0027.\nIt appears there was a problem with the step definition.\nThe converted arguments types were (java.lang.String)\n\nThe details are in the stacktrace below.\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.couldNotInvokeStep(PickleStepDefinitionMatch.java:81)\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:65)\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:230)\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:58)\nCaused by: io.cucumber.core.backend.CucumberBackendException: Failed to invoke public void step_definitions.HomePage_StepDefinition.i_enter_the_value_on_FromTextField(dataBase.UnitedList)\n\tat io.cucumber.java.Invoker.invoke(Invoker.java:29)\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)\n\t... 30 more\nCaused by: java.lang.IllegalArgumentException: argument type mismatch\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\n\tat io.cucumber.java.Invoker.invoke(Invoker.java:27)\n\t... 32 more\n",
  "status": "failed"
});
formatter.step({
  "name": "I enter the value \"user1\" on ToTextField",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_enter_the_value_on_ToTextField(dataBase.UnitedList)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on DepartDateLink",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_DepartDateLink()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on Month_ClickBtn1",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_Month_ClickBtn1()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on DepartDate",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_DepartDate()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on TravelersPassengers",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_TravelersPassengers()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on Adults",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_Adults()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on Seniors",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_Seniors()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on Children",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_Children()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on Children",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_Children()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on exitButton",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_exitButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on Find_flightsButton",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.i_click_on_Find_flightsButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "navigate bacward",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.HomePage_StepDefinition.navigate_bacward()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});