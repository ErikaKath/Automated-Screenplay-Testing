package com.co.bonbonite.taks;

import com.co.bonbonite.models.DataRegister;
import com.co.bonbonite.userinterfaces.AccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Register implements Task {
    DataRegister dataRegister;


    public Register(DataRegister dataRegister) {
        this.dataRegister = dataRegister;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(Enter.theValue(dataRegister.getiD()).into(AccountPage.TXT_ID),
       Enter.theValue(dataRegister.getEmail()).into(AccountPage.TXT_EMAIL),
       Enter.theValue(dataRegister.getPassword()).into(AccountPage.TXT_PASSWORD),
       Click.on(AccountPage.CHK_FORM),
       Click.on(AccountPage.BTN_REGISTER));
    }
    public static Register register(DataRegister dataRegister){
        return Tasks.instrumented(Register.class, dataRegister);
    }
}
