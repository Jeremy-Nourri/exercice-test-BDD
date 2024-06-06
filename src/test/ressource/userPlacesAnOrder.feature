Feature: User places an order

  As a user i want to place an order

    Scenario: User places an order that is successful
        Given User is on any page
        When User click on the order button
        Then User should be redirected to the order page
        And User should see a form to fill in the order details
        When User fills in the order details
        And User click on the submit button
        Then User receives a confirmation message

    Scenario: User places an order that is unsuccessful
        Given User is on any page
        When User click on the order button
        Then User should be redirected to the order page
        And User should see a form to fill in the order details
        When User fills in the order details
        And User click on the submit button
        Then User receives an error message