package retochoucair.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import retochoucair.tasks.Added;
import retochoucair.tasks.Login;
import retochoucair.tasks.OpenHome;
import retochoucair.tasks.OpenUp;

public class RetoChoucairStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Actor wants to enter products and redirect to successful checkout$")
    public void thanActorWantsToEnterProductsAndRedirectToSuccessfulCheckout() {
        OnStage.theActorCalled("Actor").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }
    @When("^you select a product you are redirected to checkout$")
    public void youSelectAProductYouAreRedirectedToCheckout() {
        OnStage.theActorInTheSpotlight().attemptsTo(OpenHome.thePage(), (Added.onThePage()));
    }
    @Then("^it shows the process of the purchase completed successfully$")
    public void itShowsTheProcessOfThePurchaseCompletedSuccessfully() {
    }
}
