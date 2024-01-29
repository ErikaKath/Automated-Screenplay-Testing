package com.co.bonbonite.stepsdefinitions;

import com.co.bonbonite.models.DataLogin;
import com.co.bonbonite.questions.MatchLoginFailed;
import com.co.bonbonite.taks.Landing;
import com.co.bonbonite.taks.Login;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

public class LoginStepDefinition {

    @When("^He user enter credentials$")
    public void heUserEnterCredentials(List<DataLogin>dataLoginList) {

        DataLogin dataLogin;
        dataLogin = dataLoginList.get(1);
        OnStage.theActorInTheSpotlight().attemptsTo(Landing.landing());
        OnStage.theActorInTheSpotlight().attemptsTo(Login.login(dataLogin));

    }

    @When("^He user enter incorrect credentials$")
    public void heUserEnterIncorrectCredentials(List<DataLogin>dataLoginList) {

        DataLogin dataLogin;
        dataLogin = dataLoginList.get(1);
        OnStage.theActorInTheSpotlight().attemptsTo(Landing.landing());
        OnStage.theActorInTheSpotlight().attemptsTo(Login.login(dataLogin));

    }
    @When("^He user enter credentials incomplete$")
    public void heUserEnterCredentialsIncomplete(List<DataLogin>dataLoginList) {

        DataLogin dataLogin;
        dataLogin = dataLoginList.get(1);
        OnStage.theActorInTheSpotlight().attemptsTo(Landing.landing());
        OnStage.theActorInTheSpotlight().attemptsTo(Login.login(dataLogin));

    }


    @Then("^He user couldn't see the his account$")
    public void heUserCouldnTSeeTheHisAccount() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(MatchLoginFailed.matchLoginFailed(),
                Matchers.equalTo("Acceder")));
    }
}
