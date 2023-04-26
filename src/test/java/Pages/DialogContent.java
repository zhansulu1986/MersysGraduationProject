package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends MyMethods {
    public DialogContent (){
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }
    @FindBy(css = "input[placeholder='Username']")
    private WebElement loginUsername;

    @FindBy(css = "input[placeholder='Password']")
    private WebElement loginPassword;

    @FindBy(css ="button[aria-label='LOGIN']")
    private WebElement loginBtn;

    @FindBy(linkText = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashBoardHeader;

    public WebElement getLoginUsername() {
        return loginUsername;
    }

    public WebElement getLoginPassword() {
        return loginPassword;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public WebElement getDashBoardHeader() {
        return dashBoardHeader;
    }

    public WebElement getLoginBtn() {
        return loginBtn;

    }
}

