Feature: User sign in

    As a user i want to sign in to my account and place orders

    Scenario: User sign in successfully
        Given User is on the sign in page
        When User fills in Email
        And User fills in Password
        And User presses Sign in
        Then User should be on the home page

    Scenario: User sign in with invalid email or password
        Given User is on the sign in page
        When User fills in Email
        And User fills in Password
        And User presses Sign in
        Then User should see Invalid email or password
