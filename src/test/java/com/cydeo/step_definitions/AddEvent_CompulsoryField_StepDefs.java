package com.cydeo.step_definitions;

import com.cydeo.pages.AddEvent_CompulsoryPage;
import com.cydeo.pages.BasePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class AddEvent_CompulsoryField_StepDefs extends AddEvent_CompulsoryPage {


    Actions actions = new Actions(Driver.getDriver());

    @When("user hover over on Fleet button and click Vehicle button")
    public void user_hover_over_on_fleet_button_and_click_vehicle_button() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(fleetButton));

        actions.moveToElement(fleetButton).perform();
        vehicle.click();

    }

    @When("click on vehicle row")
    public void click_on_vehicle_row() {
        vehicleRow.click();

    }

    @Then("user should access the Add Event page")
    public void user_should_access_the_add_event_page() {

        Assert.assertTrue(addEventPage.isDisplayed());

    }

    @Then("{string} can click Add Event button, but driver can NOT see Add Event button")
    public void can_click_add_event_button_but_driver_can_not_see_add_event_button(String user) {
        if (user.equals("sales manager") || user.equals("store manager")) {
            Assert.assertTrue(addEventButton.isDisplayed());
        }

        if (user.equals("driver")) {
            Assert.assertFalse(addEventButton.isDisplayed());
        }

    }

    @When("{string} can click Add Event button")
    public void can_click_add_event_button(String user) {
        if (user.equals("sales manager") || user.equals("store manager")) {
            addEventButton.click();
        }
    }

    @Then("Add Event page should pop up")
    public void add_event_page_should_pop_up() {
        addEventPopup.isDisplayed();
    }

    @Then("Compulsory fields are shown as below Compulsory fields are shown as below:")
    public void compulsory_fields_are_shown_as_below_compulsory_fields_are_shown_as_below(List<String> expectedRequiredFields) {

        BrowserUtils.sleep(3);
        List<String> actualRequiredFields = new ArrayList<>();

        for (WebElement each : addEventPopupRequiredFields) {
            actualRequiredFields.add(each.getText().replace("*", ""));
        }


        Assert.assertEquals(expectedRequiredFields, actualRequiredFields);
    }

    @Then("if any compulsory field is not filled, {string} message should be displayed after clicking on save button")
    public void if_any_compulsory_field_is_not_filled_message_should_be_displayed_after_clicking_on_save_button(String expected) {

        saveButtonPopup.click();
        Assert.assertEquals(expected, valueIsNotBlank.getText());

        BrowserUtils.sleep(3);

        titleField.sendKeys("hello");
        saveButtonPopup.click();
        Assert.assertEquals(expected, valueIsNotBlank.getText());


    }

}
