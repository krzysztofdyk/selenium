package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager {

    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    private PrivacyFooterPage privacyFooterPage;
    private RegistrationPage registrationPage;
    private RegistrationConfirmationPage registrationConfirmationPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = PageFactory.initElements(driver, HomePage.class);
        }
        return homePage;
    }

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = PageFactory.initElements(driver, LoginPage.class);
        }
        return loginPage;
    }

    public PrivacyFooterPage getPrivacyFooterPage() {
        if (privacyFooterPage == null) {
            privacyFooterPage = new PrivacyFooterPage(driver);
        }
        return privacyFooterPage;
    }

    public RegistrationPage getRegistrationPage() {
        if (registrationPage == null) {
            registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
        }
        return registrationPage;
    }

    public RegistrationConfirmationPage getRegistrationConfirmationPage() {
        if (registrationConfirmationPage == null) {
            registrationConfirmationPage = PageFactory.initElements(driver, RegistrationConfirmationPage.class);
        }
        return registrationConfirmationPage;
    }

}