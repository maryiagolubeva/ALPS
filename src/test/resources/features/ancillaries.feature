Feature: Ancillaries

  Background:
    Given login page opened
    And perform login with 'admin' 'admin'
    And open ancillaries page

  @SmokeTest @RegressionTest
  Scenario: Add root ancillary category
    When add 'TestAncillary_ALPS' ancillary category
    Then category 'TestAncillary_ALPS' is added successfully

  @RegressionTest
  Scenario: Edit ancillary category with empty field
    When add 'TestAncillary_ALPS' ancillary category
    And edit ancillary category with empty field
    Then save button is disabled

  @RegressionTest
  Scenario: Delete ancillary category
    When add 'TestAncillary_ALPS' ancillary category
    And delete ancillary category
    Then successful deletion 'TestAncillary_ALPS' message is displayed

  @SmokeTest @RegressionTest
  Scenario Outline: Delete ancillary what contained in some contracts
    When open contracts page
    And open new contract page
    And add '<description>' to description
    And select '<supplier>' supplier and '<office>' office
    And add '<ancillary>' ancillary from '<rootCategory>', '<category1>', '<category2>', '<category3>', '<category4>'
    And add '<displayName>' display name, '<displayDescription>' display description, '<suppliersAncillaryName>' supplier's ancillary name
    And save contract
    And delete '<ancillary>' ancillary from '<rootCategory>', '<category1>', '<category2>', '<category3>', '<category4>'
    Then unable delete ancillary error message
    Examples:
      | description       | supplier       | office         | ancillary               | rootCategory | category1   | category2                   | category3           | category4 | displayName | displayDescription | suppliersAncillaryName |
      | Contract Maria 2  |  Alpbach Aktiv |  Alpbach Aktiv | Full day ski lessons    | Tuition      | Ski lessons | Standard group ski lessons  |Full day ski lessons |           | Test_DN     | Test_DD            | Test_SN                |
