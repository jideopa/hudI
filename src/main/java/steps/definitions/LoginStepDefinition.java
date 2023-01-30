package steps.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import steps.libraries.CommonSteps;
import steps.libraries.LoginStep;

public class LoginStepDefinition {
    CommonSteps commonSteps = new CommonSteps();
    LoginStep loginStep = new LoginStep();
    @Given("user is on login page")
    public void userIsOnLoginPage() {
        commonSteps.OpenPage();
    }

    @When("user complete the login form with {string}")
    public void userIsCompleteTheLoginFormWithValidData(String data) {
        loginStep.completeLoginForm(data);
        
    }

    @Then("user should be sign in")
    public void userShouldBeSignIn() {
        Assert.assertTrue(loginStep.homeButtonIsDisplay());
    }

    @Then("user should see {string} error")
    public void userShouldError(String errorMessage) {
        Assertions.assertEquals(errorMessage,loginStep.errorMessage());
    }
}
