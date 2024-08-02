import data.Data;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        this.driver = new FirefoxDriver();
        this.driver.get(Data.BASE_URL.getValue());
        this.driver.manage().window().maximize();
    }
}