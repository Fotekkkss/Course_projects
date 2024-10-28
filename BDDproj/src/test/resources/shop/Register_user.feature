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

  Scenario Outline: Register with invalid email and password
    #And Enter incorrect data to registration form
    And Enter email "test@test.com" and password "<password>"
    Then Invalid email error appears

    Examples:
    |password|
    |testassword123|
    |testassword1233323112%321@321dad|
    |testasswtestassword%%%%%%%123ord123|