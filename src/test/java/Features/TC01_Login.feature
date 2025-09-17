Feature: Login

  Background:
    Given Navigate to Testing Environment

  @SmokeTest @Regression
    Scenario: TC-01 Login With Valid Credentials
    When Login with QA user credentials
    Then Login should be successfully


