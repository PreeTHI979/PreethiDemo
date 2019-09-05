Feature: Guest user actions in Demo WebShop

Background: Login process in DemoWebshop
Given User logins with valid credntials in DemoWebshop
And Clicks on login buton

Scenario: User adds Books to the cart
Given user clicks on the books
And user is able to add a book to the cart
Then user clicks the logout button to close the window

Scenario: User adds items to his cart of his choice
Given user clicks on the computers
And user adds computer to the cart
Then user clicks the logout button



