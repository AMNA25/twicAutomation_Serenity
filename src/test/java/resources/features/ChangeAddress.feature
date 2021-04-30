Feature: Change Address from User Profile
  Scenario Outline: User should be able to change the address
    Given User is on profile page
    When User fills address form with <line 1>, <line 2>, <city>, <zipcode> and <state>
    | line 1 | line 2 | city | zipcode | state |
    | <line 1> | <line 2> | <city> | <zipcode> | <state> |
    Then address should get updated
    Examples:
      | line 1 | line 2 | city | zipcode | state |
      | line 1 | line 2 | San Francisco  | 90201 | California |