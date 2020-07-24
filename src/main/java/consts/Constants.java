package consts;

public interface Constants {
  interface DriverConfigs {
    String CHROME_NAME = "webdriver.chrome.driver";
    String CHROME_DRIVER_LOCATION = "src/main/resources/drivers/chromedriver.exe";

    int IMPLICITY_WAIT_VALUE = 10;
  }

  interface BuisnessConfigs {
    String BASE_URL="https://www.amazon.com";
  }
}
