package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends MyMethods {
    public DialogContent(){
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }
    @FindBy(css = "input[placeholder='Username']")
    private WebElement loginUsername;

    @FindBy(css = "input[placeholder='Password']")
    private WebElement loginPassword;

    @FindBy(xpath = "//span[contains(text(),'LOGIN')]")
    private WebElement loginBtn;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//div[@class='ng-star-inserted']//span[contains(text(),'Dashboard')]")
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
