package PSM;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

public class Base extends AbstractTestNGCucumberTests {

    private static final ThreadLocal<RemoteWebDriver> tlDriver = new ThreadLocal<RemoteWebDriver>();

    public void setDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        tlDriver.set(new ChromeDriver(options));
    }

    public RemoteWebDriver getDriver(){
        return tlDriver.get();
    }

    @BeforeMethod
    public void preCondition(){
        setDriver();
        getDriver().manage().window().maximize();
        getDriver().navigate().to("https://login.salesforce.com/?locale=eu");
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void postCondition(){
        getDriver().quit();
    }
}
