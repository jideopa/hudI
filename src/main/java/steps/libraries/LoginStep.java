package steps.libraries;


import base.HudIBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import pojos.Login;

import java.time.Duration;

public class LoginStep extends HudIBase {
   private CommonSteps commonSteps = new CommonSteps();
   private LoginPage loginPage = new LoginPage();

    private WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(30000));

    public void completeLoginForm(String scenario) {
        Login login = new Login(scenario);
        loginPage.emailInputField.sendKeys(login.getEmailAddress());
        loginPage.passwordInputField.sendKeys(login.getPassword());
        commonSteps.scrollDownToElement(loginPage.signButton);
        loginPage.signButton.click();
    }
    public boolean homeButtonIsDisplay(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginPage.notificationButton));
        return driver.findElement(loginPage.notificationButton).isDisplayed();
    }

    public String errorMessage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginPage.loginErrorMessageText));
        return driver.findElement(loginPage.loginErrorMessageText).getText();
    }
}
