Feature: Register user
  Functionality of register user for
  internet shop seleniumdemo.com

  Scenario: Register with valid email address and password
    Given User is on main shop age
    When Go to My Account page
    And Enter correct data to registration form
    Then User is redirected to My Account page
    But Register form is not visible

  Scenario: Register with invalid email and password
    Given User is on main shop age
    When Go to My Account page
    And Enter incorrect data to registration form
    Then Invalid email error appears