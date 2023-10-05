package com.co.tasks;

import com.co.userinterfaces.ProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;

public class Product implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        //actor.attemptsTo(Scroll.to(ProductPage.CLICK_PRODUCT));
        actor.attemptsTo(Click.on(ProductPage.CLICK_SECTION));


    }

    public static Product click(){
        return Tasks.instrumented(Product.class);
    }
}
