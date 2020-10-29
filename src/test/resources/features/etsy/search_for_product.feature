Feature: Search for product

  Scenario: Search by keyword
    Given Sharon is looking for products on Esty
    When she searches for "mask"
    Then she should only be shown products related to "Mask"



