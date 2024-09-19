Feature: functionality of product listing page

  Background:
    Given user opens the website

  Scenario: verify total number of products equals the number along category
    Then hover over men section and click on a type "cloth.type"
    When product list page is displayed select a category
    Then verify the number along the category is same as total products

  Scenario Outline: verify every product is of the same brand
    And user hovers above a menu in the header section
    Then hover over the brand menu option
    And select a particular brand "<web.brand>"
    When user is on the product listing page of the brand "<web.brand>"
    Then verify every product is of the selected brand "<web.brand>" only

    Examples:

    | web.brand                  |
    | DENNISLINGO PREMIUM ATTIRE |
    | LOUIS PHILIPPE             |
    | ALLEN SOLLY                |
    | THE BEAR HOUSE             |