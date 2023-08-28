Feature: Locations

  Background:
    Given login page opened
    And perform login with 'admin' 'admin'
    And open locations page

  @SmokeTest @RegressionTest
  Scenario Outline: Add new location
    When add location with '<name>' '<externalMarringId>'
    Then location '<name>' is added
    Examples:
      | name       |  externalMarringId |
      | Belarus3   | 1312               |