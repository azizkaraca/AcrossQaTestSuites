Feature: Device Creation

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @Regression
  Scenario: TC- Device Creation Scenario

    And User clicks following dynamic elements
      | click | Library |
      | click | Devices |
      | click | Create  |

    And User enters data to necessary areas
      | name        | TestDEVICE    |
      | model       | TestMODEL     |
      | description | DeviceForTest |

    And User selects necessary areas
      | deviceCategory |
      | engine         |
      | heatEngine     |

    And User press the Esc Button on Keyboard Times
      | 1 |

    And User selects necessary areas
      | protocol     |
      | modbus       |
      | manufacturer |
      | mas          |

    And User changes languages of relevant fields
      | english |
      | greek   |

    And User enters data to necessary areas
      | name | TestDEVICE |

    And User selects necessary areas
      | shareable |
      | shareable |

    And User confirms the selection
      | save |
      | yes  |

    Then User should see verify message
      | success | success |

    And User clicks following dynamic elements
      | click | Dashboard |

#    check



