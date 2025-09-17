Feature: Logout

  Background:
    Given Navigate to Testing Environment

  @SmokeTest @Regression
  Scenario: TC-02 Logout From Application
    When Login with QA user credentials
    Then Login should be successfully
    And Go to MyAccount
    And Click Logout Button
    Then User Should Logout Successfully

