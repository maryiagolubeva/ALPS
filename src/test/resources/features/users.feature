Feature: Users

  Background:
    Given login page opened
    And perform login with 'admin' 'admin'
    And open users page

  @SmokeTest @RegressionTest
  Scenario Outline: New user creation
    When  admin register user with '<email>' '<firstName>' '<lastName>' '<password>' '<role>'
    Then success message is displayed
    And disable checkbox is appeared
    Examples:
      | email                   |  firstName | lastName | password | role   |
      | guest_apls_1@gmail.com  | Maria      | Guest    | 1111     |  Guest |

  @RegressionTest
  Scenario Outline: New user creation with existing email
    When admin register user with '<email>' '<firstName>' '<lastName>' '<password>' '<role>'
    And come back to users page
    And admin register user with '<email>' '<firstName>' '<lastName>' '<password>' '<role>' with error
    Then error message under email field is displayed
    Examples:
      | email                     |  firstName | lastName |password | role   |
      | guest_apls_2@gmail.com    | Maria      | Guest    | 1111    |  Guest |

  @RegressionTest
  Scenario Outline: Login with disable user data
    When admin register user with '<email>' '<firstName>' '<lastName>' '<password>' '<role>'
    And disable user
    And perform logout
    And perform login with '<email>' '<password>'
    Then invalid login error-message is displayed
    Examples:
      | email                     |  firstName | lastName |password | role   |
      | guest_apls_3@gmail.com    | Maria      | Guest    | 1111    |  Guest |

  @RegressionTest
  Scenario Outline: Edit personal user info
    When admin register user with '<email>' '<firstName>' '<lastName>' '<password>' '<role>'
    And perform logout
    And perform login with '<email>' '<password>'
    And open personal info page
    And edit personal info to '<newFirstName>' '<newLastName>'
    Then personal user info changed to '<newFirstName>' '<newLastName>'
    Examples:
      | email                     |  firstName | lastName |password | role   |  newFirstName |  newLastName |
      | guest_apls_4@gmail.com    | Maria      | Guest    | 1111    |  Guest | Masha         | Test         |

  @RegressionTest
  Scenario Outline: Edit personal user info - change password with invalid old password
    When admin register user with '<email>' '<firstName>' '<lastName>' '<password>' '<role>'
    And perform logout
    And perform login with '<email>' '<password>'
    And open personal info page
    And open change password dialog
    And change password with '<incorrectOldPassword>' '<newPassword>'
    Then error message under old password field is displayed
    Examples:
      | email                  |  firstName | lastName |password | role   |  newPassword| incorrectOldPassword|
      | guest_apls_5@gmail.com | Maria      | Guest    | 1111    |  Guest | 2222        | 7777                |

  @RegressionTest
  Scenario Outline:   Change user role
    When admin register user with '<email>' '<firstName>' '<lastName>' '<password>' '<role>'
    And change role to '<newRole>'
    Then role changed to '<newRole>'
    Examples:
      | email                  |  firstName | lastName |password | role   |  newRole|
      | guest_apls_6@gmail.com | Maria      | Guest    | 1111    |  Guest | User    |





