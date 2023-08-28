Feature: Suppliers

  Background:
    Given login page opened
    And perform login with 'admin' 'admin'
    And open suppliers page

  @RegressionTest
  Scenario Outline: Add new office for supplier
    When add new supplier '<supplier>'
    And add new office '<officeName>' with '<address>' '<contactName>' '<contactPhone>' '<contactEmail>'
    Then office '<officeName>' is added
    Examples:
      | supplier         |  officeName | address    | contactName| contactPhone| contactEmail   |
      | TestSupplier_2   | TestOffice_2| Frunze 106 | Maria      | 1862525     | maria@gmail.com|

  @SmokeTest @RegressionTest
  Scenario Outline: Deactivate supplier
    When deactivate '<supplier>' supplier
    Then supplier '<supplier>' is deactivated
    Examples:
      | supplier     |
      | Adamello Ski |

