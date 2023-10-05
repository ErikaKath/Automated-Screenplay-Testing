package com.co.bobonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {
    public static final Target NUM_CC = Target.the("click button")
            .locatedBy("//*[@id='reg_username']");
    public static final Target TXT_EMAIL = Target.the("enter email")
            .locatedBy("//*[@id='reg_email']");
    public static final Target TXT_PASSWORD = Target.the("enter password")
            .locatedBy("//*[@id='reg_password']");
    public static final Target BTN_CHECK = Target.the("click check ")
            .locatedBy("//*[@id='privacy_policy_reg']");
    public static final Target BTN_REGISTER = Target.the("click button")
            .locatedBy("//*[@name='register']");

}
