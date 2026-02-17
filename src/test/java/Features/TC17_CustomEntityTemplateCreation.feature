Feature: Custom Entity Template Creation

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

#  @Regression  (Entity Templates cannot be deleted, therefore use it rare)
  Scenario: TC-17 Custom Entity Template Creation Scenario

    And User clicks following dynamic elements
      | click | Templates               |
      | click | Custom Entity Templates |
      | click | Create                  |
      | click | Info                    |

    And User enters data to necessary areas
      | name | TestCustomEntityTemplate |
      | description | CustomEntityTemplateForTest |

    And User selects necessary areas
      | deviceCategory |

    And User clicks following dynamic elements
      | click | Entity Template Cat_1 |

    And User press the Esc Button on Keyboard Times
      | 1 |

    And User changes languages of relevant fields
      | english |
      | greek   |

    And User enters data to necessary areas
      | name | TestCustomEntityTemplateTest |

    And User clicks following dynamic elements
      | click | Structure |
      | click | Create    |

    And User enters data to necessary areas
      | name | Info |

    And User changes languages of relevant fields
      | english |
      | greek   |

    And User enters data to necessary areas
      | name | Info EL |

    And User selects necessary areas
      | menuIcon |
      | iconABC  |

    And User press the Esc Button on Keyboard Times
      | 1 |

    And User selects necessary areas
      | menuFeature             |
      | menuCustomData          |
      | menuDataTemplate        |
      | TestCustomDataTemplate1 |

    And User press the Esc Button on Keyboard Times
      | 1 |

    And User clicks following dynamic elements
      | click | Info Page    |
      | click | Confirm      |
      | click | Yes          |
      | click | Save         |
      | click | Confirm save |

    And User enters data to necessary areas
      | reason | TestCustomEntityTemplateCreation |

    And User clicks following dynamic elements
      | click | Yes |

    Then User should see verify message
      | success | success |

    And User clicks following dynamic elements
      | click | Dashboard |




