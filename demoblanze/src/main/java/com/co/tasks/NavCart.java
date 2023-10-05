package com.co.tasks;

import com.co.userinterfaces.ProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class NavCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ProductPage.CLICK_NAV_CART));
    }
    public static NavCart nav(){
        return Tasks.instrumented(NavCart.class);
    }
}
