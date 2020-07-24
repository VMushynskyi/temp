package patterns.factorymethod;

import consts.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverCreator extends WebDriverCreator {

    @Override
    public WebDriver setWebDriver() {
        System.setProperty(Constants.DriverConfigs.CHROME_NAME, Constants.DriverConfigs.CHROME_DRIVER_LOCATION);
        driver = new ChromeDriver();
        return driver;
    }
}
