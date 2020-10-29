Feature: Search for product

  Scenario Outline: Search by keyword
    Given Sharon is looking for products on Esty
    When she searches for "<keyword>"
    Then she should only be shown products related to "<keyword>"
Examples:
    | keyword |
    | mask    |
    | belt    |


