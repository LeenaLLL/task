@login
Feature:
  Scenario: Student login with valid credentials

    Given The student user is on the login page
    When  The student user enters valid "username" and "password"
    Then  The student user should be able to login successfully


  Scenario: Student login with invalid credentials

    Given The student user is on the login page
    When  The student user enters invalid "username" and "password"
    Then  The student user should not be able to login and see the "Sorry, Wrong Email or Password" or "This field is required."


