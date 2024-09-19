Feature: Mobile automation checking
  Scenario: validate with the wrong otp
    Given user open the application in mobile
    Then verify user on home screen
    When click on the account
    Then verify user on login screen
    When user fill the "9390635508" phone number
    And user click on the continue button
    Then verify user on otp screen
    When fill the otp with random numbers
    Then verify the entered otp is wrong


  Scenario: validate at first bag is empty
    Given user open the application in mobile
    Then verify user on home screen
    When user click on the bag button
    Then verify the bag is empty

  Scenario: validate the working of all buttons of the home screen
    Given user open the application in mobile
    Then verify user on home screen
    When search with "Shirt" in search bar
    Then verify each item with "Shirt" in title of the item


  Scenario: validate coupons are applying
    Given user open the application in mobile
    Then verify user on home screen
    When search with "Shirts" in search bar
    Then verify user on items screen
    When user click on the wishlist pop up
    When click on the first item
    Then verify user on the add to bag screen
    When click on the wishlist and similar button to remove popup
    When click on the add to bag button on checkout
    And select the "L" size and click on add to bag
    Then verify add to bag is changed to view bag
    When click on the view bag
    Then verify user on the payment screen
    When user store the amount before apply coupon
    When user click on the apply coupon
    Then validate user on coupon screen
    When click on the first coupon on the coupon screen
    And click on the cancel pop up
    Then verify coupon has applied




  Scenario: validate the item has more than 1 colors
    Given user open the application in mobile
    Then verify user on home screen
    When search with "Shirts" in search bar
    Then verify user on items screen
    When user click on the wishlist pop up
    When click on the first item
    Then verify user on the add to bag screen
    When click on the wishlist and similar button to remove popup
    When user scroll till the select size text
    Then validate the item has more than one color

  Scenario: validate user can login and logout successfully
    Given user open the application in mobile
    Then verify user on home screen
    When click on the account
    Then verify user on login page
    When click on the login sign up button
    When user fill the "9390635508" phone number
    And user click on the continue button
    Then verify user on otp screen
    When fill the otp manually
    Then verify user can successfully login
    When user scroll till the logout button
    And user click on the logout button
    Then verify user can successfully logout








































