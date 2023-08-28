Feature: Contracts

  Background:
    Given login page opened
    And perform login with 'admin' 'admin'

  @SmokeTest @RegressionTest
  Scenario Outline: Activate new contract
    When open new contract page
    And add '<description>' to description
    And add valid from '<contractValidFromDay>' '<contractValidFromMonth>' '<contractValidFromYear>'
    And add valid to '<contractValidToDay>' '<contractValidToMonth>' '<contractValidToYear>'
    And select '<netCostCurrency>' '<publicPriceCurrency>' to net cost currency and public price currency
    And select '<supplier>' supplier and '<office>' office
    And add '<ancillary>' ancillary from '<rootCategory>', '<category1>', '<category2>', '<category3>', '<category4>'
    And add '<displayName>' display name, '<displayDescription>' display description, '<suppliersAncillaryName>' supplier's ancillary name
    And add supplied date from '<suppliedValidFromDay>' '<suppliedValidFromMonth>' '<suppliedValidFromYear>'
    And add supplied date to '<suppliedValidToDay>' '<suppliedValidToMonth>' '<suppliedValidToYear>'
    And add '<condition>' condition with operator '<operator>' and parameter '<parameter>'
    And add cost with '<publicPrice>' public price and '<netCost>' net cost
    And activate contract
    Then contract is activated
    Examples:
      | description      | netCostCurrency | publicPriceCurrency | supplier        | office          | ancillary |rootCategory| category1 | category2| category3|category4| displayName | displayDescription | suppliersAncillaryName | condition               | operator | parameter       | publicPrice | netCost | contractValidFromDay|contractValidFromMonth|contractValidFromYear|contractValidToDay|contractValidToMonth|contractValidToYear|suppliedValidFromDay|suppliedValidFromMonth|suppliedValidFromYear|suppliedValidToDay|suppliedValidToMonth|suppliedValidToYear|
      | Contract Maria 1 | GBP             | GBP                 |  Alpbach Aktiv  |  Alpbach Aktiv  | Helmet    |Equipment   |Helmet Hire|Helmet    |          |         | Helmet_DN   | Helmet_DD          | Helmet_SN              | Booking passenger count | Less Than| 5               | 10          | 5       |5                    |May                   |2020                 |22                |April               |2021               |5                   |May                   |2020                 |22                |April               |2021               |

  @RegressionTest
  Scenario Outline: Create new contract without required fields
    When open new contract page
    And add '<description>' to description
    And select '<supplier>' supplier and '<office>' office
    And activate contract
    Then error message about required info is displayed
    Examples:
      | description      |  supplier      | office          |
      | Contract Maria 1 |  Alpbach Aktiv |  Alpbach Aktiv  |

  @SmokeTest @RegressionTest
  Scenario Outline: Suspend contract
    When open new contract page
    And add '<description>' to description
    And add valid from '<contractValidFromDay>' '<contractValidFromMonth>' '<contractValidFromYear>'
    And add valid to '<contractValidToDay>' '<contractValidToMonth>' '<contractValidToYear>'
    And select '<netCostCurrency>' '<publicPriceCurrency>' to net cost currency and public price currency
    And select '<supplier>' supplier and '<office>' office
    And add '<ancillary>' ancillary from '<rootCategory>', '<category1>', '<category2>', '<category3>', '<category4>'
    And add '<displayName>' display name, '<displayDescription>' display description, '<suppliersAncillaryName>' supplier's ancillary name
    And add supplied date from '<suppliedValidFromDay>' '<suppliedValidFromMonth>' '<suppliedValidFromYear>'
    And add supplied date to '<suppliedValidToDay>' '<suppliedValidToMonth>' '<suppliedValidToYear>'
    And add '<condition>' condition with operator '<operator>' and parameter '<parameter>'
    And add cost with '<publicPrice>' public price and '<netCost>' net cost
    And activate contract
    And suspend contract
    Then contract is suspended
    Examples:
      | description      | netCostCurrency | publicPriceCurrency | supplier        | office          | ancillary |rootCategory| category1| category2| category3|category4| displayName | displayDescription | suppliersAncillaryName | condition        | operator | parameter       | publicPrice | netCost | contractValidFromDay|contractValidFromMonth|contractValidFromYear|contractValidToDay|contractValidToMonth|contractValidToYear|suppliedValidFromDay|suppliedValidFromMonth|suppliedValidFromYear|suppliedValidToDay|suppliedValidToMonth|suppliedValidToYear|
      | Contract Maria 1 | GBP             | GBP                 |  Alpbach Aktiv  |  Alpbach Aktiv  | Helmet    |Equipment   |Helmet Hire|Helmet   |          |             | Helmet_DN   | Helmet_DD          | Helmet_SN              | Booking passenger count | Less Than       | 5 | 10          | 5       |5                |May                 |2020                   |22                |April               |2021               |5                |May                 |2020                   |22                |April               |2021               |

  @SmokeTest @RegressionTest
  Scenario Outline: Create new version of contract
    When open new contract page
    And add '<description>' to description
    And add valid from '<contractValidFromDay>' '<contractValidFromMonth>' '<contractValidFromYear>'
    And add valid to '<contractValidToDay>' '<contractValidToMonth>' '<contractValidToYear>'
    And select '<netCostCurrency>' '<publicPriceCurrency>' to net cost currency and public price currency
    And select '<supplier>' supplier and '<office>' office
    And add '<ancillary>' ancillary from '<rootCategory>', '<category1>', '<category2>', '<category3>', '<category4>'
    And add '<displayName>' display name, '<displayDescription>' display description, '<suppliersAncillaryName>' supplier's ancillary name
    And add supplied date from '<suppliedValidFromDay>' '<suppliedValidFromMonth>' '<suppliedValidFromYear>'
    And add supplied date to '<suppliedValidToDay>' '<suppliedValidToMonth>' '<suppliedValidToYear>'
    And add '<condition>' condition with operator '<operator>' and parameter '<parameter>'
    And add cost with '<publicPrice>' public price and '<netCost>' net cost
    And activate contract
    And create contract new version
    Then draft is created
    Examples:
      | description      | netCostCurrency | publicPriceCurrency | supplier        | office          | ancillary |rootCategory| category1| category2| category3|category4| displayName | displayDescription | suppliersAncillaryName | condition        | operator | parameter       | publicPrice | netCost | contractValidFromDay|contractValidFromMonth|contractValidFromYear|contractValidToDay|contractValidToMonth|contractValidToYear|suppliedValidFromDay|suppliedValidFromMonth|suppliedValidFromYear|suppliedValidToDay|suppliedValidToMonth|suppliedValidToYear|
      | Contract Maria 1 | GBP             | GBP                 |  Alpbach Aktiv  |  Alpbach Aktiv  | Helmet    |Equipment   |Helmet Hire|Helmet   |          |             | Helmet_DN   | Helmet_DD          | Helmet_SN              | Booking passenger count | Less Than       | 5 | 10          | 5       |5                |May                 |2020                   |22                |April               |2021               |5                |May                 |2020                   |22                |April               |2021               |

  @SmokeTest @RegressionTest
  Scenario Outline: Delete contract
    When open new contract page
    And add '<description>' to description
    And select '<supplier>' supplier and '<office>' office
    And delete contract
    Then contract is deleted
    Examples:
      | description      |  supplier        | office          |
      | Contract Maria 1 |   Alpbach Aktiv  |  Alpbach Aktiv  |