Feature: Imported Instance Entity Record With Device Deletion

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @SmokeTest @Regression
  Scenario: TC-37 Imported Instance Entity Record With Device Deletion Scenario

    And User clicks following dynamic elements
      | click | Entities          |
      | click | Instance Entities |
      | click | Instance Entity_1 |

    And User search the item
      | search | TestImportInstanceEntity |

    And User clicks following dynamic elements
      | click | search |

    And User clicks following dynamic elements
      | click | Name   |
      | click | delete |
      | click | Yes    |

    Then User should see verify message
      | success | success |

    And User clicks following dynamic elements
      | click | Dashboard |



