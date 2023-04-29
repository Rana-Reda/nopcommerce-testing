@smoke
Feature: F06_HomeSliders | users could use sliders to go to a new page
  Scenario: first slider is clickable on home page
    Given user is on homepage
    When user clicks on first slider
    Then user is directed to a new url for this slider successfully

  Scenario: second slider is clickable on home page
    Given user is on homepage
    When user clicks on second slider
    Then user is directed to a new url for second slider successfully