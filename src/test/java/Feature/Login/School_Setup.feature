Feature: As an Admin User I should be able to Add-Edit-Delete School Locations under School Setup

  Background: Login step
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully


    Scenario: Validate Add button on School Location positive test
      Given Click on setup button
      When Click on school Setup button
      And Click on locations button
      And Click on Add button
      And I enter new school name
      And I input short name
      And Enter a number for capacity
      Then Click on save button
      Then Success message should be displayed

      Scenario: Validate Add button on School Location negative test
        Given Click on setup button
        When Click on school Setup button
        And Click on locations button
        And Click on Add button
        And I enter new school name
        And I input short name
        And Enter a number for capacity
        Then Click on save button
        Then Already exists message should be displayed

        Scenario: Edit School Location
          Given precondition step one
          And Click on Edit button
          And I enter new school name after edit
          Then Click on save button
         Then Success message update should be displayed

          Scenario: Delete School Location
            Given precondition step one
            And Click Delete button
            Then Successfully   message should be displayed



