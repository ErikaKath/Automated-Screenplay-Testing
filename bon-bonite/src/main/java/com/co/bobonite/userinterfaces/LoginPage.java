package com.co.bobonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target TXT_USERNAME = Target.the("enter of username")
            .locatedBy("//*[@id='username']");
    public static  final  Target TXT_PASSWORD = Target.the("enter of password")
            .locatedBy("//*[@id='password']");
    public static final Target BTN_ACCESS = Target.the("click the access login")
            .locatedBy("//button[text()='Acceder']");
}
