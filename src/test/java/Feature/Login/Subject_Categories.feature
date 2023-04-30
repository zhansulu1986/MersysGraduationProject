Feature: add,edit,delete functionality for subject categories

  Background: Login step
Given Navigate to Campus
When Enter username and password
And Click on Login Button
Then User should login successfully

  Scenario: Add Subject Category positive test
  Given  Click on the Position Category under setup
  When Add new position category
  Then Verify success message
    Then I click on delete Subject Category

    Scenario: Add Subject Category Negative test
      Given  Click on the Position Category under setup
      When  Add the same  position category
      Then I should see error message
      Then I delete Subject Category

      Scenario: Edit Subject Category
        Given  Click on the Position Category under setup
        When  Add new position category
        And I edit this position
        And Change the subject name
        Then I should be able to see successful updated message

Scenario: Delete Subject Category
  Given  Click on the Position Category under setup
  When  Add new position category
  And I click  delete Subject Category
  Then I should be able to delete subject successful message

  Scenario: Find Deleted Subject Category
    Given  Click on the Position Category under setup
    When  Add new position category
    And I click  delete Subject Category
    And I try to find deleted subject category
    Then I should be able to see no data message