Feature: Customer care page
  Scenario: verify customer care message is displayed properly
    Given user opens the website
    Then user clicks on customer care option
    When user select topic "Topic" and issue
    Then verify message is displayed in the get assistance section