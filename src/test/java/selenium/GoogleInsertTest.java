package selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleInsertTest {

    private static final String PAGE_URL="https://google.com";
    private static final String CHROMEDRIVER_PATH = "src/main/resources/chromedriver.exe";
    private WebDriver driver;

    @BeforeEach
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_PATH);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(PAGE_URL);
    }

    @Test
    public void firstTest() throws InterruptedException {
        WebElement acceptAll = driver.findElement(By.id("L2AGLb"));
        Thread.sleep(3000);
        acceptAll.click();
        WebElement input = driver.findElement(By.name("q"));
        input.sendKeys("Netflix");
        Thread.sleep(3000);
        input.sendKeys(Keys.ENTER);
    }

    @AfterEach
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }




}
