Feature: Custom Entity Category Editing

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @SmokeTest @Regression
  Scenario: TC-12 Custom Entity Category Editing Scenario

    And User clicks following Items
#      | menuBar              |
      | categories           |
      | customEntityCategory |
      | customerCategories   |

    And User search the item
      | search | TestCustomEntityCategory |

    And User clicks following Items
      | searchButton |

    And User clicks following dynamic elements
      | edit | TestCustomEntityCategory |

    And User enters data to necessary areas
      | name | EditTestCustomEntityCategory |

    And User confirms the selection
      | save |

    Then User should see verify message
      | success | success |

    And User clicks following dynamic elements
      | click | Dashboard |