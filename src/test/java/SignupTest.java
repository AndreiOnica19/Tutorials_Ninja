import data.Data;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HeaderPage;
import pages.SignupPage;

public class SignupTest extends BaseTest{
    @Test
    public void signUpTest() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickMyAccountButton();
        headerPage.clickRegisterButton();
        SignupPage signupPage = new SignupPage(driver);
        signupPage.inputFirstName();
        signupPage.inputLastName();
        signupPage.inputEmail();
        signupPage.inputTelephone();
        signupPage.inputPassword();
        signupPage.inputConfirmationPassword();
        signupPage.clickCheckBox();
        signupPage.clickContinueButton();
        String message = signupPage.seeContinueButton();
        Assert.assertEquals(message, Data.EXPECTED_SUCCESS_MESSAGE.getValue());
    }
}