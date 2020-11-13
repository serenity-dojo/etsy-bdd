Feature: Adding items to the shopping basket

  Scenario: The shopping basked is initially empty
    Given Sharon is looking for products on Esty
    When she views her shopping basket
    Then the basket should be empty
