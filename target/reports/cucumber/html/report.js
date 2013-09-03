$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("skrill_login_featues/skrill_login.feature");
formatter.feature({
  "id": "as-a-user-i-want-to-log-in-to-the-skrill-website",
  "tags": [
    {
      "name": "@skrill",
      "line": 1
    }
  ],
  "description": "",
  "name": "as a user i want to log in to the Skrill website",
  "keyword": "Feature",
  "line": 2
});
formatter.scenario({
  "id": "as-a-user-i-want-to-log-in-to-the-skrill-website;i-log-onto-skrill-as-a-referral-user",
  "tags": [
    {
      "name": "@in-progress",
      "line": 11
    }
  ],
  "description": "",
  "name": "I log onto skrill as a referral user",
  "keyword": "Scenario",
  "line": 12,
  "type": "scenario"
});
formatter.step({
  "name": "I am on the skrill login page",
  "keyword": "Given ",
  "line": 13
});
formatter.step({
  "name": "I log in as as a \"referral user\"",
  "keyword": "When ",
  "line": 14
});
formatter.step({
  "name": "I click the submit button",
  "keyword": "And ",
  "line": 15
});
formatter.step({
  "name": "I should see the Account Overview page",
  "keyword": "Then ",
  "line": 16
});
formatter.step({
  "name": "the user logs out",
  "keyword": "And ",
  "line": 17
});
formatter.match({
  "location": "LoginStep.I_am_on_the_skrill_login_page()"
});
formatter.result({
  "duration": 18508796000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "referral user",
      "offset": 18
    }
  ],
  "location": "LoginStep.I_log_in_as_as_a(String)"
});
formatter.result({
  "duration": 3009932000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.I_click_the_submit_buton()"
});
formatter.result({
  "duration": 3196876000,
  "status": "passed"
});
formatter.match({
  "location": "AccountOverviewStep.I_should_see_the_Account_Overview_page()"
});
formatter.result({
  "duration": 8331858000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.the_user_logs_out()"
});
formatter.result({
  "duration": 3095674000,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
});