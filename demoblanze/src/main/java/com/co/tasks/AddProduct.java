package com.co.tasks;

import com.co.userinterfaces.ProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
///Aprender a manejar alertas de ventanas emergentes con serenity BDD Screenplay
public class AddProduct implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ProductPage.CLICK_PRODUCT));
        actor.attemptsTo(Click.on(ProductPage.BTN_ADD_CART));
        //actor.attemptsTo(Click.on(ProductPage.CLICK_NAV_CART));

    }
    public static AddProduct add(){
        return Tasks.instrumented(AddProduct.class);
    }
}
