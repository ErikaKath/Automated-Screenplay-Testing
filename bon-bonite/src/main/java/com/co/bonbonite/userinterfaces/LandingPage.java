package com.co.bonbonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LandingPage {
    public static final Target BTN_ACCOUNT = Target.the("click the button account")
            .locatedBy("//*[@class='myaccount']");
}
