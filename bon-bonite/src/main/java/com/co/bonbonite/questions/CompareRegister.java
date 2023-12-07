package com.co.bonbonite.questions;

import com.co.bonbonite.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CompareRegister implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(HomePage.COMPARE_TEXT).viewedBy(actor).asString();
    }
    public static CompareRegister compareRegister(){
        return new CompareRegister();
    }
}
