Feature: validate phone number functionality
#Scenario: check phone number validation
#  Given user open the application
#  Then validate user on home page
#  When user click on the signInButton
#  And enter the mobile number "123456"
#  And click on continue button
#  Then verify the error message is shown below
#    |Your mobile number should be of 10 digits. Please also ensure it does not start with 0 or +91.|




Scenario: Search with meaningless word and show the error message
  Given user open the application
  Then validate user on home page
  When user search with "ycyeuh"
  Then verify the items are shown



#Scenario: switching in between AJio and AJioLux
#  Given user open the application
#  Then validate user on home page
#  When user click on the visit ajioluxe tab
#  Then verify user on ajioluxe page
#


#Scenario: validate the price in desc order
#  Given user open the application
#  Then validate user on home page
#  When user search with "shirts"
#  Then verify user on shirts item page
#  When select price "Price (highest first)"
#  Then verify the price in desc order
#
#
##4
#Scenario: validate each item is searched item
#  Given user open the application
#  Then validate user on home page
#  When user search with "shirts"
#  Then verify user on shirts item page
#  Then user check the each item result with the "Shirt"
#
#
#
##5
#Scenario:validate add to bag
#  Given user open the application
#  Then validate user on home page
#  When user search with "shirts"
#  Then verify user on shirts item page
#  When click on first item
#  Then verify user on add to bag page
#  When click on the add to bag button
#  Then verify the item is added to bag
#
#
##6
#Scenario: validate at first cart is empty
#  Given user open the application
#  Then validate user on home page
#  When user click on the cart button
#  Then verify cart is empty
#
#
#
#Scenario: validate the price between 600 to 1200
#  Given user open the application
#  Then validate user on home page
#  When user search with "shirts"
#  Then verify user on shirts item page
#  When fill the min "600" and max "1200" amount
#  Then  validate the price is between min and max


#8Feature:

  Scenario: validate footer is working
    Given user open the application
    Then validate user on home page
    When go to footer and click on the men
    Then validate user on mens page

  Scenario: validate mouse hover is working on homepage
    Given user open the application
    Then validate user on home page
    When move the cursor to the men web element
    Then verify mouse hover is working or not






















