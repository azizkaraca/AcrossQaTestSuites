Feature: Customer Menu Editing

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @SmokeTest @Regression
  Scenario: TC-04 Customer Menu Editing Scenario

    And User clicks following Items
      | downArrow |
      | adminView |

    And User clicks following dynamic elements
      | click | Customer Menu |
      | click | Edit          |
      | click | TestMenu      |

    And User enters data to necessary areas
      | name | TestMenuEdit |

    And User changes languages of relevant fields
      | english |
      | greek   |

    And User enters data to necessary areas
      | name | TestMenuEditEL |

    And User clicks following dynamic elements
      | click | Confirm |
      | click | Save    |
      | click | Yes     |

    Then User should see verify message
      | success | success |

    #    check






