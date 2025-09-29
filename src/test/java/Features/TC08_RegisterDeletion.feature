Feature: Register Deletion

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @SmokeTest @Regression
  Scenario: TC-08 Register Deletion Scenario

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

    And User search the item
      | search | TestRegisterEdit |

    And User clicks following Buttons
      | searchButton |

    Then User should to find the item in field
      | nameContains | TestRegisterEdit |

    And User clicks following Buttons
      | delete |
      | yes    |

    Then User should see success message
      | success | success |

    And User clicks following Buttons
      | registers |

    And User search the item
      | search | TestRegisterEdit |

    Then User should not find item
      | nameContains | TestRegisterEdit |


