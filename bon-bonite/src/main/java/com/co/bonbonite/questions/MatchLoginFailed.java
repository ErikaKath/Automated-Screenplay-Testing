package com.co.bonbonite.questions;

import com.co.bonbonite.userinterfaces.AccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class MatchLoginFailed implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(AccountPage.COMPARE_LOGIN_TEXT).viewedBy(actor).asString();
    }

    public static MatchLoginFailed matchLoginFailed(){
        return new MatchLoginFailed();
    }
}
