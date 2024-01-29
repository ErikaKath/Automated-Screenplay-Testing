package com.co.bonbonite.taks;

import com.co.bonbonite.userinterfaces.CarShoppingPage;
import com.co.bonbonite.userinterfaces.HomePage;
import com.co.bonbonite.userinterfaces.ProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddCarProduct implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.SEARCH_MENU),
                Click.on(ProductPage.SELECT_FOOTWEAR),
                Click.on(ProductPage.SELECT_SIZE),
                Click.on(ProductPage.BTN_ADD_CART),
                Click.on(CarShoppingPage.BTN_CAR_SHOPPING));
    }

    public static AddCarProduct addCarProduct(){
        return Tasks.instrumented(AddCarProduct.class);
    }
}
