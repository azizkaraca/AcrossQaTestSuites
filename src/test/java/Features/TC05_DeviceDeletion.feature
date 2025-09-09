Feature: Device Deletion

  Background:
    Given Navigate to QA Environment
    When Login with QA user credentials
    Then Login should be successfully

  @SmokeTest @Regression
  Scenario: TC-04 Device Deletion Scenario

    And User clicks following Buttons
      | menuBar |
      | library    |
      | devices    |
      | search     |

    And User search the item
      | search | TestDEVICE |

    And User clicks following Buttons
      | searchButton |

    Then User should to find the item in field
      | nameContains | TestDEVICE |

    And User clicks following Buttons
      | delete |
      | yes    |

    And User should see success message
      | success | success |

    And User clicks following Buttons
      | devices |

    Then User should not find item
      | nameContains | TestDEVICE |






