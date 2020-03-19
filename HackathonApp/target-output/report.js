$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/FirstCry.feature");
formatter.feature({
  "name": "Validate the price and add cart process",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate the given data",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "launch the url",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.FirstCryStep.launch_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate from the All Categories link",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.FirstCryStep.navigate_from_the_All_Categories_link()"
});
