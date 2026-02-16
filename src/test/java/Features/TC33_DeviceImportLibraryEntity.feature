Feature: Importing Device To Library Entity Record

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @SmokeTest @Regression
  Scenario: TC-33 Device Import To Library Entity Scenario

    And User clicks following dynamic elements
      | click | Entities            |
      | click | Library Entities    |
      | click | Library Entity_1    |
      | click | StableLibraryEntity |
      | title | Devices             |

    And User clicks following Items
      | importButton |

    And User clicks following dynamic elements
      | click | add  |
      | click | Save |
      | click | Yes  |

    Then User should see verify message
      | success | success |

    And User clicks following dynamic elements
      | click | Dashboard |




