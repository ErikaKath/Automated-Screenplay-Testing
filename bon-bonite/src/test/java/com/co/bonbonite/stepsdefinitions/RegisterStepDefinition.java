package com.co.bonbonite.stepsdefinitions;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class RegisterStepDefinition {

    private WebDriver driver;



    @BeforeEach
    void setupTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        OnStage.setTheStage(new OnlineCast());
//        OnStage.theActorCalled("Jaime");
//        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }



    @Given("^He user is on the page$")
    public void heUserIsOnThePage() {
         driver.get("https://www.bon-bonite.com/");
//         OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/"));
//
//         try{
//             ;
//         }catch (InterruptedException e){
//             e.printStackTrace();
//
//         }

    }


    @When("^He user register in the page$")
    public void heUserRegisterInThePage() {

    }

    @Then("^He user could see the his account$")
    public void heUserCouldSeeTheHisAccount() {

    }
}
