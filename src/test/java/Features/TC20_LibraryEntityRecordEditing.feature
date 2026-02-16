Feature: Library Entity Record Editing

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @SmokeTest @Regression
  Scenario: TC-20 Library Entity Record Editing Scenario

    And User clicks following dynamic elements
      | click | Entities         |
      | click | Library Entities |
      | click | Library Entity_1 |

    And User search the item
      | search | TestLibraryEntity |

    And User clicks following dynamic elements
      | click | search            |
      | click | TestLibraryEntity |

    And User clicks hide button if the alert exist
      | hide |

    And User clicks following Items
      | edit |

    And User edits the record with name
      | description | TestLibraryEntityForTestEdit |

    And User confirms the selection
      | save |
      | yes  |

    Then User should see verify message
      | success | success |

    And User clicks following dynamic elements
      | click | Dashboard |




