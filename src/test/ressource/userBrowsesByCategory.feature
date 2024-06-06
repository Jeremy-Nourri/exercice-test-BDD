Feature: User browses by category

  As a user i want to be able to browse by category to discover products

    Scenario: User browses by category
        Given User is on any page
        When He clicks on a category link in the navigation
        Then He should be in the category page
        And He should see a list of products in that category
