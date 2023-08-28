Feature: Carriers

  Background:
    Given login page opened
    And perform login with 'admin' 'admin'
    And open carriers page

  @SmokeTest @RegressionTest
  Scenario Outline: Create new carrier
    When add new carrier with '<name>' '<externalMappingId>'
    Then carrier '<name>' is added
    Examples:
      | name                |  externalMappingId |
      | Maria_Carrier1_ALPS | alps1              |

  @RegressionTest
  Scenario Outline: Create new carrier with existing external mapping ID
    When add new carrier with '<name>' '<externalMappingId>'
    And add new carrier with '<name>' '<externalMappingId>'
    Then duplicated value error-message is displayed
    Examples:
      | name                |  externalMappingId |
      | Maria_Carrier2_ALPS | alps2              |

  @SmokeTest @RegressionTest
  Scenario Outline: Suspend carrier
    When add new carrier with '<name>' '<externalMappingId>'
    And suspend carrier
    Then carrier is suspended
    Examples:
      | name                |  externalMappingId |
      | Maria_Carrier3_ALPS | alps3              |