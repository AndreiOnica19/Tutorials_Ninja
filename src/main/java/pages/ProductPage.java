package pages;

import data.Data;
import helpers.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//a[@href='https://tutorialsninja.com/demo/index.php?route=product/product&path=20_27&product_id=41'])[1]")
    private WebElement iMac;

    @FindBy(xpath = "//input[@id='input-quantity']")
    private WebElement quantityField;

    @FindBy(xpath = "//button[@id='button-cart']")
    private WebElement addToCartButton;

    @FindBy(xpath = "(//a[@href='https://tutorialsninja.com/demo/index.php?route=product/product&path=57&product_id=49'])[1]")
    private WebElement samsungGalaxyTab;


    public void selectIMac() {
        Wait.waitUntilElementIsVisible(iMac, driver);
        iMac.click();
    }

    public void selectSamsungGalaxyTablet() {
        Wait.waitUntilElementIsVisible(samsungGalaxyTab, driver);
        samsungGalaxyTab.click();
    }

    public void selectQuantityField() {
        quantityField.click();
    }

    public void insertQuantity() {
        quantityField.clear();
        quantityField.sendKeys(Data.generateQuantity());
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }
}