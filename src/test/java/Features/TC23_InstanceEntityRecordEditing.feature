Feature: Instance Entity Record Editing

  Background:
    Given Navigate to Testing Environment
    When Login with QA user credentials
    Then Login should be successfully

  @SmokeTest @Regression
  Scenario: TC-23 Instance Entity Record Editing Scenario

    And User clicks following dynamic elements
      | click | Entities          |
      | click | Instance Entities |
      | click | Instance Entity_1 |

    And User search the item
      | search | TestInstanceEntityTest |

    And User clicks following dynamic elements
      | click | search             |
      | click | TestInstanceEntityTest |

    And User clicks hide button if the alert exist
      | hide |

    And User clicks following Items
      | edit |

    And User edits the record with name
      | description | TestInstanceEntityForTestEdit |

    And User clicks following dynamic elements
      | click | Save |

    And User enters data to necessary areas
      | reason | TestInstanceEntityEdition |

    And User clicks following dynamic elements
      | click | Yes |

    Then User should see verify message
      | success | success |

    And User clicks following dynamic elements
      | click | Dashboard |




