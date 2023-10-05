package com.co.bobonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {
    public static Target SLC_MENU = Target.the("Select option bag minor")
            .locatedBy("//*[@id='menu-item-7']/a[text()='Accesorios']");

}
