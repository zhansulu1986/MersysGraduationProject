Feature: Fields feature under Human Resources Setup position

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully

  Scenario: Validate as an Admin User i should be able to add a new field in Human Resources Setup position
    When Navigate to positions under human resources
    And I click on the add button
    And fill up the new data into form
    And I click on the save button
    Then user should see the success message about adding new field

  Scenario: Validate as an Admin User is  able to edit with new code in created field in  Human Resources Setup position

    When Navigate to positions under human resources
    And I input a data in search name box
    And click on search button
    And  I click edit button of a field that I want to edit
    And  I Change the data
    And I click on the save button
    Then user should see the success message about editing new field


  Scenario: Validate as an Admin User is able to delete a created field in Human Resources Setup position

    When Navigate to positions under human resources
    And I send a created position data that i want to delete to the search box
    And  click on search button
    And I click on the delete button
    And I click on the confirmation delete
    Then user should see the success message about deleting a field