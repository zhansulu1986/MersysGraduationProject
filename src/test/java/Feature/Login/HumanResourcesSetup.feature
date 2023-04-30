#Test Case 1 : Validate ADD-EDIT-DELETE Position Categories Under Human Resources Setup for Admin User
#Mert Sozdinler

Feature:Human Resources Setup

  Background:

    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully


  Scenario: Add a Position Category

    When I click on the Position Categories tab
    And I click on the Add button
    And I enter the name "Marketing Manager"
    And I click on the Save button
    Then the new position category "Marketing Manager" should appear in the list

  @Regression
  Scenario: Edit a Position Category
    When I click on the Position Categories tab
    And I click on the Edit button next to the "Marketing Manager" position category
    And I change the name to "Sales Manager"
    And I click on the Save button
    And the updated position category "Sales Manager" should appear in the list
    Then the old position category "Marketing Manager" should not appear in the list

  @Regression
  Scenario: Delete a Position Category
    When I click on the Position Categories tab
    And I click on the Delete button next to the "Sales Manager" position category
    And I confirm the deletion
    And I should see a success message
    Then the deleted position category "Sales Manager" should not appear in the list.