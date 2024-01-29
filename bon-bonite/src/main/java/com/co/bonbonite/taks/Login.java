package com.co.bonbonite.taks;

import com.co.bonbonite.models.DataLogin;
import com.co.bonbonite.userinterfaces.AccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    DataLogin dataLogin;

    public Login(DataLogin dataLogin){
        this.dataLogin= dataLogin;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(dataLogin.getUsername()).into(AccountPage.TXT_USERNAME),
                Enter.theValue(dataLogin.getPassword()).into(AccountPage.TXT_ACC_PASSWORD),
                Click.on(AccountPage.BTN_LOGIN));

    }
    public static Login login (DataLogin dataLogin){
        return Tasks.instrumented(Login.class, dataLogin);
    }
}
