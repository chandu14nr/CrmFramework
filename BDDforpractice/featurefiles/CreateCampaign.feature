Feature: Campaign Module
Scenario: Create Campaign
Given User should be present on CRM home page
When He clicks on campaign module
Then Campaign page should be displayed
And he clicks on new Campaign button
Then Create campaign should be displayed
And he enters campaign name
And He enters the start date as ""
Then He enters expected revenue as "","" as actual cost
And He entrs num sent
And Selects type,status Dropdown
Then He enters the end date as ""
And He enters budgeted cost as "",expected revenue as ""
When He enters the description as ""
And He clicks on save button
Then Created campaign should be displayed