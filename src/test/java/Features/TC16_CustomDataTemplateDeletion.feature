Feature: Custom Data Template Deletion

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @SmokeTest @Regression
  Scenario: TC-16 Custom Data Template Deletion Scenario

    And User clicks following dynamic elements
      | click | Templates             |
      | click | Custom Data Templates |

    And User search the item
      | search | TestCustomDataTemplateTest |

    And User clicks following dynamic elements
      | click | search                     |
      | click | TestCustomDataTemplateTest |
      | click | Edit                       |
      | click | Delete                     |
      | click | Yes                        |

    Then User should see verify message
      | success | success |

    And User clicks following dynamic elements
      | click | Dashboard |

#    check


