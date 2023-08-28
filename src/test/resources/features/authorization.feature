Feature: Authorization

  @SmokeTest @RegressionTest
  Scenario: Successful login
    Given login page opened
    When perform login with 'admin' 'admin'
    Then contracts page is opened

  @RegressionTest
  Scenario: Unsuccessful login with invalid data
    Given login page opened
    When perform login with 'adminInvalid' 'setupInvalid'
    Then invalid login error-message is displayed

  @RegressionTest
  Scenario: Login with empty fields
    Given login page opened
    When perform login with '' ''
    Then invalid login error-message is displayed

  @RegressionTest
  Scenario: View password
    Given login page opened
    When enter password '1234'
    And view password
    Then password is displayed

  @SmokeTest @RegressionTest
  Scenario: Logout
    Given login page opened
    When perform login with 'admin' 'admin'
    And perform logout
    Then login page is displayed

  @SmokeTest @RegressionTest
  Scenario: Login as admin
    Given login page opened
    When perform login with 'admin' 'admin'
    Then users page is available

  @SmokeTest @RegressionTest
  Scenario Outline: Login as guest
    Given login page opened
    When perform login with 'admin' 'admin'
    And open users page
    And admin register user with '<email>' '<firstName>' '<lastName>' '<password>' '<role>'
    And perform logout
    And perform login with '<email>' '<password>'
    Then users page is not available
    Examples:
      | email                  |  firstName | lastName |password | role   |
      | guest1_alps@gmail.com  | Maria      | Guest    | 1111    |  Guest |