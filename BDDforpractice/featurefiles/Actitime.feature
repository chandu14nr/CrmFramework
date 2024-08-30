Feature: Actitime Login feature
Scenario: Valid login
Given User Should be present in actitime login page
When He enters username
And he enters password
And click on login button
Then Home page should be displayed
