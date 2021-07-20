package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobject.VirginAtlanticFlightSeatSelectionPage;
import utils.TicketBookingUtils;

public class VirginAtlanticFlightSeatSelection extends TicketBookingUtils {

    VirginAtlanticFlightSeatSelectionPage virginAtlanticFlightSeatSelectionPage;
    @Given("^I am in virgin atlantic flights homepage$")
    public void i_am_in_virgin_atlantic_flights_homepage() throws Throwable {

        openVirginAtlanticBrowser();
        virginAtlanticFlightSeatSelectionPage = new VirginAtlanticFlightSeatSelectionPage(driver);
        implicitWaitUtilInSeconds(driver,5);
        
    }

    @When("^I click on from destination field in virgin atlantic$")
    public void i_click_on_from_destination_field_in_virgin_atlantic() throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        virginAtlanticFlightSeatSelectionPage.clickOnVAFromDestination();
    }

    @When("^I enter from destination value\"(.*?)\"$")
    public void i_enter_from_destination_value(String fromDestinationTxt) throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        virginAtlanticFlightSeatSelectionPage.enterVAFromDestination(fromDestinationTxt);
    }

    @When("^I select from destination from displayed values$")
    public void i_select_from_destination_from_displayed_values() throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        virginAtlanticFlightSeatSelectionPage.selectFromDestination();
    }

    @When("^I click on to destination field in virgin atlantic$")
    public void i_click_on_to_destination_field_in_virgin_atlantic() throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        virginAtlanticFlightSeatSelectionPage.clickOnVAToDestination();
    }

    @When("^I enter to destination value \"(.*?)\"$")
    public void i_enter_to_destination_value(String toDestinationTxt) throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        virginAtlanticFlightSeatSelectionPage.enterVAToDestination(toDestinationTxt);
    }

    @When("^I select to destination value from displayed values$")
    public void i_select_to_destination_value_from_displayed_values() throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        virginAtlanticFlightSeatSelectionPage.selectToDestination();
    }

    @When("^I select one way trip$")
    public void i_select_one_way_trip() throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        virginAtlanticFlightSeatSelectionPage.clickOneWayTrip();
        implicitWaitUtilInSeconds(driver,5);
        virginAtlanticFlightSeatSelectionPage.selectOneWayTrip();
    }

    @When("^I click on date from date$")
    public void i_click_on_date_from_date() throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        virginAtlanticFlightSeatSelectionPage.clickOnFromDate();

    }

    @When("^I select from date from the calendar \"(.*?)\"$")
    public void i_select_from_date_from_the_calendar(String fromDate) throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        virginAtlanticFlightSeatSelectionPage.selectFromDate(fromDate);
    }

    @When("^I click on passenger dropdown$")
    public void i_click_on_passenger_dropdown() throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        virginAtlanticFlightSeatSelectionPage.clickOnPassenger();
    }

    @When("^I select adults and children$")
    public void i_select_adults_and_children() throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        virginAtlanticFlightSeatSelectionPage.selectPassengersAdultAndChild();
    }

    @When("^I click on search button field$")
    public void i_click_on_search_button_field() throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        virginAtlanticFlightSeatSelectionPage.clickOnSearchBtn();
    }

    @When("^I click business class ticket for outbound$")
    public void i_click_business_class_ticket_for_outbound() throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        virginAtlanticFlightSeatSelectionPage.clickOnBusinessClassTicket();
    }

    @When("^I select business class ticket for outbound$")
    public void i_select_business_class_ticket_for_outbound() throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        //virginAtlanticFlightSeatSelectionPage.selectBusinessClassTicket();
    }

    @Then("^I click on choose seat link$")
    public void i_click_on_choose_seat_link() throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        virginAtlanticFlightSeatSelectionPage.clickOnChooseSeat();
    }

    @Then("^I should be select aisle seat or window seat$")
    public void i_should_be_select_aisle_seat_or_window_seat() throws Throwable {
        implicitWaitUtilInSeconds(driver,5);

        virginAtlanticFlightSeatSelectionPage.selectAisleORWindow();
        scrollBar(driver,1000);
        //closeBrowser();
    }
}
