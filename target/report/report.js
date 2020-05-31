$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/ParallelFeatures/Login.feature");
formatter.feature({
  "name": "As a Tools QA user I should be able to login to application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "landing on page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launched \"URL\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Login.user_launched(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter credentials \"Prince\" and \"Prince\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Login.enter_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks on \"login\" button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Login.user_Clicks_on_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/ParallelFeatures/prince_practice.feature");
formatter.feature({
  "name": "as an advisor",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "test",
  "rows": [
    {},
    {},
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.prince_practice.test(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "prince",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.prince_practice.prince()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});