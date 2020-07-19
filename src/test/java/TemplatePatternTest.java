import org.testng.annotations.Test;
import patterns.TempalteMethod.MansShop;
import patterns.TempalteMethod.Shop;
import patterns.pageObjects.buisnessobjects.LogInBO;

public class TemplatePatternTest extends BaseTest {
    @Test(description = "test template method pattern")
    public void verifySelectingSectionAndProduct() {
        Shop manProduct = new MansShop();
        manProduct.choosing("","");
    }
}
