Feature: Devices Creation

  Background:
    Given Navigate to QA Environment
    When Login with QA user credentials
    Then Login should be successfully

  @SmokeTest @Regression
  Scenario: TC-03 Create a new Device

    And User clicks following Buttons
      | personIcon |
      | library    |
      | devices    |
      | newAdd     |

    And User enters data to necessary areas
      | name        | TestDEVICE    |
      | model       | TestMODEL     |
      | description | DeviceForTest |

    And User selects necessary areas
      | protocol     |
      | modbus       |
      | manufacturer |
      | mas          |
      | edit         |
      | engine       |
      | heatEngine   |

    And User press the Esc Button on Keyboard Times
      | 1 |

    And User changes languages of relevant fields
      | english |
      | greek   |

    And User enters data to necessary areas
      | name | TestDEVICE |

    And User selects necessary areas
      | shareable |
      | shareable |

    And User confirms the selection
      | save |
      | yes  |

    Then User should see success message
      | success | success |






