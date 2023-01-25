Feature: Validate Place order on Khols.com

Scenario: Purchase a product from search page
Given user is on the search page
When user enter the searchText
And user selects the second item from the product page
And user clicks on add to cart page
And user clicks on view my cart page
Then user provides user details and payment option  