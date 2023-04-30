package StepDefinitions;

import Pages.SchoolSetup_POM;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.security.Key;

public class School_SetupStep {

    SchoolSetup_POM ss = new SchoolSetup_POM();

    String name = "Indiana";
    String shortName = "IN";



    public void findSubject(){
      //  ss.sendKeysMethod(ss.getLocationUnderSchoolSetup().click();
      //  ss.clickMethod(ss.getAddButton());
    }
        @Given("Click on setup button")
        public void clickOnSetupButton() {
       ss.clickMethod(ss.getSetupBtn());

        }
        @When("Click on school Setup button")
        public void clickOnSchoolSetupButton() {
            ss.wait(3);
            ss.clickMethod(ss.getSchoolSetupButton());
        }

    @And("Click on locations button")
    public void clickOnLocationsButton() {
            ss.clickMethod(ss.getLocationUnderSchoolSetup());
    }

    @And("Click on Add button")
    public void clickOnAddButton() {
            ss.clickMethod(ss.getAddButton());
    }

    @And("I enter new school name")
    public void iEnterNewSchoolName() {
        ss.wait(3);
       // ss.clickMethod(ss.getNameInput());
        ss.sendKeysMethod(ss.getNameInput(),name);
       
      
       

    }
    @And("I input short name")
    public void iInputShortName() {
        ss.sendKeysMethod(ss.getShortNameInput(),shortName);
    }

    @And("Enter a number for capacity")
    public void enterANumberForCapacity()  {
        ss.sendKeysMethod(ss.getCapacityInput(),"1500");
        ss.clickMethod(ss.getCapacityInput());
       ss.clickMethod(ss.getShortNameInput());

    }

    @Then("Click on save button")
    public void clickOnSaveButton() {
        ss.clickMethod(ss.getSaveButton());
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        // ss.wait(3);
       // Assert.assertTrue(ss.getSchoolSetupButton().getText().contains("successfully"));
       // Assert.assertEquals(ss.getSchoolSetupButton().getText(),"");
       // Assert.assertEquals(ss.getSchoolSetupButton().getText(),"");
        ss.verifyContainsText(ss.getSuccessMessage(), "successfully");


    }

    @Then("Already exists message should be displayed")
    public void alreadyExistsMessageShouldBeDisplayed() {
           ss.verifyContainsText(ss.getErrorMessage(),"already exists");

    }

    @Given("precondition step one")
    public void preconditionStepOne() {
        ss.clickMethod(ss.getSetupBtn());
        ss.wait(3);
        ss.clickMethod(ss.getSchoolSetupButton());
        ss.clickMethod(ss.getLocationUnderSchoolSetup());

    }

    @And("Click on Edit button")
    public void clickOnEditButton() {
            ss.clickMethod(ss.getEditButton());
    }

    @And("I enter new school name after edit")
    public void iEnterNewSchoolNameAfterEdit() {
            ss.sendKeysMethod(ss.getNameInput(),"Eduard");
    }

    @Then("Success message update should be displayed")
    public void successMessageUpdateShouldBeDisplayed() {
        ss.wait(3);
        Assert.assertTrue(ss.getUpdatedMessage().getText().contains("update"));
    }
    @And("Click Delete button")
    public void clickDeleteButton() {
            ss.clickMethod(ss.getDeleteButton());
            ss.clickMethod(ss.getConfirmDelete());

    }

    @Then("Successfully   message should be displayed")
    public void successfullyMessageShouldBeDisplayed() {
        ss.wait(3);
       // ss.verifyContainsText(ss.getConfirmDeleteMessage(),"Location successfully");
    }
}


