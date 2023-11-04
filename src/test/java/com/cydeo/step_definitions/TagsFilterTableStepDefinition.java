package com.cydeo.step_definitions;

import com.cydeo.pages.FilterTablePageVH;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class TagsFilterTableStepDefinition {

    LoginPage loginPage = new LoginPage();
    FilterTablePageVH FilterTablePageVH = new FilterTablePageVH();

    @Then("user hovers over fleet in dashboard menu and clicks on vehicles")
    public void UserHoversOverFleetInDashboardMenuAndClicksOnVehicles() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(loginPage.fleetMenu));

        Actions hover = new Actions(Driver.getDriver());
        hover.moveToElement(loginPage.fleetMenu).perform();
        loginPage.vehiclesMenu.click();
    }


    @And("user clicks on the Filter icon")
    public void userClicksOnTheFilterIcon() {

        WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait2.until(ExpectedConditions.visibilityOf(FilterTablePageVH.FilterIconButton));
        BrowserUtils.waitFor(2);


        FilterTablePageVH.FilterIconButton.click();
    }

    @And("user clicks on Manage Filters dropdown")
    public void userClicksOnManageFiltersDropdown() {
        FilterTablePageVH.ManageFiltersButton.click();
    }

    @And("user selects Tags option from Manage Filters dropdown")
    public void userSelectsTagsOptionFromManageFiltersDropdown() {
        FilterTablePageVH.TagsOption.click();
    }

    @Then("Tags filter is selected")
    public void tagsFilterIsSelected() {
        FilterTablePageVH.TagsOption.isSelected();
    }

    @And("user clicks on Tags:All dropdown button")
    public void userClicksOnTagsAllDropdownButton() {
        FilterTablePageVH.TagsAllButton.click();
    }

    @And("user clicks on Is Any Of option from Tags:All button dropdown")
    public void userClicksOnIsAnyOfOptionFromTagsAllButtonDropdown() {
        FilterTablePageVH.IsAnyOfOptionDropdownButton.click();
    }

    /*@Then("user should see two methods shown Is Any Of and Is Not Any Of")
    public void userShouldSeeTwoMethodsShownIsAnyOfAndIsNotAnyOf() {

        WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait1.until(ExpectedConditions.visibilityOf(FilterTablePageVH.IsNotAnyOfOption));

        Assert.assertTrue(FilterTablePageVH.IsNotAnyOfOption.isDisplayed());

        String expectedValueText = "Is Not Any Of";
        String actualValueText = FilterTablePageVH.IsNotAnyOfOption.getText();

        Assert.assertEquals(actualValueText, expectedValueText);

        WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait2.until(ExpectedConditions.visibilityOf(FilterTablePageVH.IsAnyOfOption));

        Assert.assertTrue(FilterTablePageVH.IsAnyOfOption.isDisplayed());

        String expectedValueText2 = "Is Any Of";
        String actualValueText2 = FilterTablePageVH.IsAnyOfOption.getText();

        Assert.assertEquals(actualValueText2, expectedValueText2);
    }*/

    @And("user clicks on Is Any Of option method")
    public void userClicksOnIsAnyOfOptionMethod() {

        FilterTablePageVH.IsAnyOfOption.click();
    }


    @And("user enters {string} option in Is Any Of method field and presses ENTER")
    public void userEntersOptionInIsAnyOfMethodFieldAndPressesENTER (String string1){

        WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait2.until(ExpectedConditions.visibilityOf(FilterTablePageVH.InputTagField));



        FilterTablePageVH.InputTagField.click();

        FilterTablePageVH.InputTagField.sendKeys(string1);

        BrowserUtils.waitFor(3);

        FilterTablePageVH.InputTagField.sendKeys(Keys.ENTER);
    }

    @Then("user should see two methods shown Is Any Of and Is Not Any Of")
    public void userShouldSeeTwoMethodsShownIsAnyOfAndIsNotAnyOf(List<String> expected) {

        BrowserUtils.sleep(2);
        List<String>  actual = new ArrayList<>();

        for (WebElement each : FilterTablePageVH.DropDownItemChoiceValue) {
            actual.add(each.getText());
        }
        Assert.assertEquals(expected, actual);
    }

    @Then("user should see correspondent value for {string} option")
    public void userShouldSeeCorrespondentValueForOption(String arg0) {
        BrowserUtils.sleep(2);
        List<String>  actual = new ArrayList<>();

        for (WebElement each : FilterTablePageVH.TagsCells) {
            actual.add(each.getText());
        }

        for(String name : actual)
        {
            Assert.assertEquals(name,arg0);
        }

        //Assert.assertTrue(actual.contains(arg0));

    }
}







