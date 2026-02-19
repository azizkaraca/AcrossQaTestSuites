Feature: Instance Entity Record Import From Library Entity Records With Device&Register

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @SmokeTest @Regression
  Scenario: TC-36 Instance Entity Record Import From Library With Device&Register Scenario

    And User clicks following dynamic elements
      | click | Entities          |
      | click | Instance Entities |
      | click | Instance Entity_1 |

    And User clicks following Items
      | importButton    |
      | checkTheElement |
      | next            |
      | installation    |
      | next            |

    And User enters data to necessary areas
      | name        | TestImportInstanceEntity              |
      | description | ImportInstanceEntityFromLibraryEntity |

    And User clicks following Items
      | saveIcon      |
      | importDevices |
      | addButton     |
      | saveIcon      |
      | expandDevices |
      | stableDevice  |

    And User enters data to necessary areas
      | name             | StableDEVICEimport |
      | installationYear | 2026               |

    And User selects the Value on Keyboard Times
      | 1 |

    And User press the Enter Button on Keyboard Times
      | 1 |

    And User enters data to necessary areas
      | ipAddress  | 2026 |
      | portNumber | 2026 |

    And User clicks following Items
      | saveIcon      |

    And User clicks following dynamic elements
      | click | Save |
      | click | Yes  |

    Then User should see verify message
      | success | success |

    And User clicks following dynamic elements
      | click | Dashboard |




