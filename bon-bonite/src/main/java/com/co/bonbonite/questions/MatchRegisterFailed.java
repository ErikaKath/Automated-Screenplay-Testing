package com.co.bonbonite.questions;

import com.co.bonbonite.userinterfaces.AccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class MatchRegisterFailed implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(AccountPage.COMPARE_ACCOUNT_TEXT).viewedBy(actor).asString();
    }

    public static MatchRegisterFailed matchRegisterFailed (){
        return new MatchRegisterFailed();
    }
}
