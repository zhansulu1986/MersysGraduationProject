package StepDefinitions;

import Pages.DialogContent;
import Pages.Selimpages;
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


public class LoginSteps extends MyMethods {
    Selimpages se=new Selimpages();
    WebDriverWait wait = new WebDriverWait(BasicDriver.getDriver(), Duration.ofSeconds(10));
    
    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        BasicDriver.getDriver().get("https://test.mersys.io/");
        BasicDriver.getDriver().manage().window().maximize();

    }

    @When("Enter username and password")
    public void enter_username_and_password() {
        se.sendKeysMethod(se.getLoginUsername(), "turkeyts");
        se.sendKeysMethod(se.getLoginPassword(), "TechnoStudy123");

    }

    @When("Click on Login Button")
    public void click_on_login_button() {
        se.clickMethod(se.getLoginBtn());

    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        wait.until(ExpectedConditions.visibilityOf(se.getDashBoardHeader()));
        Assert.assertTrue(se.getDashBoardHeader().isDisplayed());

}
}
