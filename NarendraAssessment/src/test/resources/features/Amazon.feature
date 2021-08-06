Feature: Assessment

  Scenario: verify kindle test in Amazon
    Given User able to navigate to required URL
    When User clicks hamburger menu
    And User Selects Kindle under Digital Content and Devices menu
    And User selects Kindle under Kindle E-Reader menu
    Then User verifies "Kindle" product page opens
    When User selects Buy Now button
    Then User able to see "E-mail address or mobile phone number" Label