package selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GuruAcceptTest {

    private static final String PAGE_URL="https://demo.guru99.com/test/newtours";
    private static final String CHROMEDRIVER_PATH = "src/main/resources/chromedriver.exe";
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeEach
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_PATH);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(PAGE_URL);
    }

    @Test
    public void firstTest() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("save")));
        WebElement acceptAll = driver.findElement(By.id("save"));
        acceptAll.click();
    }

    @AfterEach
    public void tearDown() throws InterruptedException {
        driver.quit();
    }




}
