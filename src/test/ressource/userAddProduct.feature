Feature: user adds product

  As a user i want to add a product to my cart

    Scenario : User adds a product to cart
        Given User is on the product page
        When User clicks on the add to cart button
        Then The product should be added to my cart

      Scenario: User adds a product to cart that is already in the cart
        Given User is on the product page
        When User clicks on the add to cart button
        Then The quantity of the product in the cart should be increased by 1