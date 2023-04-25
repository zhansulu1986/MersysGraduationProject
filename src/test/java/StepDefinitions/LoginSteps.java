package StepDefinitions;

import Pages.DialogContent;
import Utilities.BasicDriver;
import Utilities.MyMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginSteps  extends MyMethods {
   DialogContent elements = new DialogContent();
    WebDriverWait wait = new WebDriverWait(BasicDriver.getDriver(), Duration.ofSeconds(10));
    @Given("Navigate to Campus")
    public void navigate_To_Campus() {
        BasicDriver.getDriver().get("https://test.mersys.io/");
        BasicDriver.getDriver().manage().window().maximize();
    }

    @When("Enter username and password")
    public void enter_Username_And_Password() {
        sendKeysMethod(elements.getLoginUsername(), "turkeyts");
        sendKeysMethod(elements.getLoginPassword(), "TechnoStudy123");
    }

    @And("Click on Login Button")
    public void clickOnLoginButton() {
        elements.getLoginBtn().click();
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        wait.until(ExpectedConditions.visibilityOf(elements.getDashBoardHeader()));
        Assert.assertTrue(elements.getDashBoardHeader().isDisplayed());
    }
    @Then("User should be able login successfully")
    public void userShouldBeAbleLoginSuccessfully() {
    }
}
