package StepDefinitions;

import Pages.DialogContent_MertSozdinler_TC1;
import Utilities.BasicDriver;
import Utilities.MyMethods;
import com.sun.source.tree.AssertTree;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Human_Resources_Setup_TC1 extends MyMethods {

    DialogContent_MertSozdinler_TC1 dcM = new DialogContent_MertSozdinler_TC1();
    WebDriverWait wait = new WebDriverWait(BasicDriver.getDriver(), Duration.ofSeconds(10));

    @When("I click on the Position Categories tab")
    public void iClickOnThePositionCategoriesTab() {
        dcM.waitUntilClickable(dcM.getHumanResourcesButton());
        dcM.clickMethod(dcM.getHumanResourcesButton());
        dcM.clickMethod(dcM.getSetupForHumanResourcesButton());
        dcM.clickMethod(dcM.getPositionsCategoriesButton());

    }

    @And("I click on the Add button")
    public void iClickOnTheAddButton() {
        dcM.clickMethod(dcM.getAddButtonForPositionCategory());

    }

    @And("I enter the name \"Marketing Manager\"")
    public void iEnterTheName() {
        dcM.getInputNameNewPositionCategory().sendKeys("Marketing Manager");

    }

    @And("I click on the Save button")
    public void iClickOnTheSaveButton() {
        dcM.clickMethod(dcM.getSaveButtonNewPositionCategory());
    }

    @Then("the new position category \"Marketing Manager\" should appear in the list")
    public void theNewPositionCategoryShouldAppearInTheList() {
        Assert.assertTrue(dcM.getMarketingManagerText().isDisplayed());
        // Assert.assertTrue(dcM.getInputNameNewPositionCategory().getText().contains("Marketing Manager"));
    }
    // Edit PART
    @And("I click on the Edit button next to the \"Marketing Manager\" position category")
    public void iClickOnTheEditButtonNextToThePositionCategory() {
        dcM.clickMethod(dcM.getEditButton());
    }

    @And("I change the name to \"Sales Manager\"")
    public void iChangeTheNameTo() {
        dcM.getInputNameNewPositionCategory().clear();
        dcM.getInputNameNewPositionCategory().sendKeys("Sales Manager");
    }


}
