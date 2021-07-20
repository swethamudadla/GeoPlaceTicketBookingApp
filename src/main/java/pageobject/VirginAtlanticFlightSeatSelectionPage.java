package pageobject;

import cucumber.api.java.en_old.Ac;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TicketBookingUtils;

import java.util.Calendar;
import java.util.List;

public class VirginAtlanticFlightSeatSelectionPage extends TicketBookingUtils {
    public WebDriver driver;

    public VirginAtlanticFlightSeatSelectionPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    @FindBy(id = "fromAirportName")
    public WebElement clickFromDestinationText;

    @FindBy(id = "search_input")
    public WebElement enterFromDestinationText;

    @FindBy(xpath = "//*[@id=\"airport-serach-panel\"]/div/div[2]/div/ul/li/a")
    public WebElement selectDestinationText;

    @FindBy(id = "toAirportName")
    public WebElement clickToDestinationText;

    @FindBy(id = "search_input")
    public WebElement enterToDestinationText;

    @FindBy(xpath = "//*[@id=\"airport-serach-panel\"]/div/div[2]/div/ul/li/a")
    public WebElement selectToDestinationText;

    @FindBy(id = "selectTripType-val")
    public WebElement clickOnOneWayTripDropdown;

    @FindBy(id = "ui-list-selectTripType1")
    public WebElement selectOneWayTripDropdown;

    @FindBy(id = "input_departureDate_1")
    public WebElement clickFromDateField;

    @FindBy(xpath = "//*[@id=\"booking\"]/form/div[1]/div/div[1]/div[1]/div[3]/date-selection-view/div/div/div/div/div[4]/div/div[1]/a[1]/span")
    public WebElement previousBtnInCalendar;

    @FindBy(xpath = "//*[@id=\"booking\"]/form/div[1]/div/div[1]/div[1]/div[3]/date-selection-view/div/div/div/div/div[4]/div/div[1]/a[2]/span")
    public WebElement nextButtonInCalendar;

    @FindBy(xpath = "//table/tbody/tr/td[contains(@class,'dl-datepicker-available-day')]")
    public List<WebElement> dateSelect;

    @FindBy(className = "donebutton")
    public WebElement clickOnDoneBtn;

    @FindBy(id = "passenger")
    public WebElement clickOnPassengerDropdown;

    @FindBy(xpath = "//*[@id=\"booking\"]/form/div[1]/div/div[1]/div[1]/div[4]/ngc-childpassenger/div/ul/li[1]/div[2]/div[3]/a")
    public WebElement selectAdultPassenger;

    @FindBy(xpath = "//*[@id=\"booking\"]/form/div[1]/div/div[1]/div[1]/div[4]/ngc-childpassenger/div/ul/li[3]/div[2]/div[3]/a")
    public WebElement selectChildPassenger;

    @FindBy(id = "btn-book-submit")
    public WebElement clickSearchBtn;

    @FindBy(xpath = "//body/app-root[1]/div[1]/div[2]/app-flight-result-view[1]/div[1]/div[3]/div[1]/app-grid-flight-result-container[1]/div[1]/div[1]/app-grid-fare-cell[1]/div[1]/div[5]/div[1]/a[1]")
    public WebElement clickBusinessClass;

    @FindBy(xpath = "/html/body/app-root/trip-summary-view/div[3]/div[2]/div[2]/div[1]/div/div[5]/div/div/view-seats/div/div[2]/div[2]/button")
    public WebElement clickOnChooseSeat;

    @FindBy(id = "child-rule-model-close")
    public WebElement seatForChildPopup;

    @FindBy(id = "_idBtnClose")
    public WebElement loginPopupClose;


    @FindBy(id = "seat-2K")
    public WebElement seatForFirstAdult;

    @FindBy(id = "seat-4A")
    //@FindBy(xpath = "//*[@id=\"seat-3G\"]")
    public WebElement seatForSecondAdult;

    @FindBy(id = "seat-5G")
    //@FindBy(xpath = "//*[@id=\"seat-4A\"]")
    public WebElement seatForFirstChild;

    @FindBy(xpath = "/html/body/app-root/div/div[3]/ngc-global-footer/footer/ngc-cookie-banner/div/div/div/div[2]/button")
    public WebElement cookiePolicyLink;

    @FindBy(xpath = "/html/body/app-root/app-seat-map-ism-page/app-seat-map-view-page/div/div[1]/div[2]/app-passenger-selector/div/div[2]/div/div[7]/div/div[2]/button")
    public WebElement nextPassenger;

