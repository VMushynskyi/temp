package patterns.factorymethod;

import consts.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;
import java.io.IOException;

public class ChromeDriverCreator extends WebDriverCreator {

    @Override
    public WebDriver setWebDriver() {
        ChromeDriverService service = new ChromeDriverService.Builder().usingDriverExecutable(new File(Constants.DriverConfigs.CHROME_DRIVER_LOCATION)).build();
        try {
            service.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver = new ChromeDriver();
        return driver;
    }
}
