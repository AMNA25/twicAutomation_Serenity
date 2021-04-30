Feature: Positive Login
  Scenario: Login with valid credentials
    Given User is on Login page

    When User enters <email> in email field
    And User enters <password> in password field
    Then User should be able to login

      | email | password |
      | max@twic.ai | foobar |