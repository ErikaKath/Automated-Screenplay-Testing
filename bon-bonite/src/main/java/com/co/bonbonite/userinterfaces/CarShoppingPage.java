package com.co.bonbonite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CarShoppingPage {

    public static final Target BTN_CAR_SHOPPING = Target.the("select button car shopping")
            .locatedBy("//*[@class='cart-contents-count']");
    public static final Target COMPARE_FOOTWEAR = Target.the("list of shopping make ")
            .locatedBy("//*[text()='Sandalia de tacón en cuero color miel armadillo - 34']");
}
