import org.testng.annotations.Test;
import pages.HomePage;

public class ErrorTest extends BaseTest {
    @Test
    public void verifyCheckoutErrorTest(){
        HomePage homePage = new HomePage(driver);
        homePage.waitUntilQafoxIsVisible();
    }
}