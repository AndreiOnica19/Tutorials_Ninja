package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage{
    @FindBy(xpath = "//div[@id='cart']")
    private WebElement cartButton;

    @FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    private WebElement cartButtonBackgroundColour;

    @FindBy(xpath = "(//a[@href='https://tutorialsninja.com/demo/index.php?route=checkout/cart'])[2]")
    private WebElement viewCartButton;

    @FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[3]")
    private WebElement myAccountButton;

    @FindBy(xpath = "(//a[@href='https://tutorialsninja.com/demo/index.php?route=account/register'])[1]")
    private WebElement registerButton;

    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    public boolean isCartButtonDisplayed() {
        return cartButton.isDisplayed();
    }

    public String getCartButtonBackgroundColour() {
        return cartButtonBackgroundColour.getCssValue("background-color");
    }

    public String getCartButtonText() {
        return cartButtonBackgroundColour.getText();
    }

    public void clickCartButton() {
        cartButton.click();
        viewCartButton.click();
    }

    public void clickMyAccountButton() {
        myAccountButton.click();
    }

    public void clickRegisterButton() {
        registerButton.click();
    }
}