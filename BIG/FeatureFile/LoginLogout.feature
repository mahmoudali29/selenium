Feature: Registered and Non registered user will come on application and perform activities

Scenario: Registered user comes to application, login and logout
  Given User is on login page
  When User enters username
  And User enters password
  And User clicks on signin button
  Then User should be logged in
  When User clicks on logout button
  Then User should be logged out

Scenario: Non registered user comes to application, register, and login
  Given User is on registration page
  When User enters username
  And User enters email address
  And User enters password
  And User confirms password
  And User enters date of birth
  And User enters phone number
  And User enters address
  And User selects home address type
  And User selects gender
  And User selects country
  And User selects state
  And User selects city
  And User enters zip code
  And User agrees to the terms
  And User clicks on signup button
  Then User account should be created
