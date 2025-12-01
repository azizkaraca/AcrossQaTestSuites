Feature: Register Deletion

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @SmokeTest @Regression
  Scenario: TC-08 Register Deletion Scenario

    And User clicks following Items
      | menuBar |
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
      | search | TestRegisterEdit |

    And User clicks following Items
      | searchButton |

    Then User should to find the item in field
      | nameContains | TestRegisterEdit |

    And User clicks following Items
      | delete |
      | yes    |

    Then User should see verify message
      | success | success |

    And User clicks following Items
      | registers |

    And User search the item
      | search | TestRegisterEdit |

    Then User should not find item
      | nameContains | TestRegisterEdit |


