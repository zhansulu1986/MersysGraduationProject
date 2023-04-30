package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubjectCategory_POM extends MyMethods {
    public SubjectCategory_POM() {
        PageFactory.initElements(BasicDriver.getDriver(), this);


    }
@FindBy(xpath= "//span[text()='Education']")
private WebElement education;

    @FindBy(xpath = "//span[text()='Subject Categories']")
    private WebElement subject;

    @FindBy(css = "svg[class='svg-inline--fa fa-plus']")
    private WebElement addButton;

   @FindBy(xpath = "//input[@id='ms-text-field-2']")
    private WebElement inputName;

   @FindBy(xpath = "//input[@id='ms-text-field-3']")
    private WebElement inputCode;

   @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;

   @FindBy(xpath = "(//span[text()='Setup'])[5]")
   private WebElement setup;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//input[@id='ms-text-field-0']")
    private WebElement nameInSearch;

    @FindBy(xpath = "//span[text()='Search']")
    private WebElement searchButton;

    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[12]")
    private WebElement deleteAfterSearch;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement errorMessage;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement confirmDeleteBtn;

    @FindBy(css = ".svg-inline--fa.fa-pen-to-square")
    private WebElement editBtn;

    @FindBy(xpath = "//input[@id='ms-text-field-4']")
    private WebElement inputName2;

    @FindBy(xpath = "//div[text()='Bank Account successfully updated']")
    private WebElement successEditMessage;

    @FindBy(xpath = "//td[text()='Subject 7AAA']")
    private WebElement newSubject;

    @FindBy(xpath = "//div[text()=' There is no data to display ']")
    private WebElement infoDisplay;

    @FindBy(xpath = "//td[text()='Subject 7']")
    private WebElement createdSubject;

    public WebElement getCreatedSubject() {
        return createdSubject;
    }

    public WebElement getInfoDisplay() {
        return infoDisplay;
    }

    public WebElement getNewSubject() {
        return newSubject;
    }

    public WebElement getSuccessEditMessage() {
        return successEditMessage;
    }

    public WebElement getInputName2() {
        return inputName2;
    }

    public WebElement getEditBtn() {
        return editBtn;
    }

    public WebElement getConfirmDeleteBtn() {
        return confirmDeleteBtn;
    }

    public WebElement getCloseDialog() {
        return closeDialog;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

    public WebElement getDeleteAfterSearch() {
        return deleteAfterSearch;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getNameInSearch() {
        return nameInSearch;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public WebElement getSetup() {
        return setup;
    }

    public WebElement getEducation() {
        return education;
    }

    public WebElement getSubject() {
        return subject;
    }

    public WebElement getAddButton() {
        return addButton;
    }

    public WebElement getInputName() {
        return inputName;
    }

    public WebElement getInputCode() {
        return inputCode;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }
}


