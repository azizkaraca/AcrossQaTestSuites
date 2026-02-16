Feature: Instance Entity Record Creation

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @SmokeTest @Regression
  Scenario: TC-22 Instance Entity Record Creation Scenario

    And User clicks following dynamic elements
      | click | Entities          |
      | click | Instance Entities |
      | click | Instance Entity_1 |

    And User clicks following Items
      | create       |
      | installation |
      | next         |

    And User enters data to necessary areas
      | name        | TestInstanceEntity    |
      | description | InstanceEntityForTest |

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
      | name | TestInstanceEntityEL |

    And User changes languages of relevant fields
      | english |
      | greek   |

    And User enters data to necessary areas
      | description | InstanceEntityForTestEL |

    And User clicks following dynamic elements
      | click | Save |

    And User enters data to necessary areas
      | reason | TestInstanceEntityCreation |

    And User clicks following dynamic elements
      | click | Yes |

    Then User should see verify message
      | success | success |

    And User clicks following dynamic elements
      | click | Dashboard |
