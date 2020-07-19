package patterns.pageObjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import patterns.decorator.elements.PageElement;
import patterns.pageObjects.BasePage;

import java.util.List;

public class ManPage extends BasePage {

    @FindBy(xpath = "//nav[contains(@aria-hidden, 'false')]//div[contains(@class, '_3C_NQPb')]//button")
    private
    List<PageElement> pageElements;

    public PageElement getDesiredSectionItem(String elementName) {
        return pageElements.stream().filter(element -> element.findElement(By.xpath("//span/span")).getText().equals(elementName)).findFirst().get();
    }
}
