package com.co.bonbonite.questions;

import com.co.bonbonite.userinterfaces.CarShoppingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CompareProduct implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(CarShoppingPage.COMPARE_FOOTWEAR).viewedBy(actor).asString();
    }
    public static CompareProduct matchProduct(){
        return new CompareProduct();
    }
}
