package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SchoolSetup_POM extends MyMethods {
    public SchoolSetup_POM() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }
        @FindBy(xpath = "(//span[text()='Setup'])[1]")
        private WebElement setupBtn;

    @FindBy(xpath = "//span[text()='School Setup']")
    private WebElement schoolSetupButton;

    @FindBy(xpath = "(//span[text()='Locations'])[1]")
    private WebElement locationUnderSchoolSetup;

    @FindBy(css = "svg[class='svg-inline--fa fa-plus']")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortNameInput;
    @FindBy(xpath = "//ms-integer-field[@formcontrolname='capacity']//input")
    private WebElement capacityInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    //@FindBy(xpath = "//div[contains(text(),'successfully')]")
    //private WebElement successMessage;

    //@FindBy(xpath = "//div[contains(text(),'successfully')]")

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement errorMessage;

    @FindBy(xpath = "//ms-edit-button//button")
    private WebElement editButton;


    @FindBy(css = "ms-delete-button[class='ng-star-inserted']")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Location successfully')]")
    private WebElement confirmDeleteMessage;

    @FindBy(xpath = "//div[contains(text(),'updated')]")
    private WebElement updatedMessage;

   // @FindBy(xpath = "/html/body/hot-toast-container/div/div/hot-toast/div/div/div[2]/div/dynamic-view/div")
   // private WebElement unsuccessfulMessage;

    @FindBy(css = "button[class='mat-focus-indicator mat-button mat-raised-button mat-button-base mat-accent']")
    private WebElement confirmDelete;

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public WebElement getConfirmDelete() {
        return confirmDelete;
    }

    public WebElement getConfirmDeleteMessage() {
        return confirmDeleteMessage;
    }

   // public WebElement getUnsuccessfulMessage() {
     //   return unsuccessfulMessage;
   // }



    public WebElement getUpdatedMessage() {
        return updatedMessage;
    }

    public WebElement getDeleteButton() {
        return deleteButton;
    }

    public WebElement getEditButton() {
        return editButton;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

   // public WebElement getSuccessMessage() {
     //   return successMessage;
   // }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getShortNameInput() {
        return shortNameInput;
    }

    public WebElement getNameInput() {
        return nameInput;
    }

    public WebElement getCapacityInput() {
        return capacityInput;
    }

    public WebElement getAddButton() {
        return addButton;
    }

    public WebElement getSchoolSetupButton() {
        return schoolSetupButton;
    }

    public WebElement getLocationUnderSchoolSetup() {
        return locationUnderSchoolSetup;
    }

    public WebElement getSetupBtn() {
        return setupBtn;
    }
}

