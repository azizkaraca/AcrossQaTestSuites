Feature: Custom Entity Category Deletion

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @SmokeTest @Regression
  Scenario: TC-13 Custom Entity Category Deletion Scenario

    And User clicks following Items
#      | menuBar              |
      | categories           |
      | customEntityCategory |
      | customerCategories   |

    And User search the item
      | search | EditTestCustomEntityCategory |

    And User clicks following Items
      | searchButton |

    And User clicks following dynamic elements
      | delete  | EditTestCustomEntityCategory |
      | confirm | Yes                          |

    Then User should see verify message
      | success | success |

    And User clicks following dynamic elements
      | click | Dashboard |
