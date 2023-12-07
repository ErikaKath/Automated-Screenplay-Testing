package com.co.bonbonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AccountPage {
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
}
