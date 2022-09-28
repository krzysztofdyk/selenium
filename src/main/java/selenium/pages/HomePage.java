package selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(linkText = "REGISTER")
    private WebElement registerLinkElement;

    @FindBy(linkText = "SIGN-OFF")
    private WebElement signOffLinkElement;

    public void clickOnRegisterLink(){
        registerLinkElement.click();
    }

    public boolean isUserLoggedIn(){
        return signOffLinkElement.isDisplayed();
    }

}
