package com.automation.steps;

import com.automation.pages.FlightSearchPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class FlightSearchSteps {

    FlightSearchPage flightSearchPage = new FlightSearchPage();

    @Then("verify user is on flight search screen")
    public void verify_user_is_on_flight_search_screen() {
        Assert.assertTrue(flightSearchPage.isFlightSearchPageDisplayed());
    }

}
