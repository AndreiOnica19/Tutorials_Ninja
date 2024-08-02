package pages;

import data.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends BasePage {
    @FindBy(xpath = "//input[@id='input-firstname']")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@id='input-lastname']")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='input-telephone']")
    private WebElement telephoneField;

    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='input-confirm']")
    private WebElement passwordConfirmField;

    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement checkbox;

    @FindBy(xpath = "//input[@class='btn btn-primary']")
    private WebElement continueButton;

    @FindBy(xpath = "//div[@class='pull-right']")
    private WebElement continueButtonAccount;

    public SignupPage(WebDriver driver) {
        super(driver);
    }

    public void inputFirstName() {
        firstNameField.sendKeys(Data.FIRST_NAME.getValue());
    }

    public void inputLastName() {
        lastNameField.sendKeys(Data.LAST_NAME.getValue());
    }

    public void inputEmail() {
        emailField.sendKeys(Data.EMAIL.getValue());
    }

    public void inputTelephone() {
        telephoneField.sendKeys(Data.PHONE.getValue());
    }

    public void inputPassword() {
        passwordField.sendKeys(Data.PASSWORD.getValue());
    }

    public void inputConfirmationPassword() {
        passwordConfirmField.sendKeys(Data.PASSWORD.getValue());
    }

    public void clickCheckBox() {
        checkbox.click();
    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public String seeContinueButton() {
        return continueButtonAccount.getText();
    }
}