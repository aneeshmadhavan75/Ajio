Feature: sort by rating category
  Scenario: verify selected rating is applied to the products
    Given user opens the website
    And clicks on the home and kitchen menu from the header
    When user is on home and kitchen page, click on a rating "rating.option"
    Then verify the products have the selected rating only