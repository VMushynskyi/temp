package patterns;

import patterns.pageObjects.pages.RegisterPage;
import patterns.builder.SignUpBuilder;

public class Main {
    public static void main(String[] args) {
        RegisterPage registerPage = new RegisterPage();
        SignUpBuilder.newSignUp()
                .setEmailAddress("")
                .build()
                .createAccount(registerPage);

    }
}
