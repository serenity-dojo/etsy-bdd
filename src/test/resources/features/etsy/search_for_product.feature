Feature: Search for product

  Scenario: Search by keyword
    Given Sharon is looking for products on Esty
    When she searches for "mask"
    Then she should only be shown products related to "mask"

  @current
  Scenario: Display product details
    Given Sharon has performed a search for "mask"
    When she views the details for the first listed item
    Then the correct details for the listed item should be displayed

