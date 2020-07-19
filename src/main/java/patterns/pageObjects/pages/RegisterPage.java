package patterns.pageObjects.pages;

import patterns.builder.SignUpBuilder;

public class RegisterPage {

    public void createNewUserPage(SignUpBuilder signUpBuilder){
        setSignUpFields(signUpBuilder);
        clickJoinButton();
    }

    private void clickJoinButton() {

    }

    private void setSignUpFields(SignUpBuilder signUpBuilder) {
        setEmailAddress(signUpBuilder.getEmailAddress());
        setFirstName(signUpBuilder.getFirstName());
        setLastName(signUpBuilder.getLastName());
        setPassword(signUpBuilder.getPassword());
        setDay(signUpBuilder.getDayOfBirthday());
        setMonth(signUpBuilder.getMonthOfBirthday());
        setYear(signUpBuilder.getYearOfBirthday());
        setInterest(signUpBuilder.getInterestedOption());
        setContactPreferences(signUpBuilder.getContactPreferences());
    }

    private void setDay(int dayOfBirthday) {

    }

    private void setYear(int yearOfBirthday) {

    }

    private void setInterest(String interestedOption) {

    }

    private void setContactPreferences(String contactPreferences) {

    }

    private void setPassword(String password) {

    }

    private void setEmailAddress(String emailAddress) {

    }

    private void setLastName(String lastName) {

    }

    private void setFirstName(String firstName) {

    }

    private void setMonth(String month){

    }

}
