package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.waits.CustomWait;


public class PrivacyFooterPage {

    private WebDriver driver;
    private CustomWait customWait;

    public PrivacyFooterPage(WebDriver driver) {
        this.driver = driver;
        this.customWait = new CustomWait(driver);
    }

    public void clickAcceptAllBtn() {
        customWait.waitForFrameToBeAvailableAndSwitchToIt(By.id("gdpr-consent-notice"));
        customWait.waitForTheElementToBeClickable(By.id("save"));
        driver.findElement(By.id("save")).click();
        driver.switchTo().defaultContent();
    }
}
