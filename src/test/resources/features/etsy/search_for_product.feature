Feature: Search for product

  Scenario Outline: Search by keyword
    Given Sharon is looking for products on Esty
    When she searches for "<keyword>"
    Then she should only be shown products related to "<keyword>"
    Examples:
      | keyword |
      | mask    |
      | watch   |

  Scenario: Display product details
    Given Sharon has performed a search for "mask"
    When she views the details for the first listed item

