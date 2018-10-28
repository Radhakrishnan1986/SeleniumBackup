$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sample/Home.feature");
formatter.feature({
  "line": 2,
  "name": "To test the NTL taxi website",
  "description": "",
  "id": "to-test-the-ntl-taxi-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@sample"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "To test the home page",
  "description": "",
  "id": "to-test-the-ntl-taxi-website;to-test-the-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open the Browser as FIREFOX Test test as Sample",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Launch the Url as http://www.ntltaxi.com/",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Enter the UserName as Radhakrishnan",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Enter the MobileNumber as 8888888888",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Enter PickUp address as Chrompet",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Enter DropAddress as Velachery",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Select VehicleType as Sedan",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Donot select the submitbutton",
  "keyword": "But "
});
formatter.match({
  "arguments": [
    {
      "val": "FIREFOX Test test",
      "offset": 20
    },
    {
      "val": "Sample",
      "offset": 41
    }
  ],
  "location": "SampleTestcase.openbrowser(String,String)"
});
formatter.result({
  "duration": 352667282,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.ntltaxi.com/",
      "offset": 18
    }
  ],
  "location": "SampleTestcase.launchUrl(String)"
});
formatter.result({
  "duration": 603732,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Radhakrishnan",
      "offset": 22
    }
  ],
  "location": "SampleTestcase.userName(String)"
});
formatter.result({
  "duration": 240640,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8888888888",
      "offset": 26
    }
  ],
  "location": "SampleTestcase.mobileNumber(int)"
});
formatter.result({
  "duration": 2368424,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chrompet",
      "offset": 24
    }
  ],
  "location": "SampleTestcase.pickupAddress(String)"
});
formatter.result({
  "duration": 171946,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Velachery",
      "offset": 21
    }
  ],
  "location": "SampleTestcase.dropAddress(String)"
});
formatter.result({
  "duration": 105387,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sedan",
      "offset": 22
    }
  ],
  "location": "SampleTestcase.vehicleType(String)"
});
formatter.result({
  "duration": 143786,
  "status": "passed"
});
formatter.match({
  "location": "SampleTestcase.submitbutton()"
});
formatter.result({
  "duration": 39253,
  "status": "passed"
});
});