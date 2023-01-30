package pages;

import base.HudIBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends HudIBase {
    public By loginErrorMessageText= By.cssSelector("p[data-qa-id='error-display']");
    @FindBy(css = "button#logIn")
    public WebElement signButton;

    @FindBy(css = "input#email")
    public WebElement emailInputField;

    @FindBy(css = "input#password")
    public WebElement passwordInputField;

    public By notificationButton = By.cssSelector("div[class='hui-globalnav__notifications-container']");

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
}
