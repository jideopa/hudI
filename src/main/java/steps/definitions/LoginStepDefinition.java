package steps.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import steps.libraries.CommonSteps;
import steps.libraries.LoginStep;

public class LoginStepDefinition {
    CommonSteps commonSteps = new CommonSteps();
    LoginStep loginStep = new LoginStep();
    @Given("user is on login page")
    public void userIsOnLoginPage() {
        commonSteps.OpenPage();
    }

    @When("user is complete the login form with valid data")
    public void userIsCompleteTheLoginFormWithValidData() {
        loginStep.completeLoginForm();
        
    }

    @Then("user should be sign in")
    public void userShouldBeSignIn() {
        Assert.assertTrue(loginStep.homeButtonIsDisplay());
    }
}
