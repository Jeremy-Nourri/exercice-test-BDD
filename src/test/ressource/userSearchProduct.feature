Feature: User search for a product

    Scenario: User searches for a product
        Given User is on search bar
        When User fills in a name of a product
        Then User should see a list of products that match the name
