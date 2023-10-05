package com.co.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {
    public static final Target CLICK_SECTION = Target.the("click section on category of product")
            .locatedBy("//*[text()='Laptops']");
    public static final Target CLICK_PRODUCT = Target.the("click selection on product")
            .locatedBy("//*[text()='Sony vaio i5']");
    public static  final  Target BTN_ADD_CART = Target.the("button add cart purchase")
            .locatedBy("//a[@class='btn btn-success btn-lg']");
    public static final  Target CLICK_NAV_CART = Target.the("click section on category of the navigation bar")
            .locatedBy("//a[@id='cartur']");

}
