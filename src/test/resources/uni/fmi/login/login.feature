Feature: Log in into a System

  Scenario: Log in into a System with a valid user data
    Given User open a log in screen
    When Insert a valid user email
    And Insert a valid user password
    And press login button
    Then check at the succesfull message

  Scenario: Log in into a System without a password
    Given User open a log in screen
    When Insert a valid user email
    And press login button
    Then check at the missing data message

  Scenario: Log in into a System without a email
    Given User open a log in screen
    When Insert a valid user password
    And press login button
    Then check at the missing data message

  Scenario: Log in into a System without a user data
    Given User open a log in screen
    And press login button
    Then check at the missing data message

  Scenario: Log in into a System without a valid user data
    Given User open a log in screen
    When Insert a invalid user email
    And Insert a invalid user password
    And press login button
    Then check at the wrong data message
