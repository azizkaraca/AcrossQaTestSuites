Feature: Device Deletion

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @SmokeTest @Regression
  Scenario: TC-04 Device Deletion Scenario

    And User clicks following dynamic elements
      | Library |
      | Devices |

    And User search the item
      | search | TestDeviceEdit |

    And User clicks following dynamic elements
      | search |
      | delete |
      | Yes    |

    And User should see verify message
      | success | success |

    And User clicks following dynamic elements
      | Devices |

    Then User should not find item
      | nameContains | TestDeviceEdit |






