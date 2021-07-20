package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TicketBookingUtils {
    public static WebDriver driver;
    public void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(TicketBookingConstant.url);
        driver.manage().window().maximize();
        implicitWaitUtilInSeconds(driver,3);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[1]/a")).click();
    }
    public void openVirginAtlanticBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(TicketBookingConstant.virginATURL);
        driver.manage().window().maximize();
        implicitWaitUtilInSeconds(driver,3);
    }
    public void closeBrowser()
    {
        driver.close();
    }
    public static void implicitWaitUtilInSeconds(WebDriver driver, int maxTimeOut)
    {
        driver.manage().timeouts().implicitlyWait(maxTimeOut, TimeUnit.SECONDS);
    }
    public static void explicitWaitTime(WebDriver driver, int maxTimeout, WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static void scrollBar(WebDriver driver, int maxScroll)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String actionStr = "window.scrollBy(0," + maxScroll + ")";
        js.executeScript(actionStr);
    }
}
