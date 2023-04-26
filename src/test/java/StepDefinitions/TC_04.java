package StepDefinitions;

import Pages.DialogContent;
import Pages.Selimpages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class TC_04  {

    DialogContent dc = new DialogContent();
    Selimpages se=new Selimpages();

    public TC_04(){


    }
    @And("I click on the set up")
    public void iClickOnTheSetUp() {
        se.clickMethod(se.getSetupBtn());
    }

    @And("I click on the parameters")
    public void iClickOnTheParameters() {
        se.clickMethod(se.getParameterBtn());

    }

    @And("I click on fields")
    public void iClickOnFields() {
        se.clickMethod(se.getFieldsBtn());
    }

    @And("I click on the add button")
    public void iClickOnTheAddButton() {
        se.clickMethod(se.getAddFields());
    }

    @And("fill up the new field form")
    public void fillUpTheNewFieldForm() {
        se.sendKeysMethod(se.getInputName(), "1MaxiiiGonzales");
        se.sendKeysMethod(se.getInputCode(), "1slm21");
    }

    @And("I click on the save button")
    public void iClickOnTheSaveButton() {
        se.clickMethod(se.getSaveBtn());
    }

    @Then("user should see the success message about adding new field")
    public void userShouldSeeTheSuccessMessageAboutAddingNewField() {
        se.waitUntilVisible(se.getSuccessMessage());
        Assert.assertTrue(se.getSuccessMessage().isDisplayed());
    }

    @And("I input a data in search name box")
    public void iInputADataInSearchNameBox() {
        se.sendKeysMethod(se.getInputNameSearchBox(), "1MaxiiiGonzales");

    }

    @And("click on search button")
    public void clickOnSearchButton() {
        se.clickMethod(se.getSearchBtn());
    }

    @And("I click edit button of a field that I want to edit")
    public void iClickEditButtonOfAFieldThatIWantToEdit() {
        se.wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("svg[data-icon='pen-to-square']"), 10));
        se.clickMethod(se.getEditBtn());
    }

    @And("I Change the Name")
    public void iChangeTheName() {
        se.sendKeysMethod(se.getInputName(),"1RaulGonza1");
    }

    @Then("user should see the success message about editing new field")
    public void userShouldSeeTheSuccessMessageAboutEditingNewField() {
        se.waitUntilVisible(se.getSuccessMessage());
        Assert.assertTrue(se.getSuccessMessage().isDisplayed());
    }

    @And("I send a created field name that i want to delete to the search box")
    public void iSendACreatedFieldNameThatIWantToDeleteToTheSearchBox() {

        se.sendKeysMethod(se.getInputNameSearchBox(),"1RaulGonza1");
        se.clickMethod(se.getSearchBtn());
    }

    @And("I click on the delete button")
    public void iClickOnTheDeleteButton() {
        se.wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("svg[data-icon='trash-can']"), 10));
       se.clickMethod(se.getDeleteBtn());
    }

    @And("I click on the warning delete")
    public void iClickOnTheWarningDelete() {
        se.clickMethod(se.getDeleteConfirmationBtn());
    }

    @Then("user should see the success message about deleting a field")
    public void userShouldSeeTheSuccessMessageAboutDeletingAField() {
        se.waitUntilVisible(se.getSuccessMessage());
        Assert.assertTrue(se.getSuccessMessage().isDisplayed());
    }
}
