Feature: Custom Data Category Editing

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @Regression
  Scenario: TC-08 Custom Data Category Editing Scenario

    And User clicks following Items
#      | menuBar            |
      | categories         |
      | customDataCategory |
      | customerCategories |

    And User search the item
      | search | TestCustomDataCategory |

    And User clicks following Items
      | searchButton |

    And User clicks following dynamic elements
      | edit | TestCustomDataCategory |

    And User enters data to necessary areas
      | name | EditTestCustomDataCategory |

    And User confirms the selection
      | save |

    Then User should see verify message
      | success | success |

    And User clicks following dynamic elements
      | click | Dashboard |

