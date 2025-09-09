Feature: Register Creation

  Background:
    Given Navigate to QA Environment
    When Login with QA user credentials
    Then Login should be successfully

  @SmokeTest @Regression
  Scenario: TC-06 Register Creation Scenario

    And User clicks following Buttons
      | menuBar |
      | library |
      | devices |

    And User search the item
      | search | TestDEVICE |

    And User clicks following Buttons
      | searchButton |

    Then User should to find the item in field
      | nameContains | TestDEVICE |

    And User clicks following Buttons
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
      | displayName | TestRegister |

    And User changes languages of relevant fields
      | english |
      | greek   |

    And User enters data to necessary areas
      | description | RegisterForDevice |

    And User confirms the selection
      | save |
      | yes  |

    Then User should see success message
      | success | success |

    And User search the item
      | search | TestRegister |

    Then User should to find the item in field
      | nameContains | TestRegister |


