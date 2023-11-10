package com.cydeo.step_definitions;
import com.cydeo.pages.FleetManagement_Page;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LastOdometer_Steps {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
    FleetManagement_Page fleetManagementPage = new FleetManagement_Page();
    LoginPage loginPage=new LoginPage();
    @When("user navigate to fleet management Page")
    public void theUserHoverOverFleetAndClickOnVehicles() {
        wait.until(ExpectedConditions.visibilityOf(loginPage.fleetMenu));
        Actions hover = new Actions(Driver.getDriver());
        hover.moveToElement(loginPage.fleetMenu).perform();
        loginPage.vehiclesMenu.click();
    }
    @When("the user clicks on filter icon")
    public void click_On_Filter_Icon() throws InterruptedException {
        Thread.sleep(10000);
        wait.until(ExpectedConditions.visibilityOf(fleetManagementPage.filterIconButton)).click();
    }
    @Then("the user is on the 'Fleet-Management' page")
    public void user_able_to_see_fleet_management_table(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(fleetManagementPage.allCarsTable));
    }

    @When("the user selects from filter as {string}")
    public void theUserSelectsFromFilterAs(String filterType) {
        wait.until(ExpectedConditions.visibilityOf(fleetManagementPage.manageFilterButton)).click();
        fleetManagementPage.searchBar.sendKeys(filterType);
        fleetManagementPage.findFilterElement(filterType).click();
    }



    @Then("the user should see filter methods as {string}")
    public void theUserShouldSeeFilterMethodsAs(String methods)  {
        List<String> filterMethodsText = new ArrayList<>();
        for (WebElement filterMethod : fleetManagementPage.filterMethods) {
            filterMethodsText.add(filterMethod.getText());
        }
        List<String> methodsText = Arrays.asList(methods.split(", "));
        System.out.println("Filter methods: " + filterMethodsText);
        // Compare the two lists
        Assert.assertTrue("The lists do not contain the same elements.",filterMethodsText.containsAll(methodsText));
    }

    @And("the user clicks on filter drop down")
    public void theUserClicksOnFilterDropDown() throws InterruptedException {
        Thread.sleep(500);
        fleetManagementPage.filterDropDown.click();
        wait.until(ExpectedConditions.visibilityOf(fleetManagementPage.operatorButton)).click();
        Thread.sleep(500);
    }

    @When("the user  clicks on a {string}")
    public void theUserClicksOnA(String methodName) {
        for (WebElement filterMethod : fleetManagementPage.filterMethods) {
            if (filterMethod.getText().trim().equalsIgnoreCase(methodName)) {
                filterMethod.click();
                break;
            }
        }
    }



    @And("enters some numeric value as {string}and {string}")
    public void entersSomeNumericValueAsAnd(String v1, String v2) throws InterruptedException {
       wait.until(ExpectedConditions.visibilityOf(fleetManagementPage.valueField));
       fleetManagementPage.valueField.sendKeys(v1);
        Thread.sleep(250);
       fleetManagementPage.valueFieldEnd.sendKeys(v2);
       fleetManagementPage.update.click();
       Thread.sleep(500);
    }

    @Then("the user should see correct results")
    public void theUserShouldSeeCorrectResults() {
        String lastOdometerColumnValue = fleetManagementPage.lastOdometerColumn.getText();
        try {
            double numericValue = Double.parseDouble(lastOdometerColumnValue);
            System.out.println("the result is :"+numericValue);
            Assert.assertTrue(!(numericValue >= 2000 || numericValue <= 7000));
        } catch (NumberFormatException e) {
            System.out.println("Error: The value is not a valid number.");

        }
    }


}
