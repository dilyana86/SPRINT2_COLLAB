package com.cydeo.step_definitions;

import com.cydeo.pages.ArrangeDataTablePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
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

public class ArrangeDataTable_StepDefinition {

    ArrangeDataTablePage arrangeDataTablePage = new ArrangeDataTablePage();

    @When("the user clicks on the gear icon")
    public void the_user_clicks_on_the_gear_icon() {
        arrangeDataTablePage.gridSettingsBtn.click();
    }

    @Then("Grid Settings should be visible")
    public void should_be_visible() {
        arrangeDataTablePage.gridSettingsText.isDisplayed();
    }

    @Then("the column names in grid settings should be displayed as follows:")
    public void the_column_names_in_grid_settings_should_be_displayed_as_follows(List<String> expectedText) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(arrangeDataTablePage.gridSettingsText));

        List<String> actualText = new ArrayList<>();
        for (WebElement eachText : arrangeDataTablePage.allGridSettings) {
            actualText.add(eachText.getText());
        }
        Assert.assertEquals(expectedText, actualText);
    }
}
