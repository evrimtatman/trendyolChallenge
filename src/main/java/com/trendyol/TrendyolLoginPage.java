package com.trendyol;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class TrendyolLoginPage extends BasePage {

    public static String LOGIN_TAB= ".account-user.link > .link-text";
    public static String ADD_USER= ".q-button.right span";
    public static String REGISTER_MAIL="input#register-email";
    public static String LOGIN_MAIL="login-email";
    public static  String REGISTER_PASSWORD="register-password-input";
    public static  String LOGIN_PASSWORD="login-password-input";
    public static String GENDER=".button-group [type='button']:nth-of-type(1)";
    public static String CHECKBOX=".q-checkbox-wrapper > .q-label";
    public static String SUBMIT="[type='submit']";
    public static String MODAL="div[title='Kapat']";

    void goToPage() {
        open("https://www.trendyol.com/");
    }

    public void closePopup() {
        int handles = getWebDriver().getWindowHandles().size();
        switchTo().window(handles - 1);

        $(".fancybox-close").click();

    }

    public void addNewUser(String mail, String password) {
        findByCss(LOGIN_TAB).click();
        findByCss(ADD_USER).click();
        findByCss(REGISTER_MAIL).setValue(mail);
        findByID(REGISTER_PASSWORD).setValue(password);
        findByCss(GENDER).click();
        findByCss(CHECKBOX).click();
        findByCss(SUBMIT).click();

    }


    public void login(String mail,String password) {
        findByCss(LOGIN_TAB).click();
        findByID(LOGIN_MAIL).setValue(mail);
        findByID(LOGIN_PASSWORD).setValue(password);
        findByCss(SUBMIT).click();

    }
    public void closeModal(){
        findByCss(MODAL).click();

    }

}
