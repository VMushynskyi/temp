package patterns.pageObjects.buisnessobjects;

import patterns.pageObjects.pages.LogInPage;

public class LogInBO {

    private LogInPage logInPage;

    public LogInBO(){
        logInPage = new LogInPage();
    }

    public LogInBO login(String email, String password){
        logInPage.setEmail(email);
        logInPage.setPassword(password);
        logInPage.clickSignInButton();
        return new LogInBO();
    }

}
