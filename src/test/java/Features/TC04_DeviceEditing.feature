Feature: Device Editing

  Background:
    Given Navigate to QA Environment
    When Login with QA user credentials
    Then Login should be successfully

  @SmokeTest @Regression
  Scenario: TC-04 Device Editing Scenario

    And User clicks following Buttons
      | personIcon |
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
      | nameContains |
      | hide         |
      | edit         |

    And User enters data to necessary areas
      | name | Edit |

    And User confirms the selection
      | save |
      | yes  |

    And User clicks following Buttons
      | devices |

    And User search the item
      | search | Edit |

    Then User should to find the item in field
      | nameContains | Edit |






