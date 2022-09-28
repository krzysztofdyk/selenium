package selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(name="userName")
    private WebElement userNameFieldElement;

    @FindBy(name = "password")
    private WebElement passwordFieldElement;

    @FindBy(name="submit")
    private WebElement submitButton;

    public void userLogin(String userName, String password){
        userNameFieldElement.sendKeys(userName);
        passwordFieldElement.sendKeys(password);
        submitButton.click();
    }
}
