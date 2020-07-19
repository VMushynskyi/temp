import org.testng.annotations.Test;
import patterns.pageObjects.buisnessobjects.LogInBO;

public class LogInPageTest extends BaseTest {
    @Test(description = "log in")
    public void verifyNewsPage() {
        LogInBO logInBO = new LogInBO();
        logInBO.login("","");
    }
}
