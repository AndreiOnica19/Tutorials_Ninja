import org.testng.annotations.Test;
import pages.HeaderPage;
import pages.HomePage;
import pages.ProductPage;

public class EndToEndTest extends BaseTest{
    @Test
    public void buyItemsTest(){
        HomePage homePage = new HomePage(driver);
        homePage.clickDesktopsButton();
        homePage.clickMacButton();
        ProductPage productPage = new ProductPage(driver);
        productPage.selectIMac();
        productPage.insertQuantity();
        productPage.clickAddToCartButton();
        homePage.clickComponentsButton();
        homePage.clickTabletsButton();
        productPage.selectSamsungGalaxyTablet();
        productPage.selectQuantityField();
        productPage.insertQuantity();
        productPage.clickAddToCartButton();
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickCartButton();
    }
}