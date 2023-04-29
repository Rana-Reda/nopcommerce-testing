@smoke
Feature: F07_followUs | users could open followUs links.
  Scenario Outline: user opens facebook link.
    Given user is on homepage
    When user opens facebook link
    Then Facebook page "<url>" is opened in new tab successfully

    Examples:
      | url                                  |
      | https://www.facebook.com/nopCommerce |


  Scenario Outline: user opens twitter link.
    Given user is on homepage
    When user opens twitter link
    Then twitter page "<url>" is opened in new tab successfully

    Examples:
      | url                             |
      | https://twitter.com/nopCommerce |


  Scenario Outline: user opens rss link.
    Given user is on homepage
    When user opens rss link
    Then rss page "<url>" is opened in new tab successfully

    Examples:
      | url                                                   |
      | https://demo.nopcommerce.com/new-online-store-is-open |


  Scenario Outline: user opens youTube link.
    Given user is on homepage
    When user opens youTube link
    Then youTube page "<url>" is opened in new tab successfully

    Examples:
      | url                                      |
      | https://www.youtube.com/user/nopCommerce |