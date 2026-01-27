Feature: Custom Entity Category Duplicate Creation

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @Regression
  Scenario: TC-11 Custom Entity Category Duplicate Creation Scenario

    And User clicks following Items
#      | menuBar              |
      | categories           |
      | customEntityCategory |
      | customerCategories   |
      | create               |

    And User enters data to necessary areas
      | name | TestCustomEntityCategory |

    And User changes languages of relevant fields
      | english |
      | greek   |

    And User enters data to necessary areas
      | name | TestCustomEntityCategory EL |

    And User selects necessary areas
      | active |
      | active |

    And User confirms the selection
      | save |

    Then User should see verify message
      | exists | exists |

    And User clicks following dynamic elements
      | click | Dashboard |

    #    check
