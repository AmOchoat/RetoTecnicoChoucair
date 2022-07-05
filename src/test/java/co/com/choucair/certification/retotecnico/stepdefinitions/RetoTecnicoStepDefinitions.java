package co.com.choucair.certification.retotecnico.stepdefinitions;

import co.com.choucair.certification.retotecnico.model.RetoTecnicoData;
import co.com.choucair.certification.retotecnico.questions.Account;
import co.com.choucair.certification.retotecnico.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RetoTecnicoStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Carlos wants to create and user account on Utest$")
    public void thanCarlosWantsToCreateAndUserAccountOnUtestCom() throws Exception {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
    }

    @When("^he complete the form with his information$")
    public void heCompleteHisPersonalInformation(List<RetoTecnicoData> retoTecnicoData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(
                PersonalForm.fillOut(retoTecnicoData.get(0)),
                Address.fillOut(retoTecnicoData.get(0)),
                Devices.fillOut(retoTecnicoData.get(0)),
                Password.fillOut(retoTecnicoData.get(0))
        );
    }

    @Then("^the web page redirects Carlos to the page with the a welcome message if a Captcha is not required$")
    public void theWebPageRedirectsCarlosToThePageWithTheAWelcomeMessageIfACaptchaIsNotRequired(List<RetoTecnicoData> retoTecnicoData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Account.wasCreated(retoTecnicoData.get(0))));
    }
}
