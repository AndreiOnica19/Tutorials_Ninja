package pages;

import helpers.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//a[contains(text(),'Qafox.com')]")
    private WebElement qafoxLogo;

    @FindBy(xpath = "//footer")
    private WebElement footer;

    @FindBy(xpath = "(//li[@class='dropdown'])[2]")
    private WebElement desktopsButton;

    @FindBy(xpath = "(//a[@href='https://tutorialsninja.com/demo/index.php?route=product/category&path=20_27'])[1]")
    private WebElement macButton;

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[4]")
    private WebElement componentsButton;

    @FindBy(xpath = "(//a[@href='https://tutorialsninja.com/demo/index.php?route=product/category&path=57'])[1]")
    private WebElement tabletsButton;

    public void waitUntilQafoxIsVisible() {
        Wait.waitUntilElementIsVisible(qafoxLogo, driver);
    }

    public void clickDesktopsButton() {
        desktopsButton.click();
    }

    public void clickMacButton(){
        Wait.waitUntilElementIsVisible(macButton, driver);
        macButton.click();
    }

    public void clickComponentsButton() {
        componentsButton.click();
    }

    public void clickTabletsButton() {
        tabletsButton.click();
    }
}