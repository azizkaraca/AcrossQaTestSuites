Feature: Customer Menu Deletion

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @SmokeTest @Regression
  Scenario: TC-05 Customer Menu Deletion Scenario

    And User clicks following Items
      | downArrow |
      | adminView |

    And User clicks following dynamic elements
      | click  | Customer Menu |
      | click  | Edit          |
      | delete | TestMenuEdit  |
      | click  | Yes           |
      | click  | Save          |
      | click  | Yes           |

    Then User should see verify message
      | success | success |







