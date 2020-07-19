package patterns.pageObjects.pages;

import org.openqa.selenium.support.FindBy;
import patterns.decorator.elements.Button;
import patterns.decorator.elements.TextInput;
import patterns.pageObjects.BasePage;

public class LogInPage extends BasePage {
    @FindBy(id="EmailAddress")
    private TextInput emailInput;

    @FindBy(id="Password")
    private TextInput passwordInput;

    @FindBy(id="signin")
    private Button signInButton;

    public void setEmail(String email){
        emailInput.sendKeys(email);
    }

    public void setPassword(String password){
        passwordInput.sendKeys(password);
    }

    public  void clickSignInButton(){
        signInButton.click();
    }
}
