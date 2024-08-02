import data.Colours;
import data.Data;
import helpers.Scroll;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HeaderPage;

public class CartButtonTest extends BaseTest {
    Logger log = LogManager.getLogger(CartButtonTest.class.getSimpleName());

    @Test
    public void verifyCartButtonTest() {
        HeaderPage headerPage = new HeaderPage(driver);
        boolean isCartButton = headerPage.isCartButtonDisplayed();
        Assert.assertTrue(isCartButton);
    }

    @Test
    public void verifyCartButtonColour() {
        HeaderPage headerPage = new HeaderPage(driver);
        String colour = headerPage.getCartButtonBackgroundColour();
        Assert.assertEquals(colour, Colours.COLOUR_BLACK.getValue());
    }

    @Test
    public void verifyCartButtonText() {
        HeaderPage headerPage = new HeaderPage(driver);
        String cartButtonText = headerPage.getCartButtonText();
        Assert.assertEquals(cartButtonText, Data.CART_BUTTON_TEXT.getValue());
    }

    @Test
    public void scrollToFooterTest() {
        Scroll.scrollDown(driver, 1000);
        Scroll.scrollUp(driver, -1000);
    }
}