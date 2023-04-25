Feature: Login Functionality

  @SmokeTest
  Scenario Outline: Login with valid username and password
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should be able login successfully

