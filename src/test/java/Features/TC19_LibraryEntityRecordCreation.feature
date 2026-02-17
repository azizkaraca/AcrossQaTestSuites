Feature: Library Entity Record Creation

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @SmokeTest @Regression
  Scenario: TC-19 Library Entity Record Creation Scenario

    And User clicks following dynamic elements
      | click | Entities         |
      | click | Library Entities |
      | click | Library Entity_1 |
      | click | Create           |

    And User enters data to necessary areas
      | name        | TestLibraryEntityTest  |
      | description | LibraryEntityForTest |

    And User selects necessary areas
      | deviceCategory |

    And User clicks following dynamic elements
      | click | Turbine      |
      | click | Wind Turbine |

    And User press the Esc Button on Keyboard Times
      | 1 |

    And User changes languages of relevant fields
      | english |
      | greek   |

    And User enters data to necessary areas
      | name | TestLibraryEntityTestEL |

    And User changes languages of relevant fields
      | english |
      | greek   |

    And User enters data to necessary areas
      | description | LibraryEntityForTestEL |

    And User clicks following dynamic elements
      | click | save |
      | click | Yes  |

    Then User should see verify message
      | success | success |

    And User clicks following dynamic elements
      | click | Dashboard |




