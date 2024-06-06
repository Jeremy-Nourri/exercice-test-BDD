Feature: User sign up

    As a user i want sign up to place orders

    Scenario: User can sign up
        Given User is on sign up page
        When User fills in Username
        And User fills in Email
        And User fills in Password
        And User presses Sign up
        Then User should receive a confirmation email


    Scenario:  User sign up but username is already taken
        Given User is on sign up page
        When User fills in Username
        And User fills in Email
        And User fills in Password
        And User presses Sign up
        Then User should receive an error message