    public void clickOnVAFromDestination()
    {
        clickFromDestinationText.click();
    }
    public void enterVAFromDestination(String fromDestinationValue) throws InterruptedException {
        enterFromDestinationText.click();
        enterFromDestinationText.clear();
        Thread.sleep(2000);
        enterFromDestinationText.sendKeys(fromDestinationValue);
        System.out.println("Enter From destination in origin field as" +fromDestinationValue );
    }
    public void selectFromDestination()
    {
        selectDestinationText.click();
        System.out.println("Select From destination in origin field");
    }
    public void clickOnVAToDestination()
    {
        clickToDestinationText.click();

    }
    public void enterVAToDestination(String toDestinationValue) throws InterruptedException {
        enterToDestinationText.click();
        enterToDestinationText.clear();
        Thread.sleep(2000);
        enterToDestinationText.sendKeys(toDestinationValue);
        System.out.println("Enter to destination in origin field");
    }
    public void selectToDestination()
    {
        selectToDestinationText.click();
        System.out.println("Select to destination from destination field ");

    }
    public void clickOneWayTrip()
    {
        clickOnOneWayTripDropdown.click();

    }
    public void selectOneWayTrip()
    {
        selectOneWayTripDropdown.click();
        System.out.println("Select one way from the dropdown" );
    }
    public void clickOnFromDate()
    {
        clickFromDateField.click();
    }
    public void selectFromDate(String fromDateValue) throws InterruptedException
    {
        //selectFromDateField.sendKeys(fromDateValue);
        String date_dd_MM_YYYY[] = (fromDateValue.split(" ")[0]).split("/");
        //System.out.println("Month=======" + Calendar.getInstance().get(Calendar.MONTH));
        int monthDiff = Integer.parseInt(date_dd_MM_YYYY[1])- Calendar.getInstance().get(Calendar.MONTH) - 1;
        Thread.sleep(3000);

        if(monthDiff!=0)
        {
            if(monthDiff>0)
            {
                for(int i=0;i< monthDiff;i++)
                {
                    nextButtonInCalendar.click();
                }
            }
            else if(monthDiff<0)
            {
                for(int i=0;i< (monthDiff*(-1));i++)
                {
                    previousBtnInCalendar.click();
                }
            }
        }

        Thread.sleep(5000);

        int dayDiff = Integer.parseInt(date_dd_MM_YYYY[0]);
        if(dayDiff!=0)
        {
            if(dayDiff>0)
            {
                dateSelect.get(dayDiff-1).click();
            }
        }

        Thread.sleep(3000);
        clickOnDoneBtn.click();
        System.out.println("Flight departure date is selected");
    }

    public void clickOnPassenger()
    {
        clickOnPassengerDropdown.click();
        System.out.println("Click on Passenger Link");
    }

    public void selectPassengersAdultAndChild()
    {
        selectAdultPassenger.click();
        System.out.println("Select 2 Passengers from the passenger dropdown");
        selectChildPassenger.click();
        System.out.println("Select 1 children from the passenger dropdown");
    }

    public void clickOnSearchBtn() throws InterruptedException {
        clickSearchBtn.click();
        Thread.sleep(10000);
    }

    public void clickOnBusinessClassTicket() throws InterruptedException
    {

        Thread.sleep(3000);
        cookiePolicyLink.click();
        Thread.sleep(5000);
        clickBusinessClass.click();
        System.out.println("Click on business class ticket");

    }

    public void clickOnChooseSeat() throws InterruptedException
    {
        Thread.sleep(5000);
        clickOnChooseSeat.click();
        System.out.println("Click on choose seat button");
    }
    public void selectAisleORWindow() throws InterruptedException {
        Thread.sleep(5000);
        seatForChildPopup.click();
        Thread.sleep(5000);
        loginPopupClose.click();
        Thread.sleep(2000);

        String seatSelectedForFirstAdult = seatForFirstAdult.getAttribute("id");
        String seatSelectedForSecondAdult = seatForSecondAdult.getAttribute("id");
        String seatSelectedForFirstChild = seatForFirstChild.getAttribute("id");

        System.out.println("Location of first seat ("+ seatSelectedForFirstAdult +"), is a " + seatSelectionLogic(seatSelectedForFirstAdult) + " seat");
        System.out.println("Location of Second seat ("+ seatSelectedForSecondAdult +"), is a " + seatSelectionLogic(seatSelectedForSecondAdult) + " seat");
        System.out.println("Location of Third seat ("+ seatSelectedForFirstChild +"), is a " + seatSelectionLogic(seatSelectedForFirstChild) + " seat");

        Thread.sleep(5000);
        ((JavascriptExecutor) driver).executeScript("scroll(0,300)");
        Actions ac = new Actions(driver);
        ac.moveToElement(seatForFirstChild).build().perform();

        Thread.sleep(5000);
        seatForFirstAdult.click();
        Thread.sleep(3000);
        nextPassenger.click();
        Thread.sleep(5000);
        seatForSecondAdult.click();
        Thread.sleep(3000);
        nextPassenger.click();
        Thread.sleep(5000);
        seatForFirstChild.click();
        Thread.sleep(3000);
        nextPassenger.click();

    }

    public String seatSelectionLogic(String inputSeat)
    {
        String seatLocation = "";
        if(inputSeat.endsWith("A") || inputSeat.endsWith("K"))
        {
            seatLocation = "Window";
            // System.out.println("Selected Seat "+ inputSeat +" is a Window seat");
        }
        else if(inputSeat.endsWith("C") || inputSeat.endsWith("D") || inputSeat.endsWith("G") || inputSeat.endsWith("H"))
        {
            seatLocation = "Aisle";
            // System.out.println("Selected Seat "+ inputSeat +" is a Aisle seat");
        }
        return seatLocation;
    }

}
