Feature:

Background: Clearing the browser cache
Given I am clicking the shortcut for browser cache
And ensuring for deletion of all the cookies



Scenario: User login into DemoWebshop from BDC
Given bdc user having valid credentials
And user tries to provide the data for the login process


Scenario: User logout DemoWebshop from BDC
Given bdc user is able to see the logout button
And user clicks on the logout button to close the window