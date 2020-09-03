$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("StepDeclaration.feature");
formatter.feature({
  "line": 2,
  "name": "webuildsg Test Automation",
  "description": "",
  "id": "webuildsg-test-automation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@weBuildTest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Title of your scenario outline",
  "description": "",
  "id": "webuildsg-test-automation;title-of-your-scenario-outline",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@HomePage"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Load the chrome Browser with url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Check The Activity tracker menu are linked with proper page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Validate all activity tracker menus are having log",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I search \"\u003cvalue\u003e\" with search data filed to filter activity tracker",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Validate the Social media container are having log",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Social media menu are landing on proper page while clicking",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "close the Broswer",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "generate report",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "webuildsg-test-automation;title-of-your-scenario-outline;",
  "rows": [
    {
      "cells": [
        "value"
      ],
      "line": 17,
      "id": "webuildsg-test-automation;title-of-your-scenario-outline;;1"
    },
    {
      "cells": [
        "active"
      ],
      "line": 18,
      "id": "webuildsg-test-automation;title-of-your-scenario-outline;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "Title of your scenario outline",
  "description": "",
  "id": "webuildsg-test-automation;title-of-your-scenario-outline;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@weBuildTest"
    },
    {
      "line": 5,
      "name": "@HomePage"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Load the chrome Browser with url",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Check The Activity tracker menu are linked with proper page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Validate all activity tracker menus are having log",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I search \"active\" with search data filed to filter activity tracker",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Validate the Social media container are having log",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Social media menu are landing on proper page while clicking",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "close the Broswer",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "generate report",
  "keyword": "Then "
});
formatter.match({
  "location": "BasicSteps.load_the_chrome_Browser_with_url()"
});
formatter.result({
  "duration": 27444795200,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.check_The_Activity_tracker_menu_s_are_linked_with_proper_page()"
});
formatter.result({
  "duration": 3576205600,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_all_activity_tracker_menus_are_having_log()"
});
formatter.result({
  "duration": 1021416700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "active",
      "offset": 10
    }
  ],
  "location": "HomePageSteps.i_search_with_search_data_filed_to_filter_activity_tracker(String)"
});
formatter.result({
  "duration": 1971682000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_the_Social_media_container_are_having_log()"
});
formatter.result({
  "duration": 1669310900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.social_media_menu_are_landing_on_proper_page_while_clicking()"
});
formatter.result({
  "duration": 1003596600,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.close_the_Broswer()"
});
formatter.result({
  "duration": 3608348400,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.generate_report()"
});
formatter.result({
  "duration": 1312900,
  "status": "passed"
});
});