package StepDefinitions;

import Pages.SubjectCategory_POM;
import Utilities.BasicDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Subject_CategoryStep {
    SubjectCategory_POM sc = new SubjectCategory_POM();
    String name= "Subject 7";
    String code = "5500";


    public void findSubject(){
   sc.sendKeysMethod(sc.getNameInSearch(),name);
   sc.clickMethod(sc.getSearchButton());
    }

    public void deleteSubject(){
        sc.wait(2);
        sc.clickMethod(sc.getDeleteAfterSearch());
        sc.clickMethod(sc.getConfirmDeleteBtn());
    }
    @Given("Click on the Position Category under setup")
    public void clickOnThePositionCategoryUnderSetup() {
       sc.clickMethod(sc.getEducation());
       sc.clickMethod(sc.getSetup());
       sc.clickMethod(sc.getSubject());


    }

    @When("Add new position category")
    public void addNewPositionCategory() {
        sc.wait(3);
        sc.clickMethod(sc.getAddButton());
        sc.clickMethod(sc.getInputName());
        sc.sendKeysMethod(sc.getInputName(),name);
        sc.sendKeysMethod(sc.getInputCode(),code);
        sc.clickMethod(sc.getSaveButton());
    }

    @Then("Verify success message")
    public void verifySuccessMessage() {
        sc.wait(3);
        Assert.assertEquals(sc.getCreatedSubject().getText(),"Subject 7");

    }

    @When("Add the same  position category")
    public void addTheSamePositionCategory() {
        addNewPositionCategory();
        BasicDriver.getDriver().navigate().refresh();
  sc.wait(2);
        addNewPositionCategory();
    }

    @Then("I should see error message")
    public void iShouldSeeErrorMessage() {
        sc.verifyContainsText(sc.getErrorMessage(),"already exists");
    }

    @Then("I delete Subject Category")
    public void iDeleteSubjectCategory() {
        sc.clickMethod(sc.getCloseDialog());
        findSubject();
        sc.wait(2);
        deleteSubject();

    }

    @And("I edit this position")
    public void iEditThisPosition() {
        findSubject();
        sc.wait(2);
sc.clickMethod(sc.getEditBtn());

    }

    @And("Change the subject name")
    public void changeTheSubjectName() {
        sc.sendKeysMethod(sc.getInputName2(),name+"AAA");
        sc.clickMethod(sc.getSaveButton());
    }

    @Then("I should be able to see successful updated message")
    public void iShouldBeAbleToSeeSuccessfulUpdatedMessage() {

        sc.wait(3);
        Assert.assertEquals(sc.getNewSubject().getText(),"Subject 7AAA");
        sc.clickMethod(sc.getDeleteAfterSearch());
        sc.clickMethod(sc.getConfirmDeleteBtn());

    }

    @And("I click  delete Subject Category")
    public void iClickDeleteSubjectCategory() {
        findSubject();
        deleteSubject();
    }

    @Then("I should be able to delete subject successful message")
    public void iShouldBeAbleToDeleteSubjectSuccessfulMessage() {
        sc.wait(3);
        Assert.assertEquals(sc.getInfoDisplay().getText(),"There is no data to display");
    }

    @And("I try to find deleted subject category")
    public void iTryToFindDeletedSubjectCategory() {
        findSubject();
    }

    @Then("I should be able to see no data message")
    public void iShouldBeAbleToSeeNoDataMessage() {
        sc.wait(3);
        Assert.assertEquals(sc.getInfoDisplay().getText(),"There is no data to display");
    }


    @Then("I click on delete Subject Category")
    public void iClickOnDeleteSubjectCategory() {
        findSubject();
        sc.wait(3);
        deleteSubject();
    }
}
