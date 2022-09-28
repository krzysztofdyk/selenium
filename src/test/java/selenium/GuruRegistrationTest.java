package selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.pages.PageObjectManager;
import selenium.waits.CustomWait;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GuruRegistrationTest {

    private static final String PAGE_URL = "https://demo.guru99.com/test/newtours";
    private static final String CHROMEDRIVER_PATH = "src/main/resources/chromedriver.exe";
    private WebDriver driver;
    private CustomWait customWait;
    private PageObjectManager manager;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_PATH);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(PAGE_URL);
        customWait = new CustomWait(driver);
        manager = new PageObjectManager(driver);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/datafiles/registration.csv")
    public void registrationTest(String firstName, String lastName, String phoneNumber, String email, String address1,
                                 String city, String state, String postalCode, String country, String userName,
                                 String password) {
        manager.getPrivacyFooterPage().clickAcceptAllBtn();
        manager.getHomePage().clickOnRegisterLink();
        manager.getRegistrationPage().inputContactInformationForm(firstName, lastName, phoneNumber, email );
        manager.getRegistrationPage().inputMailingInformationForm(address1,city, state, postalCode, country);
        manager.getRegistrationPage().inputUserInformationForm(userName,password, password);
        manager.getRegistrationPage().clickOnSubmitButton();
        manager.getRegistrationConfirmationPage().clickOnSignInLink();
        manager.getLoginPage().userLogin(userName,password);

        assertTrue(manager.getHomePage().isUserLoggedIn());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

}
