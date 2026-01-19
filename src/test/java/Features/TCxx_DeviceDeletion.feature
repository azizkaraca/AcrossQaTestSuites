Feature: Device Deletion

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @SmokeTest @Regression
  Scenario: TC- Device Deletion Scenario

    And User clicks following dynamic elements
      | click | Library |
      | click | Devices |

    And User search the item
      | search | TestDeviceEdit |

    And User clicks following dynamic elements
      | click | search |
      | click | delete |
      | click | Yes    |

    And User should see verify message
      | success | success |

    And User clicks following dynamic elements
      | click | Devices |

    Then User should not find item
      | nameContains | TestDeviceEdit |

    And User clicks following dynamic elements
      | click | Dashboard |





