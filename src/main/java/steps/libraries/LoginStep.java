package steps.libraries;


import base.HudIBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import utils.CustomerAccount;

import java.time.Duration;

public class LoginStep extends HudIBase {
   private CommonSteps commonSteps = new CommonSteps();
   private LoginPage loginPage = new LoginPage();

    private WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(30000));

    public void completeLoginForm() {
        loginPage.emailInputField.sendKeys(CustomerAccount.EXISTING_Customer.getEmailAddress());
        loginPage.passwordInputField.sendKeys(CustomerAccount.EXISTING_Customer.getPassword());
        commonSteps.scrollDownToElement(loginPage.signButton);
        loginPage.signButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginPage.viewProfileButton));
    }
    public boolean homeButtonIsDisplay(){

        return driver.findElement(loginPage.viewProfileButton).isDisplayed();
    }
}
