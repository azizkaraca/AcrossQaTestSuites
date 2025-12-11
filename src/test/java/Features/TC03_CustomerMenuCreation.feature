Feature: Customer Menu Creation

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @SmokeTest @Regression
  Scenario: TC-03 Customer Menu Creation Scenario

    And User clicks following Items
      | downArrow |
      | adminView |

    And User clicks following dynamic elements
      | click | Customer Menu |
      | click | Edit          |
      | click | Create        |

    And User enters data to necessary areas
      | name | TestMenu |

    And User changes languages of relevant fields
      | english |
      | greek   |

    And User enters data to necessary areas
      | name | TestMenuEL |

    And User selects necessary areas
      | menuIcon |
      | iconABC  |

    And User press the Esc Button on Keyboard Times
      | 1 |

    And User selects necessary areas
      | menuFeature     |
      | menuSystemPages |
      | pageDesigner    |

    And User press the Esc Button on Keyboard Times
      | 1 |

    And User clicks following dynamic elements
      | click | Confirm |
      | click | Save    |
      | click | Yes     |

    Then User should see verify message
      | success | success |






