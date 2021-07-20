package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pageobject.SelectAnyTwoDestinationPage;
import utils.TicketBookingUtils;

public class SelectAnyTwoDestinations extends TicketBookingUtils {
    SelectAnyTwoDestinationPage selectAnyTwoDestinationPage;

    @Given("^I am in flights homepage$")
    public void i_am_in_flights_homepage() throws Throwable {
        openBrowser();
        selectAnyTwoDestinationPage = new SelectAnyTwoDestinationPage(driver);
        implicitWaitUtilInSeconds(driver,5);
        //Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/header/section/div[1]/a[1]")).getText().contains("BRITISH AIRWAYS"));
    }

    @When("^I click on from destination field$")
    public void i_click_on_from_destination_field() throws Throwable {
        scrollBar(driver,1200);
        implicitWaitUtilInSeconds(driver,3);
        selectAnyTwoDestinationPage.clickOnFromDestination();
    }

    @When("^I enter from destination \"(.*?)\"$")
    public void i_enter_from_destination(String fromDestinationText) throws Throwable {
        implicitWaitUtilInSeconds(driver,2);
        selectAnyTwoDestinationPage.enterFromDestination(fromDestinationText);
    }

    @When("^I select first from destination from displayed values$")
    public void i_select_first_from_destination_from_displayed_values() throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        selectAnyTwoDestinationPage.selectFromDestination();
    }

    @When("^I click on to destination field$")
    public void i_click_on_to_destination_field() throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        selectAnyTwoDestinationPage.clickOnToDestination();
    }

    @When("^I enter to destination \"(.*?)\"$")
    public void i_enter_to_destination(String toDestinationText) throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        selectAnyTwoDestinationPage.enterToDestination(toDestinationText);
    }

    @When("^I select to destination from displayed values$")
    public void i_select_to_destination_from_displayed_values() throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        selectAnyTwoDestinationPage.selectToDestination();
    }

    @Then("^I click on search button$")
    public void i_click_on_search_button() throws Throwable {
        implicitWaitUtilInSeconds(driver,5);
        selectAnyTwoDestinationPage.searchFlight();
        implicitWaitUtilInSeconds(driver,5);
        //closeBrowser();
    }
}
