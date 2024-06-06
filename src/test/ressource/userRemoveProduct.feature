Feature: User remove product from cart

  As a user i want to remove product from cart

    Scenario : User remove product that has only one quantity
        Given User is on the cart page
        When User click on remove button that is next to all products
        Then Product should be removed from cart

    Scenario : User remove product that has more than one quantity
        Given User is on the cart page
        When User click on remove button that is next to product
        Then Product quantity should be decreased by one

    Scenario : User remove product that is not in cart
        Given User is on the cart page
        When User click on remove button that is next to product
        Then An Error should be display