package com.co.bonbonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {
    public static final Target SELECT_FOOTWEAR = Target.the("Select option your like")
            .locatedBy("//*[@id=\"wrapper\"]/div[5]/ul/li[3]/a/img");
    public static final Target SELECT_SIZE = Target.the("Select size of footwear")
            .locatedBy("//*[@id=\"pa_talla\"]/option[2]");
    public static final Target BTN_ADD_CART = Target.the("Click button add car shopping")
            .locatedBy("//*[@class='single_add_to_cart_button button alt']");
}
