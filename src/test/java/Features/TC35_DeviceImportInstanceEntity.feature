Feature: Importing Device To Instance Entity Record

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

#  @Regression (Devices cannot be deleted in Instance Entities, therefore use it rare)
  Scenario: TC-35 Device Import To Instance Entity Scenario

    And User clicks following dynamic elements
      | click | Entities             |
      | click | Instance Entities    |
      | click | Instance Entity_1    |
      | click | StableInstanceEntity |
      | title | Devices              |

    And User clicks following Items
      | importButton    |
      | checkTheElement |
      | next            |

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
      | next |
      | checkTheElement     |

    And User clicks following dynamic elements
      | click | Save |
      | click | Yes  |

    Then User should see verify message
      | success | success |

    And User clicks following dynamic elements
      | click | Dashboard |




