package com.co.demoblanze.stepsdefinitions;

import com.co.questions.CompareProduct;
import com.co.tasks.AcceptProduct;
import com.co.tasks.AddProduct;
import com.co.tasks.NavCart;
import com.co.tasks.Product;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class ProductStepDefinition {

    @Managed
    WebDriver hisBrowser;
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Jaime");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));

    }
    @Given("^He user is on the page$")
    public void heUserIsOnThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.demoblaze.com/"));

    }

    @When("^He user selection the category$")
    public void heUserSelectionTheCategory() {
        OnStage.theActorInTheSpotlight().attemptsTo(Product.click());

    }

    @When("^He user add product$")
    public void heUserAddProduct() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddProduct.add());
        OnStage.theActorInTheSpotlight().attemptsTo(AcceptProduct.accept());
        OnStage.theActorInTheSpotlight().attemptsTo(NavCart.nav());
    }

    @Then("^He user  could see his product$")
    public void heUserCouldSeeHisProduct() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareProduct.compare(),
                Matchers.equalTo("Sony vaio i5")));

    }
}
