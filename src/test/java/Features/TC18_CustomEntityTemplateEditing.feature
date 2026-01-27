Feature: Custom Entity Template Editing

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @Regression
  Scenario: TC-18 Custom Entity Template Editing Scenario

    And User clicks following dynamic elements
      | click | Templates               |
      | click | Custom Entity Templates |

    And User search the item
      | search | TestCustomEntityTemplate |

    And User clicks following dynamic elements
      | click | search                   |
      | click | TestCustomEntityTemplate |

    And User clicks hide button if the alert exist
      | hide |

    And User clicks following Items
      | edit |

    And User enters data to necessary areas
#      | name | TestCustomDataTemplateEdit |
      | description | CustomEntityTemplateForTestEdit |

#    And User changes languages of relevant fields
#      | english |
#      | greek   |
#
#    And User enters data to necessary areas
#      | name | TestCustomDataTemplateEditEL |

    And User confirms the selection
      | save |
      | yes  |

    Then User should see verify message
      | success | success |

    And User clicks following dynamic elements
      | click | Dashboard |



