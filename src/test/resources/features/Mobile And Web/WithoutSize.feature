Feature: add to bag without size
  Scenario: verify add to cart won't work without selecting size
    Given user opens the website
    Then user search for a product "search.product" in the search input field
    When user is on the product listing page
    Then click on a product
    And open the add to bag modal
    When add the product to the cart
    Then verify product can't be added to cart without a size