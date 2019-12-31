$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/registration.feature");
formatter.feature({
  "name": "Registration Tests",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Register an account with valid details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@qafox"
    }
  ]
});
formatter.step({
  "name": "User navigates to registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "Registration.user_navigates_to_registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User provides the following details into the input fields",
  "rows": [
    {
      "cells": [
        "firstName",
        "kiko"
      ]
    },
    {
      "cells": [
        "lastName",
        "draxicor"
      ]
    },
    {
      "cells": [
        "email",
        "draxicor@gmail.com"
      ]
    },
    {
      "cells": [
        "phone",
        "12345678"
      ]
    },
    {
      "cells": [
        "password",
        "SeleniumTester$"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Registration.user_provides_the_following_details_into_the_input_fields(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Selects the privacy policy option",
  "keyword": "And "
});
formatter.match({
  "location": "Registration.selects_the_privacy_policy_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks on continue button",
  "keyword": "And "
});
formatter.match({
  "location": "Registration.clicks_on_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should get successfully regsitered",
  "keyword": "Then "
});
formatter.match({
  "location": "Registration.user_should_get_successfully_regsitered()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: User did not register succesfully\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat stepDefinitions.Registration.user_should_get_successfully_regsitered(Registration.java:62)\r\n\tat ✽.User should get successfully regsitered(file:features/registration.feature:13)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});