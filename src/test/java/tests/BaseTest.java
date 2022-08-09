package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.HomePage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;
@Listeners(TestListener.class)
public class BaseTest {
    protected final static String USER_NAME = "solodchenko13-ehck@force.com";
    protected final static String PASSWORD = "qa19qa19";
    protected WebDriver driver;
    protected LoginPage LoginPage;
    protected HomePage HomePage;
    protected Faker faker;

    @BeforeClass(alwaysRun = true)
    public void setUp(ITestContext testContext) throws Exception {
        String browserName = System.getProperty("browser", "chrome");
        driver = DriverFactory.getDriver(browserName);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        testContext.setAttribute("driver", driver);
        LoginPage = new LoginPage(driver);
        HomePage = new HomePage(driver);
        faker = new Faker();
    }

    @BeforeMethod(alwaysRun = true)
    public void navigate() {
        LoginPage.open();
    }

    @AfterMethod(alwaysRun = true)
    public void clearCookies() {
        driver.manage().deleteAllCookies();
        ((JavascriptExecutor) driver).executeScript(String.format("window.localStorage.clear();"));
        ((JavascriptExecutor) driver).executeScript(String.format("window.sessionStorage.clear();"));
    }

   /* @AfterClass(alwaysRun = true)
    public void finish() {
        this.driver.quit();
    }*/

}
