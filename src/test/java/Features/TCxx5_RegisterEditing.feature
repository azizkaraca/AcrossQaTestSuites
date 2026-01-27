Feature: Register Editing

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @Regression
  Scenario: TC- Register Editing Scenario

    And User clicks following Items
      | library |
      | devices |

    And User search the item
      | search | TestDEVICE |

    And User clicks following Items
      | searchButton |

    Then User should to find the item in field
      | nameContains | TestDEVICE |

    And User clicks following Items
      | nameContains |
      | registers    |

    And User search the item
      | search | TestRegister |

    And User clicks following Items
      | searchButton |

    Then User should to find the item in field
      | nameContains | TestRegister |

    And User clicks following Items
      | edit |

    And User enters data to necessary areas
      | registerName    | TestRegisterEdit       |
      | displayName     | TestRegisterEdit       |
      | description     | RegisterForDeviceEdit  |
      | registerAddress | AddressForRegisterEdit |
      | scanRate        | 7007                   |

    And User changes languages of relevant fields
      | english |
      | greek   |

    And User enters data to necessary areas
      | displayName | TestRegisterEdit EL|

    And User changes languages of relevant fields
      | english |
      | greek   |

    And User enters data to necessary areas
      | description | RegisterForDeviceEdit EL|

    And User confirms the selection
      | save |
      | yes  |

    Then User should see verify message
      | success | success |

    And User search the item
      | search | TestRegisterEdit |

    Then User should to find the item in field
      | nameContains | TestRegisterEdit |

    And User clicks following dynamic elements
      | click | Dashboard |

