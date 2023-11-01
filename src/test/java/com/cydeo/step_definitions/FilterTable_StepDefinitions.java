package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FilterTable_StepDefinitions extends LoginPage{


    @Then("the user hover over fleet and click on vehicles")
    public void theUserHoverOverFleetAndClickOnVehicles() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(fleetMenu));

        Actions hover = new Actions(Driver.getDriver());
        hover.moveToElement(fleetMenu).perform();
        vehiclesMenu.click();
    }



    @Then("the user should click on filter icon")
    public void the_user_should_click_on_filter_icon() {



    }



    @Then("the user should be able to see Manage filters button")
    public void the_user_should_be_able_to_see_manage_filters_button() {


    }


}














