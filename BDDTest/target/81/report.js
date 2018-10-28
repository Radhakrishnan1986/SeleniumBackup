$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Home.feature");
formatter.feature({
  "line": 2,
  "name": "Validate NTL taxi home page",
  "description": "",
  "id": "validate-ntl-taxi-home-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@sample"
    }
  ]
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Validate NTL home page with valid data",
  "description": "",
  "id": "validate-ntl-taxi-home-page;validate-ntl-home-page-with-valid-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open Browser as \u003cBROWSER\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter URL as \u003cURL\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Enter User name as \u003cUSERNAME\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Enter phone number as \u003cMOBILENUMBER\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Select pickup address as \u003cPICKADRESS\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Select drop adress as \u003cDROPADDRESS\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Select vehicle type as \u003cVEHICLETYPE\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Dont select book button",
  "keyword": "But "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "validate-ntl-taxi-home-page;validate-ntl-home-page-with-valid-data;",
  "rows": [
    {
      "cells": [
        "BROWSER",
        "URL",
        "USERNAME",
        "MOBILENUMBER",
        "PICKADRESS",
        "DROPADDRESS",
        "VEHICLETYPE"
      ],
      "line": 13,
      "id": "validate-ntl-taxi-home-page;validate-ntl-home-page-with-valid-data;;1"
    },
    {
      "cells": [
        "FIREFOX",
        "http://www.ntltaxi.com/",
        "Radhakrishnan",
        "99999999999",
        "Adaya",
        "Tambaram",
        "Sedan"
      ],
      "line": 14,
      "id": "validate-ntl-taxi-home-page;validate-ntl-home-page-with-valid-data;;2"
    },
    {
      "cells": [
        "FIREFOX",
        "http://www.ntltaxi.com/",
        "ABC",
        "2222222222",
        "Adaya",
        "Tambaram",
        "Sedan"
      ],
      "line": 15,
      "id": "validate-ntl-taxi-home-page;validate-ntl-home-page-with-valid-data;;3"
    },
    {
      "cells": [
        "FIREFOX",
        "http://www.ntltaxi.com/",
        "abcd",
        "3333333333",
        "Adaya",
        "Tambaram",
        "Sedan"
      ],
      "line": 16,
      "id": "validate-ntl-taxi-home-page;validate-ntl-home-page-with-valid-data;;4"
    },
    {
      "cells": [
        "FIREFOX",
        "http://www.ntltaxi.com/",
        "Test",
        "4444444444",
        "Adaya",
        "Tambaram",
        "Sedan"
      ],
      "line": 17,
      "id": "validate-ntl-taxi-home-page;validate-ntl-home-page-with-valid-data;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Validate NTL home page with valid data",
  "description": "",
  "id": "validate-ntl-taxi-home-page;validate-ntl-home-page-with-valid-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@sample"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Open Browser as FIREFOX",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter URL as http://www.ntltaxi.com/",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Enter User name as Radhakrishnan",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Enter phone number as 99999999999",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Select pickup address as Adaya",
  "matchedColumns": [
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Select drop adress as Tambaram",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Select vehicle type as Sedan",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Dont select book button",
  "keyword": "But "
});
formatter.match({
  "arguments": [
    {
      "val": "FIREFOX",
      "offset": 16
    }
  ],
  "location": "SampleTest.openBrowser(String)"
});
formatter.result({
  "duration": 6998410243,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.ntltaxi.com/",
      "offset": 13
    }
  ],
  "location": "SampleTest.enterUrl(String)"
});
formatter.result({
  "duration": 25346722116,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Radhakrishnan",
      "offset": 19
    }
  ],
  "location": "SampleTest.enterUSerName(String)"
});
formatter.result({
  "duration": 557458060,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "99999999999",
      "offset": 22
    }
  ],
  "location": "SampleTest.enterPhoneNumber(String)"
});
formatter.result({
  "duration": 355358265,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Adaya",
      "offset": 25
    }
  ],
  "location": "SampleTest.selectPickUpAddress(String)"
});
formatter.result({
  "duration": 166168107,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tambaram",
      "offset": 22
    }
  ],
  "location": "SampleTest.selectDropAddress(String)"
});
formatter.result({
  "duration": 146236400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sedan",
      "offset": 23
    }
  ],
  "location": "SampleTest.selectVehicleType(String)"
});
formatter.result({
  "duration": 746127685,
  "status": "passed"
});
formatter.match({
  "location": "SampleTest.dontSelectbookButton()"
});
formatter.result({
  "duration": 36267,
  "status": "passed"
});
formatter.after({
  "duration": 112213,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Validate NTL home page with valid data",
  "description": "",
  "id": "validate-ntl-taxi-home-page;validate-ntl-home-page-with-valid-data;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@sample"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Open Browser as FIREFOX",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter URL as http://www.ntltaxi.com/",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Enter User name as ABC",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Enter phone number as 2222222222",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Select pickup address as Adaya",
  "matchedColumns": [
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Select drop adress as Tambaram",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Select vehicle type as Sedan",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Dont select book button",
  "keyword": "But "
});
formatter.match({
  "arguments": [
    {
      "val": "FIREFOX",
      "offset": 16
    }
  ],
  "location": "SampleTest.openBrowser(String)"
});
formatter.result({
  "duration": 138666,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.ntltaxi.com/",
      "offset": 13
    }
  ],
  "location": "SampleTest.enterUrl(String)"
});
formatter.result({
  "duration": 837137702,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ABC",
      "offset": 19
    }
  ],
  "location": "SampleTest.enterUSerName(String)"
});
formatter.result({
  "duration": 154772282,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2222222222",
      "offset": 22
    }
  ],
  "location": "SampleTest.enterPhoneNumber(String)"
});
formatter.result({
  "duration": 205794297,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Adaya",
      "offset": 25
    }
  ],
  "location": "SampleTest.selectPickUpAddress(String)"
});
formatter.result({
  "duration": 166321707,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tambaram",
      "offset": 22
    }
  ],
  "location": "SampleTest.selectDropAddress(String)"
});
formatter.result({
  "duration": 120120166,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sedan",
      "offset": 23
    }
  ],
  "location": "SampleTest.selectVehicleType(String)"
});
formatter.result({
  "duration": 983321622,
  "status": "passed"
});
formatter.match({
  "location": "SampleTest.dontSelectbookButton()"
});
formatter.result({
  "duration": 27307,
  "status": "passed"
});
formatter.after({
  "duration": 74666,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Validate NTL home page with valid data",
  "description": "",
  "id": "validate-ntl-taxi-home-page;validate-ntl-home-page-with-valid-data;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@sample"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Open Browser as FIREFOX",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter URL as http://www.ntltaxi.com/",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Enter User name as abcd",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Enter phone number as 3333333333",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Select pickup address as Adaya",
  "matchedColumns": [
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Select drop adress as Tambaram",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Select vehicle type as Sedan",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Dont select book button",
  "keyword": "But "
});
formatter.match({
  "arguments": [
    {
      "val": "FIREFOX",
      "offset": 16
    }
  ],
  "location": "SampleTest.openBrowser(String)"
});
formatter.result({
  "duration": 134826,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.ntltaxi.com/",
      "offset": 13
    }
  ],
  "location": "SampleTest.enterUrl(String)"
});
formatter.result({
  "duration": 1002128211,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd",
      "offset": 19
    }
  ],
  "location": "SampleTest.enterUSerName(String)"
});
formatter.result({
  "duration": 202482514,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3333333333",
      "offset": 22
    }
  ],
  "location": "SampleTest.enterPhoneNumber(String)"
});
formatter.result({
  "duration": 205370617,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Adaya",
      "offset": 25
    }
  ],
  "location": "SampleTest.selectPickUpAddress(String)"
});
formatter.result({
  "duration": 120919312,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tambaram",
      "offset": 22
    }
  ],
  "location": "SampleTest.selectDropAddress(String)"
});
formatter.result({
  "duration": 128681222,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sedan",
      "offset": 23
    }
  ],
  "location": "SampleTest.selectVehicleType(String)"
});
formatter.result({
  "duration": 848839020,
  "status": "passed"
});
formatter.match({
  "location": "SampleTest.dontSelectbookButton()"
});
formatter.result({
  "duration": 29867,
  "status": "passed"
});
formatter.after({
  "duration": 35413,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Validate NTL home page with valid data",
  "description": "",
  "id": "validate-ntl-taxi-home-page;validate-ntl-home-page-with-valid-data;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@sample"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Open Browser as FIREFOX",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter URL as http://www.ntltaxi.com/",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Enter User name as Test",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Enter phone number as 4444444444",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Select pickup address as Adaya",
  "matchedColumns": [
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Select drop adress as Tambaram",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Select vehicle type as Sedan",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Dont select book button",
  "keyword": "But "
});
formatter.match({
  "arguments": [
    {
      "val": "FIREFOX",
      "offset": 16
    }
  ],
  "location": "SampleTest.openBrowser(String)"
});
formatter.result({
  "duration": 110933,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.ntltaxi.com/",
      "offset": 13
    }
  ],
  "location": "SampleTest.enterUrl(String)"
});
formatter.result({
  "duration": 878939035,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test",
      "offset": 19
    }
  ],
  "location": "SampleTest.enterUSerName(String)"
});
formatter.result({
  "duration": 161355741,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4444444444",
      "offset": 22
    }
  ],
  "location": "SampleTest.enterPhoneNumber(String)"
});
formatter.result({
  "duration": 199579478,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Adaya",
      "offset": 25
    }
  ],
  "location": "SampleTest.selectPickUpAddress(String)"
});
formatter.result({
  "duration": 120903098,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tambaram",
      "offset": 22
    }
  ],
  "location": "SampleTest.selectDropAddress(String)"
});
formatter.result({
  "duration": 131795885,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sedan",
      "offset": 23
    }
  ],
  "location": "SampleTest.selectVehicleType(String)"
});
formatter.result({
  "duration": 718292841,
  "status": "passed"
});
formatter.match({
  "location": "SampleTest.dontSelectbookButton()"
});
formatter.result({
  "duration": 41814,
  "status": "passed"
});
formatter.after({
  "duration": 34133,
  "status": "passed"
});
});