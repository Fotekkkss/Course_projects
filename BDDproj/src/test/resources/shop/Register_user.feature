Feature: Register user
  Functionality of register user for
  internet shop seleniumdemo.com

  Background: User is on My Account Page
    Given User is on main shop age
    When Go to My Account page

  Scenario: Register with valid email address and password
    And Enter correct data to registration form
    Then User is redirected to My Account page
    But Register form is not visible

  Scenario: Register with invalid email and password
    And Enter incorrect data to registration form
    Then Invalid email error appears