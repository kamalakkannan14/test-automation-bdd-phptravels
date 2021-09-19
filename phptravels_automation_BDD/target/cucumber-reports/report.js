$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LabelValidationHomePage.feature");
formatter.feature({
  "line": 2,
  "name": "To test all the basic label are enabled in the Home page and SignUp validations",
  "description": "",
  "id": "to-test-all-the-basic-label-are-enabled-in-the-home-page-and-signup-validations",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LabelValidation"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Check for all website informations",
  "description": "",
  "id": "to-test-all-the-basic-label-are-enabled-in-the-home-page-and-signup-validations;check-for-all-website-informations",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@WebsiteInformation"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User launches the Google Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Launch the Webiste",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User is in home page verify for logo",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User should be able to see phone number to be \"  +1-234-56789\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User should be able to see the company mail id to be \"info@travelagency.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User clicks the Sign up page",
  "keyword": "Given "
});
formatter.match({
  "location": "LabelSteps.java:14"
});
formatter.result({
  "duration": 13227790100,
  "status": "passed"
});
formatter.match({
  "location": "LabelSteps.java:16"
});
formatter.result({
  "duration": 13259049900,
  "status": "passed"
});
formatter.match({
  "location": "LabelSteps.java:21"
});
formatter.result({
  "duration": 381607000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "  +1-234-56789",
      "offset": 47
    }
  ],
  "location": "LabelSteps.java:26"
});
formatter.result({
  "duration": 193432400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "info@travelagency.com",
      "offset": 54
    }
  ],
  "location": "LabelSteps.java:31"
});
formatter.result({
  "duration": 85601000,
  "status": "passed"
});
formatter.match({
  "location": "LabelSteps.java:41"
});
formatter.result({
  "duration": 3252079000,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Check Sign Up functions",
  "description": "",
  "id": "to-test-all-the-basic-label-are-enabled-in-the-home-page-and-signup-validations;check-sign-up-functions",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@SignUptest"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User enters \"New User\" as First Name and \"Test\" as Last Name",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User enters \"+987456321\" as Phone and \"User23@gmail.com\" as email",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User enters password \"test\" and clicks submit",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "New User",
      "offset": 13
    },
    {
      "val": "Test",
      "offset": 42
    }
  ],
  "location": "SignUpSteps.java:14"
});
formatter.result({
  "duration": 1037389600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "+987456321",
      "offset": 13
    },
    {
      "val": "User23@gmail.com",
      "offset": 39
    }
  ],
  "location": "SignUpSteps.java:20"
});
formatter.result({
  "duration": 767106400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 22
    }
  ],
  "location": "SignUpSteps.java:26"
});
formatter.result({
  "duration": 5395352300,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Check for the login and update functions",
  "description": "",
  "id": "to-test-all-the-basic-label-are-enabled-in-the-home-page-and-signup-validations;check-for-the-login-and-update-functions",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@LoginandUpdateTest"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User enters the \"User23@gmail.com\" as email and \"test\" as password",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "User clicks Submit and verifies for the \"New User\" for first Name at the top right corner",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User clicks Profile button and updates the email \"NewUserChanged@gmail.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "User clicks Update button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User Logsout",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User closes the browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "User23@gmail.com",
      "offset": 17
    },
    {
      "val": "test",
      "offset": 49
    }
  ],
  "location": "LoginSteps.java:12"
});
formatter.result({
  "duration": 2474954699,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New User",
      "offset": 41
    }
  ],
  "location": "LoginSteps.java:18"
});
formatter.result({
  "duration": 5149164200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NewUserChanged@gmail.com",
      "offset": 50
    }
  ],
  "location": "LoginSteps.java:23"
});
formatter.result({
  "duration": 2907281300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.java:28"
});
formatter.result({
  "duration": 2736510400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.java:32"
});
formatter.result({
  "duration": 2173557801,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.java:36"
});
formatter.result({
  "duration": 1059384600,
  "status": "passed"
});
});