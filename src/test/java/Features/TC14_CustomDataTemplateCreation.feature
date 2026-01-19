Feature: Custom Data Template Creation

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @SmokeTest @Regression
  Scenario: TC-14 Custom Data Template Creation Scenario

    And User clicks following dynamic elements
      | click | Templates             |
      | click | Custom Data Templates |
      | click | Create                |
      | click | Info                  |

    And User enters data to necessary areas
      | name        | TestCustomDataTemplate    |
      | description | CustomDataTemplateForTest |

    And User selects necessary areas
      | deviceCategory |

    And User clicks following dynamic elements
      | click | Data Template Cat_1 |

    And User press the Esc Button on Keyboard Times
      | 1 |

    And User changes languages of relevant fields
      | english |
      | greek   |

    And User enters data to necessary areas
      | name        | TestCustomDataTemplateEL    |
      | description | CustomDataTemplateForTestEL |

    And User clicks following dynamic elements
      | click | Structure |

    And User clicks following dynamic elements
      | click | Save |

    And User enters data to necessary areas
      | reason | TestCustomDataTemplateCreation |

    And User clicks following dynamic elements
      | click | Yes |

    Then User should see verify message
      | success | success |

    And User clicks following dynamic elements
      | click | Dashboard |




