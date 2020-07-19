package settings;

import consts.Constants;
import org.openqa.selenium.WebDriver;
import patterns.factorymethod.ChromeDriverCreator;
import patterns.factorymethod.WebDriverCreator;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private static WebDriver webdriver;

    protected void initDriver(final String browserName) {

        if ((Constants.DriverConfigs.CHROME_NAME).equalsIgnoreCase(browserName)) {
//            System.setProperty(Constants.DriverConfigs.CHROME_NAME, Constants.DriverConfigs.CHROME_DRIVER_LOCATION);
            WebDriverCreator creator = new ChromeDriverCreator();
            webdriver = creator.setWebDriver();
        }
        webdriver.manage().window().maximize();
        webdriver.manage().timeouts().implicitlyWait(Constants.DriverConfigs.IMPLICITY_WAIT_VALUE, TimeUnit.SECONDS);
        webdriver.get(Constants.BuisnessConfigs.BASE_URL);
    }

    public static WebDriver getDriver() {
        return webdriver;
    }

    protected void quitDriver() {
        if (webdriver != null) {
            webdriver.quit();
            webdriver = null;
        }
    }
}
