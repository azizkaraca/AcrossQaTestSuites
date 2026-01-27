Feature: Register Creation

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @Regression
  Scenario: TC- Register Creation Scenario

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
      | plusIcon     |

    And User enters data to necessary areas
      | registerName    | TestRegister       |
      | displayName     | TestRegister       |
      | description     | RegisterForDevice  |
      | registerAddress | AddressForRegister |
      | scanRate        | 7000               |

    And User changes languages of relevant fields
      | english |
      | greek   |

    And User enters data to necessary areas
      | displayName | TestRegister EL|

    And User changes languages of relevant fields
      | english |
      | greek   |

    And User enters data to necessary areas
      | description | RegisterForDevice EL|

    And User confirms the selection
      | save |
      | yes  |

    Then User should see verify message
      | success | success |

    And User search the item
      | search | TestRegister |

    Then User should to find the item in field
      | nameContains | TestRegister |

    And User clicks following dynamic elements
      | click | Dashboard |

