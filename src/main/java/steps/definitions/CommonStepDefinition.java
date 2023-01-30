package steps.definitions;

import io.cucumber.java.en.Given;
import steps.libraries.CommonSteps;
import steps.libraries.LoginStep;

public class CommonStepDefinition {
   private CommonSteps commonSteps = new CommonSteps();
    @Given("a user has logged in")
    public void userIsOnThe() {
        commonSteps.OpenPage();
    }
}
