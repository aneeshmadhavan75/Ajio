Feature: Ecommerce functionality verification

  Scenario: verify coupons are working
    Given user opens the website
    Then user search for a product "search.product" in the search input field
    When user is on the product listing page
    Then click on a product
    And select a size for the product
    Then add the product to the cart
    And go to the cart page
    When user is on the cart page select a coupon and click apply
    Then verify the selected coupon is applied to the product








