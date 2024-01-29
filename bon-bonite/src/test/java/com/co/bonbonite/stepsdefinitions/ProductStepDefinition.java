package com.co.bonbonite.stepsdefinitions;

import com.co.bonbonite.questions.CompareProduct;
import com.co.bonbonite.taks.AddCarProduct;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class ProductStepDefinition {
    @When("^He user selects the like product$")
    public void heUserSelectsTheLikeProduct() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddCarProduct.addCarProduct());
    }


    @Then("^He user could see the product in wish list$")
    public void heUserCouldSeeTheProductInWishList() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareProduct.matchProduct(),
                Matchers.equalTo("Sandalia de tacón en cuero color miel armadillo - 34")));
    }

}
