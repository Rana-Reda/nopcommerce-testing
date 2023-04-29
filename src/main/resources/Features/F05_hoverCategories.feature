@smoke
Feature: F05_HoverCategories | users could use Hover functionality to choose any category
  Scenario: user could hover to choose a category and sub category.
    Given user is on homepage
    When user hovers on one of the three main categories
    And user select one of the three sub categories
    Then the selected sub category opens successfully