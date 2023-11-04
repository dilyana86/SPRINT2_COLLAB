package com.cydeo.step_definitions;

import com.cydeo.pages.FleetVehiclePage;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class FleetVehicle_StepDefinitions {

    FleetVehiclePage fleetVehiclePage = new FleetVehiclePage();

    @Then("user should see all vehicle information")
    public void user_should_see_all_vehicle_information() {

        Assert.assertTrue(fleetVehiclePage.vehicleTable.isDisplayed());

    }

    @Then("user should see total page number")
    public void user_should_see_total_page_number() {

        Assert.assertTrue(fleetVehiclePage.totalPageNumber.isDisplayed());

    }

    @Given("user click on the next page button")
    public void user_click_on_the_next_page_button() {

        fleetVehiclePage.nextPageButton.click();

    }

    @Then("user should go to next page")
    public void user_should_go_to_next_page() {

        String expectedNextPageResult = "2";
        String actualNextPageResult = fleetVehiclePage.pageNumber.getAttribute("value");

        Assert.assertEquals(actualNextPageResult, expectedNextPageResult);
    }


    @Then("user click on the previous page button")
    public void user_click_on_the_previous_page_button() {

        fleetVehiclePage.previousPageButton.click();

    }

    @Then("user should go to previous page")
    public void user_should_go_to_previous_page() {

        String expectedPreviousPageResult = "1";
        String actualPreviousPageResult = fleetVehiclePage.pageNumber.getAttribute("value");

        Assert.assertEquals(actualPreviousPageResult, expectedPreviousPageResult);

    }

    @Then("user should see total recordings of vehicles")
    public void user_should_see_total_recordings_of_vehicles() {

        Assert.assertTrue(fleetVehiclePage.totalRecordings.isDisplayed());

    }


}
