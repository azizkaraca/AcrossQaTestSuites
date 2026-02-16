Feature: Library Entity Record Deletion

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @SmokeTest @Regression
  Scenario: TC-21 Library Entity Record Deletion Scenario

    And User clicks following dynamic elements
      | click | Entities         |
      | click | Library Entities |
      | click | Library Entity_1 |

    And User search the item
      | search | TestLibraryEntityEdit |

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



