package com.co.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AcceptProduct implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
       WebDriver hisBrowser = actor.usingAbilityTo(BrowseTheWeb.class).getDriver();
       WebDriverWait wait = new WebDriverWait(hisBrowser, 20);

        try {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            // Realizar acciones en la alerta, por ejemplo, aceptarla
            alert.accept();
        } catch (org.openqa.selenium.TimeoutException e) {
            System.err.println("La alerta no se encontró a tiempo.");
        }
      // wait.until(ExpectedConditions.alertIsPresent());
       // WebDriver hisBrowser;
       // Alert alert =hisBrowser.switchTo().alert();
       // alert.accept();
    }
    public static AcceptProduct accept(){
        return Tasks.instrumented(AcceptProduct.class);
    }
}
