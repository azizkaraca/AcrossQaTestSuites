Feature: Custom Data Category Deletion

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @Regression
  Scenario: TC-09 Custom Data Category Deletion Scenario

    And User clicks following Items
#      | menuBar            |
      | categories         |
      | customDataCategory |
      | customerCategories |

    And User search the item
      | search | EditTestCustomDataCategory |

    And User clicks following Items
      | searchButton |

    And User clicks following dynamic elements
      | delete  | EditTestCustomDataCategory |
      | confirm | Yes                        |

    Then User should see verify message
      | success | success |

    And User clicks following dynamic elements
      | click | Dashboard |

    #    check
