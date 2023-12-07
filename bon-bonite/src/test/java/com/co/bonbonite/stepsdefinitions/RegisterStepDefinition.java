package com.co.bonbonite.stepsdefinitions;

import com.co.bonbonite.models.DataRegister;
import com.co.bonbonite.questions.CompareRegister;
import com.co.bonbonite.taks.Landing;
import com.co.bonbonite.taks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class RegisterStepDefinition {

    @Managed
    WebDriver hisBrowser;
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Sergio");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));

    }
    @Given("^He user is on the page$")
    public void heUserIsOnThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/"));
    }


    @When("^He user register in the page$")
    public void heUserRegisterInThePage(List<DataRegister>dataRegisterList) {
        DataRegister dataRegister;
        dataRegister = dataRegisterList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Landing.landing());
        OnStage.theActorInTheSpotlight().attemptsTo(Register.register(dataRegister));

    }


    @Then("^He user could see his account$")
    public void heUserCouldSeeHisAccount() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareRegister.compareRegister(),
                Matchers.equalTo("Tu cesta está vacía")));

    }

    @When("^He user register incomplete data in the page$")
    public void heUserRegisterIncompleteDataInThePage() {

    }


    @Then("^He user continue in the page of register$")
    public void heUserContinueInThePageOfRegister() {

    }
}
