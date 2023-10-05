package com.co.questions;

import com.co.userinterfaces.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CompareProduct implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(CartPage.COMPARE_PRODUCT).viewedBy(actor).asString();
    }
    public static CompareProduct compare(){
        return new CompareProduct();
    }
}
