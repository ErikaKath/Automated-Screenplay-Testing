package com.co.bonbonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target COMPARE_TEXT = Target.the("compare text opening the homePage ")
            .locatedBy("//*[text()='Tu cesta está vacía']");
}