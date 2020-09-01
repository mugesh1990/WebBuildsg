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
  "line": 21,
  "name": "Title of your scenario outline",
  "description": "",
  "id": "webuildsg-test-automation;title-of-your-scenario-outline",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 20,
      "name": "@ActivenUserPage"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "Load the chrome Browser with url",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "redirect to Activeuser page",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "check the activegoup with \"\u003cactivegroup\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "All active group should tag with page",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "check the active group value more then \"\u003cgroupvalue\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "check the \"\u003cactivegroup\u003e\" link with proper page landing",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "close the Broswer",
  "keyword": "Then "
});
formatter.examples({
  "line": 30,
  "name": "",
  "description": "",
  "id": "webuildsg-test-automation;title-of-your-scenario-outline;",
  "rows": [
    {
      "cells": [
        "groupvalue",
        "status",
        "activegroup"
      ],
      "line": 31,
      "id": "webuildsg-test-automation;title-of-your-scenario-outline;;1"
    },
    {
      "cells": [
        "5",
        "success",
        ".NET Developers Singapore"
      ],
      "line": 32,
      "id": "webuildsg-test-automation;title-of-your-scenario-outline;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 32,
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
      "line": 20,
      "name": "@ActivenUserPage"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "Load the chrome Browser with url",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "redirect to Activeuser page",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "check the activegoup with \".NET Developers Singapore\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "All active group should tag with page",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "check the active group value more then \"5\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "check the \".NET Developers Singapore\" link with proper page landing",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "close the Broswer",
  "keyword": "Then "
});
formatter.match({
  "location": "BasicSteps.load_the_chrome_Browser_with_url()"
});
formatter.result({
  "duration": 24838356500,
  "status": "passed"
});
formatter.match({
  "location": "ActveUserpageSteps.redirect_to_Activeuser_page()"
});
formatter.result({
  "duration": 3306866600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": ".NET Developers Singapore",
      "offset": 27
    }
  ],
  "location": "ActveUserpageSteps.check_the_activegoup_with(String)"
});
formatter.result({
  "duration": 1168676400,
  "status": "passed"
});
formatter.match({
  "location": "ActveUserpageSteps.all_active_group_should_tag_with_page()"
});
formatter.result({
  "duration": 1010359000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 40
    }
  ],
  "location": "ActveUserpageSteps.check_the_active_group_value_more_then(String)"
});
formatter.result({
  "duration": 1442387900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": ".NET Developers Singapore",
      "offset": 11
    }
  ],
  "location": "ActveUserpageSteps.check_the_link_with_proper_page_landing(String)"
});
formatter.result({
  "duration": 4544072100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.close_the_Broswer()"
});
formatter.result({
  "duration": 3273450200,
  "status": "passed"
});
});