@regression
Feature: Preordering Iphone Feature
  @preorder
  Scenario: Preordering Iphone Scenario
    Given Go to verizon.com
    Then hover over phone
    Then click on Smartphone
    Then Click on Apple Iphone 11Pro Max
    And Click on Gold color
    And Click on 256GB
    Then Click on Continue Button
    Then Enter zipcode
    And Click on Confirm Location
    Then Click on New Customer button
    Then Verify the price