package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TicketBookingUtils;

import java.util.Calendar;
import java.util.List;

public class FiltersOnTicketBookingPage {

    public WebDriver driver;
    public FiltersOnTicketBookingPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "ba-button-10")
    public WebElement changeSearchBtn;

    @FindBy(xpath = "//button[@data-di-id='di-id-dcf65d1e-70642e39']")
    public WebElement outboundDate;

    //String outBoundDate = "22/08/2021";
    //String returnDate = "12/09/2021";

    String outBoundDateForReturn = null;

    @FindBy(xpath = "//div[@class ='myDpNextBtn']")
    public WebElement nextBtnInCalendar;

    @FindBy(xpath = "//div[@class ='myDpPrevBtn']")
    public WebElement previousBtnInCalendar;

    @FindBy(xpath = "//table/tbody/tr/td[contains(@class,'myDpCurrMonth')]")
    public List<WebElement> dateSelection;

    @FindBy(xpath = "//button[@data-di-id='di-id-2f3aa17e-b5602fd']")
    public WebElement clickOnReturnDate;

    @FindBy(xpath = "//div[@class ='myDpMonthYearText']")
    public WebElement centerInCalendar;

    @FindBy(xpath = "//button[@data-di-id= 'di-id-fa50b3f1-f22b8464']")
    public WebElement clickOnPassengerDropdown;

    @FindBy(xpath = "//html/body/app-root/app-flight-list/div[3]/lib-ba-searchbar/div/div/div/div/div[4]/div/lib-flight-only-search/div/div[3]/div/div[1]/lib-passenger-selection/div/div/lib-ba-pop-up/div[2]/lib-ba-passenger-supermix/div/lib-ba-passengermix/div[1]/div/div[2]/lib-ba-spinner/button[2]")
    public WebElement clickOnAdultPlus;

    @FindBy(xpath = "//html/body/app-root/app-flight-list/div[3]/lib-ba-searchbar/div/div/div/div/div[4]/div/lib-flight-only-search/div/div[3]/div/div[1]/lib-passenger-selection/div/div/lib-ba-pop-up/div[2]/lib-ba-passenger-supermix/div/lib-ba-passengermix/div[3]/div[1]/div[2]/lib-ba-spinner/button[2]")
    public WebElement clickOnChildrenPlus;

    @FindBy(xpath = "//*[@id=\"ba-button-20\"]")
    public WebElement passengerConfirm;

    @FindBy(xpath = "//button[@data-di-id = 'di-id-1dddfdc6-b62192ee']")
    public WebElement clickOnTravelClass;

    @FindBy(xpath = "//input[@value ='J']")
    public WebElement selectTravelClass;

    @FindBy(xpath = "//*[@id=\"ba-button-21\"]")
    public WebElement confirmTravelClass;

    @FindBy(className = "search-button")
    public WebElement filterSearchBtn;


    public void clickOnChangeSearch()
    {
        System.out.println("click on change search");
        changeSearchBtn.click();
    }
    public void clickOnOutBoundDate()
    {
        outboundDate.click();
    }
    public void selectOutBoundDate(String outBoundDate) throws InterruptedException {
        outBoundDateForReturn = outBoundDate;
        String date_dd_MM_YYYY[] = (outBoundDate.split(" ")[0]).split("/");
        //System.out.println("Month=======" +Calendar.getInstance().get(Calendar.MONTH));
        int monthDiff = Integer.parseInt(date_dd_MM_YYYY[1])- Calendar.getInstance().get(Calendar.MONTH) - 1;
        Thread.sleep(3000);

        if(monthDiff!=0)
        {
            if(monthDiff>0)
            {
                for(int i=0;i< monthDiff;i++)
                {
                    nextBtnInCalendar.click();
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
                dateSelection.get(dayDiff-1).click();
            }
        }
        System.out.println("Select uutbound date from calendar");
    }
    public void clickOnReturnDate()
    {
        clickOnReturnDate.click();
    }
    public void selectReturnDate(String returnDate) throws InterruptedException {
        String outbounddate_dd_MM_YYYY[] = (outBoundDateForReturn.split(" ")[0]).split("/");
        String returndate_dd_MM_YYYY[] = (returnDate.split(" ")[0]).split("/");
        //System.out.println("Month=======" +Calendar.getInstance().get(Calendar.MONTH));
        int monthDiff = Integer.parseInt(returndate_dd_MM_YYYY[1])- Integer.parseInt(outbounddate_dd_MM_YYYY[1]);
        if(monthDiff!=0)
        {
            if(monthDiff>0)
            {
                for(int i=0;i< monthDiff;i++)
                {
                    nextBtnInCalendar.click();
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
        int dayDiff = Integer.parseInt(returndate_dd_MM_YYYY[0]);
        if(dayDiff!=0)
        {
            if(dayDiff>0)
            {
                dateSelection.get(dayDiff-1).click();
            }
        }
        System.out.println("Select Return Date from the calendar");
    }
    public void clickOnPassengers()
    {
        clickOnPassengerDropdown.click();
        System.out.println("click on Passenger link");
    }
    public void selectPassengers() throws InterruptedException {
        clickOnAdultPlus.click();
        Thread.sleep(3000);
        clickOnChildrenPlus.click();
        Thread.sleep(5000);
        passengerConfirm.click();
        System.out.println("Select Passengers as adults and children ");

    }
    public void clickOnTravelClass()
    {
        clickOnTravelClass.click();
        System.out.println("click on travel class");
    }
    public void selectTravelClass() throws InterruptedException {
        Thread.sleep(3000);
        selectTravelClass.click();
        System.out.println("Select travel class as Business");
    }
    public void clickFilterSearch() throws InterruptedException {
        Thread.sleep(3000);
        confirmTravelClass.click();
        System.out.println("click on confirm travel search");
    }
    public void clickOnFilterSearchButton()
    {
        filterSearchBtn.click();
        System.out.println("click on search button");
    }
}
