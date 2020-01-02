$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/omayologin.feature");
formatter.feature({
  "name": "Login to the omayo application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User should only be able to login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@All"
    },
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "I navigate to the omayo website",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter Username as \"\u003cusername\u003e\" and Password as \"\u003cpassword\u003e\" into the fields",
  "keyword": "When "
});
formatter.step({
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "name": "User should login based on expected \"\u003cloginstatus\u003e\" status",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "loginstatus"
      ]
    },
    {
      "cells": [
        "arun",
        "pswd1",
        "failure"
      ]
    },
    {
      "cells": [
        "SeleniumByArun",
        "Test143$",
        "success"
      ]
    },
    {
      "cells": [
        "motoori",
        "pswd2",
        "failure"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User should only be able to login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@All"
    },
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the omayo website",
  "keyword": "Given "
});
formatter.match({
  "location": "omayologin.I_navigate_to_the_omayo_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Username as \"arun\" and Password as \"pswd1\" into the fields",
  "keyword": "When "
});
formatter.match({
  "location": "omayologin.I_enter_Username_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "omayologin.I_click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should login based on expected \"failure\" status",
  "keyword": "Then "
});
formatter.match({
  "location": "omayologin.User_should_login_based_on_expected_status(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User should only be able to login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@All"
    },
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the omayo website",
  "keyword": "Given "
});
formatter.match({
  "location": "omayologin.I_navigate_to_the_omayo_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Username as \"SeleniumByArun\" and Password as \"Test143$\" into the fields",
  "keyword": "When "
});
formatter.match({
  "location": "omayologin.I_enter_Username_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "omayologin.I_click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should login based on expected \"success\" status",
  "keyword": "Then "
});
formatter.match({
  "location": "omayologin.User_should_login_based_on_expected_status(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User should only be able to login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@All"
    },
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the omayo website",
  "keyword": "Given "
});
formatter.match({
  "location": "omayologin.I_navigate_to_the_omayo_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Username as \"motoori\" and Password as \"pswd2\" into the fields",
  "keyword": "When "
});
formatter.match({
  "location": "omayologin.I_enter_Username_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "omayologin.I_click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should login based on expected \"failure\" status",
  "keyword": "Then "
});
formatter.match({
  "location": "omayologin.User_should_login_based_on_expected_status(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});