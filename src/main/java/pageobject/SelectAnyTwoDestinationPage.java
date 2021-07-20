package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TicketBookingUtils;

import java.util.List;

public class SelectAnyTwoDestinationPage extends TicketBookingUtils {
    public WebDriver driver;
    public SelectAnyTwoDestinationPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "from")
    public WebElement clickFromDestination;

    @FindBy(xpath = "//*[@id='typeahead-from']/div/ul/li")
    public WebElement selectFromDestinationValue;

    @FindBy(id = "to")
    public WebElement clickToDestination;

    @FindBy(xpath = "//*[@id='typeahead-to']/div/ul/li[1]")
    public WebElement selectToDestinationValue;

    @FindBy(xpath = "//button[@data-ng-click = 'SP.submitSearchForm()']")
    public WebElement searchBtn;

    public void clickOnFromDestination()
    {
        clickFromDestination.click();
        System.out.println("Click on British Airways from Destination");
    }
    public void enterFromDestination(String fromDestination)
    {
        clickFromDestination.sendKeys(fromDestination);
    }
    public void selectFromDestination()
    {
        selectFromDestinationValue.click();
        System.out.println("Select British Airways from Destination from displayed list");
    }
    public void clickOnToDestination()
    {
        clickToDestination.click();
        System.out.println("Click on British Airways To Destination");
    }
    public void enterToDestination(String toDestination)
    {
        clickToDestination.sendKeys(toDestination);
    }
    public void selectToDestination()
    {
        selectToDestinationValue.click();
        System.out.println("Select British Airways to Destination from displayed list");
    }
    public void searchFlight()
    {
        searchBtn.click();
        System.out.println("Click on British Airways search button");
    }

}
