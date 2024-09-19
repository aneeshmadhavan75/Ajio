Feature: go to top from bottom functionality
  Scenario: verify the goto the top button is working
    Given user opens the website
    And user navigates to the bottom of the page
    When user clicks on the goto top arrow button
    Then user must reach the top of the page