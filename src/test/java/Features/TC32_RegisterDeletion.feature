Feature: Register Deletion

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @Regression
  Scenario: TC-32 Register Deletion Scenario

    And User clicks following Items
      | library |
      | devices |

    And User search the item
      | search | StableDEVICE |

    And User clicks following Items
      | searchButton |

    Then User should to find the item in field
      | nameContains | StableDEVICE |

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

    And User clicks following dynamic elements
      | click | Dashboard |

