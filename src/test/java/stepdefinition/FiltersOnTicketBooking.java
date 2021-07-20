package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pageobject.FiltersOnTicketBookingPage;
import utils.TicketBookingUtils;

public class FiltersOnTicketBooking extends TicketBookingUtils {

    FiltersOnTicketBookingPage filtersOnTicketBookingPage = new FiltersOnTicketBookingPage(driver);
    @Given("^I am in flight selection page$")
    public void i_am_in_flight_selection_page() throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        //Assert.assertTrue(driver.findElement(By.xpath("//*[@id='global-header']/div[3]/h1")).getText().contains("FLIGHT SELECTION"));
    }

    @When("^I click on change search link$")
    public void i_click_on_change_search_link() throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        filtersOnTicketBookingPage.clickOnChangeSearch();
    }

    @When("^I click on date outbound$")
    public void i_click_on_date_outbound() throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        filtersOnTicketBookingPage.clickOnOutBoundDate();
    }

    @When("^I select out bound date from the calendar \"(.*?)\"$")
    public void i_select_out_bound_date_from_the_calendar(String selectOutBound) throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        filtersOnTicketBookingPage.selectOutBoundDate(selectOutBound);
    }

    @When("^I click add return button$")
    public void i_click_add_return_button() throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        filtersOnTicketBookingPage.clickOnReturnDate();
    }

    @When("^I select return date from the calendar \"(.*?)\"$")
    public void i_select_return_date_from_the_calendar(String selectReturn) throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        filtersOnTicketBookingPage.selectReturnDate(selectReturn);
    }

    @When("^I click on passengers dropdown$")
    public void i_click_on_passengers_dropdown() throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        filtersOnTicketBookingPage.clickOnPassengers();
    }

    @When("^I select adults and childrens$")
    public void i_select_adults_and_childrens() throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        filtersOnTicketBookingPage.selectPassengers();
    }

    @When("^I click on travel class$")
    public void i_click_on_travel_class() throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        filtersOnTicketBookingPage.clickOnTravelClass();
    }

    @When("^I select travel class as business$")
    public void i_select_travel_class_as_business() throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        filtersOnTicketBookingPage.selectTravelClass();
        implicitWaitUtilInSeconds(driver,5);
        filtersOnTicketBookingPage.clickFilterSearch();
    }

    @Then("^I click on filter search button$")
    public void i_click_on_filter_search_button() throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        filtersOnTicketBookingPage.clickOnFilterSearchButton();
    }

}
