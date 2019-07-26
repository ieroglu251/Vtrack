Feature: Login into Application

  @Search
Scenario Outline:Positive test validating login.

Given Initialize the browser with chrome
And Navigate to "http://qa2.vytrack.com/user/login" Site
When User enters <username> and <password> and logs in
Then Verify that user is succesfully logged in
And close browsers
  Examples:
    |username			|password	|
    |user176        	|UserUser123|
