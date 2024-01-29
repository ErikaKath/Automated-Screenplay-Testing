package com.co.bonbonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AccountPage {

    //REGISTER
    public static final Target TXT_ID = Target.the("enter the cart id ")
            .locatedBy("//*[@id='reg_username']");
    public static final Target TXT_EMAIL = Target.the("enter the email")
            .locatedBy("//input[@id='reg_email']");
    public static final Target TXT_PASSWORD = Target.the("enter the password")
            .locatedBy("//input[@id='reg_password']");
    public static final Target CHK_FORM = Target.the("check the box ")
            .locatedBy("//input[@id='privacy_policy_reg']");
    public static final Target BTN_REGISTER = Target.the("click of button")
            .locatedBy("//button[@name='register']");
    public static final Target COMPARE_ACCOUNT_TEXT = Target.the("message in the button ")
            .locatedBy("//button[text()='Registrarse']");

    //LOGIN
    public static final Target TXT_USERNAME = Target.the("enter the username o email")
            .locatedBy("//*[@id='username']");

    public static final Target TXT_ACC_PASSWORD = Target.the("enter the password Login")
            .locatedBy("//*[@id='password']");

    public static final  Target BTN_LOGIN = Target.the("click button login")
            .locatedBy("//*[@name='login']");
    public static final Target COMPARE_LOGIN_TEXT = Target.the("tittle of formulary login")
            .locatedBy("//*[text()='Acceder']");
}
