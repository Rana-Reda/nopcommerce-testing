@smoke
Feature: F08_Wishlist | users could add products to wishlist successfully.
  Scenario: User adds product to wishlist
    Given user is on homepage
    When user clicks on wishlist button on product
    Then A success message with green background is displayed successfully

  Scenario: wishlist contains the products user added
    Given user is on homepage
    When user clicks on wishlist button on product
    And user clicks on "Wishlist" Tab on the top of the page
    Then product Qty would be greater than 0 successfully