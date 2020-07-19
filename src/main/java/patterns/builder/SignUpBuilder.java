package patterns.builder;

import patterns.pageObjects.pages.RegisterPage;

public class SignUpBuilder {
    private String emailAddress;
    private String firstName;
    private String lastName;
    private String password;
    private int dayOfBirthday;
    private String monthOfBirthday;
    private int yearOfBirthday;
    private String interestedOption;
    private String contactPreferences;

    private SignUpBuilder(SignUp signUp, boolean generatedPersonalFields) {
        emailAddress = signUp.emailAddress;
        firstName =signUp.firstName;
        lastName = signUp.lastName;
        password = signUp.password;
        dayOfBirthday = signUp.dayOfBirthday;
        monthOfBirthday = signUp.monthOfBirthday;
        yearOfBirthday = signUp.yearOfBirthday;
        interestedOption = signUp.interestedOption;
        contactPreferences = signUp.contactPreferences;
    }

    public static SignUp newSignUp(){
        return new SignUp();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public int getDayOfBirthday() {
        return dayOfBirthday;
    }

    public String getMonthOfBirthday() {
        return monthOfBirthday;
    }

    public int getYearOfBirthday() {
        return yearOfBirthday;
    }

    public String getInterestedOption() {
        return interestedOption;
    }

    public String getContactPreferences() {
        return contactPreferences;
    }

    public static final class SignUp{
        private String emailAddress;
        private String firstName;
        private String lastName;
        private String password;
        private int dayOfBirthday;
        private String monthOfBirthday;
        private int yearOfBirthday;
        private String interestedOption;
        private String contactPreferences;

        public SignUp(){

        }

        public SignUp setEmailAddress(String value) {
            emailAddress = value;
            return this;
        }

        public SignUp setFirstName(String value) {
            firstName = value;
            return this;
        }

        public SignUp setLastName(String value) {
            lastName = value;
            return this;
        }

        public SignUp setPassword(String value) {
            password = value;
            return this;
        }

        public SignUp setDayOfBirthday(int value) {
            dayOfBirthday = value;
            return this;
        }

        public SignUp setMonthOfBirthday(String value) {
            monthOfBirthday = value;
            return this;
        }

        public SignUp setYearOfBirthday(int value) {
            yearOfBirthday = value;
            return this;
        }

        public SignUp setInterestedOption(String value) {
            interestedOption = value;
            return this;
        }

        public SignUp setContactPreferences(String value) {
            contactPreferences = value;
            return this;
        }

        public SignUpBuilder build(){
            return new SignUpBuilder(this,true);
        }
    }

    public void createAccount(RegisterPage registerPage){
        registerPage.createNewUserPage(this);
    }
}
