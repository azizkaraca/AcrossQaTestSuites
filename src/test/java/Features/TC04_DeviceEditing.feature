Feature: Device Editing

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @SmokeTest @Regression
  Scenario: TC-04 Device Editing Scenario

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
      | nameContains |


    And User clicks hide button if the alert exist
      | hide |

    And User clicks following Buttons
      | edit |

    And User enters data to necessary areas
      | name | TestDeviceEdit |

    And User confirms the selection
      | save |
      | yes  |

    And User clicks following Buttons
      | devices |

    And User search the item
      | search | TestDeviceEdit |

    Then User should to find the item in field
      | nameContains | TestDeviceEdit |







