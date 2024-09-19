Feature: cart functionality

  Background:
    Given user opens the website
    Then user search for a product "search.product" in the search input field
    When user is on the product listing page
    Then click on a product
    And select a size for the product
    Then add the product to the cart
    And go to the cart page

  Scenario: verify the delete button inside cart is working
    When user is on the cart page click on the delete button
    Then verify the product is removed from the cart

  Scenario: verify quantity in the cart is updating
    When user is on the cart page change the quantity of the product
    Then verify the price is changed based on quantity