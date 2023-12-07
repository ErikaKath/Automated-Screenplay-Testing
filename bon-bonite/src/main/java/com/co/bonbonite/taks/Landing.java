package com.co.bonbonite.taks;

import com.co.bonbonite.userinterfaces.LandingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Landing implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LandingPage.BTN_ACCOUNT));
    }
    public static Landing landing(){
        return Tasks.instrumented(Landing.class);
    }
}
