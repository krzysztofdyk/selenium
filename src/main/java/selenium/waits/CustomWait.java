package selenium.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CustomWait {

    private WebDriver driver;
    private WebDriverWait wait;

    public CustomWait(WebDriver webDriver){
        this.driver = webDriver;
        this.wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
    }

    public  void waitForFrameToBeAvailableAndSwitchToIt(By by){
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
    }

    public void waitForTheElementToBeClickable(By by){
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

}
