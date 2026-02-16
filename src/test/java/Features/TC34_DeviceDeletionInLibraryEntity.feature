Feature: Device Deletion In Library Entity

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @SmokeTest @Regression
  Scenario: TC-34 Device Deletion In Library Entity Scenario

    And User clicks following dynamic elements
      | click | Entities            |
      | click | Library Entities    |
      | click | Library Entity_1    |
      | click | StableLibraryEntity |
      | title | Devices             |

    And User search the item
      | search | StableDevice |

    And User clicks following dynamic elements
      | click | search |
#      | click | Name   |
      | click | delete |
      | click | Yes    |

    Then User should see verify message
      | success | success |

    And User clicks following dynamic elements
      | click | Dashboard |



