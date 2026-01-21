Feature: Custom Data Category Creation

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @Regression
  Scenario: TC-06 Custom Data Category Creation Scenario

    And User clicks following Items
#      | menuBar            |
      | categories         |
      | customDataCategory |
      | customerCategories |
      | create             |

    And User enters data to necessary areas
      | name | TestCustomDataCategory |

    And User changes languages of relevant fields
      | english |
      | greek   |

    And User enters data to necessary areas
      | name | TestCustomDataCategory EL |

    And User selects necessary areas
      | active |
      | active |

    And User confirms the selection
      | save |

    Then User should see verify message
      | success | success |

    And User clicks following dynamic elements
      | click | Dashboard |


