Feature: Test shopping functionality on a computer store website

  Scenario: Purchase a computer with specific configurations
    Given I am on the website homepage
    When I select "Computers" -> "Desktop" -> "Build your own computer"
    And I configure the computer with "2 GB" RAM, select the operating system, and choose software options
    And I select the HDD "320 GB"
    And I add the product to the cart and click "Checkout"
    Then I should see the product in the shopping cart
