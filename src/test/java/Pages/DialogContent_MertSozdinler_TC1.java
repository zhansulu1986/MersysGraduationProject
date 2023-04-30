package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent_MertSozdinler_TC1 extends MyMethods{

    public void DialogContentM (){
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }

    @FindBy (xpath = "//*[text()='Human Resources']")
    private WebElement humanResourcesButton;

    @FindBy (xpath = "(//span[text()='Setup'])[3]")
    private WebElement setupForHumanResourcesButton;

    @FindBy (xpath = "//*[text()='Position Categories']")
    private WebElement positionsCategoriesButton;

    @FindBy(css = "svg[class='svg-inline--fa fa-plus']")
    private WebElement addButtonForPositionCategory;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    private WebElement inputNameNewPositionCategory;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButtonNewPositionCategory;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy (xpath = "//*[text()='Marketing Manager']")
    private WebElement marketingManagerText;

    @FindBy(css = "svg[class='svg-inline--fa fa-pen-to-square]")
    private WebElement editButton;




    public WebElement getHumanResourcesButton() {
        return humanResourcesButton;
    }

    public WebElement getSetupForHumanResourcesButton() {
        return setupForHumanResourcesButton;
    }

    public WebElement getPositionsCategoriesButton() {
        return positionsCategoriesButton;
    }

    public WebElement getAddButtonForPositionCategory() {
        return addButtonForPositionCategory;
    }

    public WebElement getInputNameNewPositionCategory() {
        return inputNameNewPositionCategory;
    }

    public WebElement getSaveButtonNewPositionCategory() {
        return saveButtonNewPositionCategory;
    }

    public WebElement getMarketingManagerText() {
        return marketingManagerText;
    }
    public WebElement getEditButton() {
        return editButton;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }
}
