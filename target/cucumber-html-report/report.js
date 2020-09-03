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
  "duration": 57528643000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.check_The_Activity_tracker_menu_s_are_linked_with_proper_page()"
});
formatter.result({
  "duration": 35339253900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_all_activity_tracker_menus_are_having_log()"
});
formatter.result({
  "duration": 21471999300,
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
  "duration": 22289345400,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\u0027search\u0027]\"}\n  (Session info: chrome\u003d85.0.4183.83)\n  (Driver info: chromedriver\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb),platform\u003dWindows NT 10.0.18363 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.0.0-alpha-6\u0027, revision: \u00275f43a29cfc\u0027\nSystem info: host: \u0027DESKTOP-CTBK3Q9\u0027, ip: \u0027127.0.0.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00279.0.4\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.38.552522 (437e6fbedfa876..., userDataDir: C:\\Users\\User\\AppData\\Local...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 85.0.4183.83, webStorageEnabled: true}\nSession ID: 72efd2bcf691d5d08f6494d60ca17992\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\u0027search\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:217)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:169)\r\n\tat org.openqa.selenium.remote.codec.jwp.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:41)\r\n\tat org.openqa.selenium.remote.codec.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:83)\r\n\tat org.openqa.selenium.remote.codec.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:47)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:160)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:582)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:333)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:451)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:394)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:325)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy21.sendKeys(Unknown Source)\r\n\tat com.allobject.pages.Homepage.inputSearch(Homepage.java:155)\r\n\tat com.stepdefination.HomePageSteps.i_search_with_search_data_filed_to_filter_activity_tracker(HomePageSteps.java:37)\r\n\tat ✽.Then I search \"active\" with search data filed to filter activity tracker(StepDeclaration.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HomePageSteps.validate_the_Social_media_container_are_having_log()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSteps.social_media_menu_are_landing_on_proper_page_while_clicking()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSteps.close_the_Broswer()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});