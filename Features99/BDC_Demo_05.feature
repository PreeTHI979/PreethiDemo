Feature: BDC Demo for parameterization
 
Scenario Outline: I want to cross check the multiple users access for login
Given I am launching the webshop url
Then I will check on Login
When I enter username "<email>" and password "<password>"
And click on submit button
Then verify for user account status



Examples:
|email|password|
|preethi@gmail|pree@98|
|megha@gmail.com|Password123|
|jaya@gmail.com|jayaa@123|

