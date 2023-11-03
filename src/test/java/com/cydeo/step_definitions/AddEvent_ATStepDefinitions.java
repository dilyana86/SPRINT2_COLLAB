package com.cydeo.step_definitions;

import com.cydeo.pages.AddEvent_ATPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddEvent_ATStepDefinitions extends AddEvent_ATPage {

    Actions actions = new Actions(Driver.getDriver());

    @And("click on vehicles row")
    public void click_on_vehicles_row() {

        closeButton.click();
        //BrowserUtils.sleep(3);
        vehicleRow.click();
        BrowserUtils.sleep(3);
    }


    @And("user should click on the add event button")
    public void userShouldClickOnTheAddEventButton() {

        BrowserUtils.sleep(3);
        addEventButton.click();

        BrowserUtils.sleep(3);

    }

    @Then("user should see the add event page")
    public void userShouldSeeTheAddEventPage() {

        addEventPage.isDisplayed();

    }




}
