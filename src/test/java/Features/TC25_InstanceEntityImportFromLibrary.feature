Feature: Instance Entity Record Import From Library Entity Records

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @SmokeTest @Regression
  Scenario: TC-25 Instance Entity Record Import From Library Scenario

    And User clicks following dynamic elements
      | click | Entities          |
      | click | Instance Entities |
      | click | Instance Entity_1 |

    And User clicks following Items
      | importButton          |
      | importInstanceElement |
      | next                  |
      | installation          |
      | next                  |

    And User enters data to necessary areas
      | name        | TestImportInstanceEntity              |
      | description | ImportInstanceEntityFromLibraryEntity |

    And User clicks following dynamic elements
      | click | save |
      | click | Save |
      | click | Yes  |

    Then User should see verify message
      | success | success |

    And User clicks following dynamic elements
      | click | Dashboard |




