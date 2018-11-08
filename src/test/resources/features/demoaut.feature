Feature: Demoaut
  As a web user
  I want to register on the page
  login to the application
  perform a flight search
  and make a flight reservation


  Scenario: registration in the application
    Given that I opened  browser at Demoaut home page
    And I entered the registration section and entered my credentials
    When I confirm register of the application
    Then I verify if I'm truly registered