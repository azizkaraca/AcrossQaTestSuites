Feature: Custom Data Template Editing

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @SmokeTest @Regression
  Scenario: TC-15 Custom Data Template Editing Scenario

    And User clicks following dynamic elements
      | click | Templates             |
      | click | Custom Data Templates |

    And User search the item
      | search | TestCustomDataTemplateTest |

    And User clicks following dynamic elements
      | click | search                     |
      | click | TestCustomDataTemplateTest |

    And User clicks hide button if the alert exist
      | hide |

    And User clicks following Items
      | edit |

    And User edits the record with name
      | name | TestCustomDataTemplateEdit |

    And User changes languages of relevant fields
      | english |
      | greek   |

    And User edits the record with name
      | name | TestCustomDataTemplateEditEL |

    And User confirms the selection
      | save |
      | yes  |

    Then User should see verify message
      | success | success |

    And User clicks following dynamic elements
      | click | Dashboard |



