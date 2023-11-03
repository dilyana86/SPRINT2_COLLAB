package com.cydeo.step_definitions;

import com.cydeo.pages.FilterTable_Page;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.time.Duration;
import java.util.List;

public class FilterTable_StepDefinitions {

    FilterTable_Page filterPage = new FilterTable_Page();


    @When("user  clicks on filter icon")
    public void user_clicks_on_filter_icon() {

        filterPage.filterIconButton.click();

    }
    @Then("user should be able to see Manage filters button")
    public void user_should_be_able_to_see_manage_filters_button() {

        filterPage.manageFilterButton.isDisplayed();
    }



    @When("the user clicks to the Manage filters button")
    public void the_user_clicks_to_the_manage_filters_button() {

        filterPage.manageFilterButton.click();


    }
    @Then("User should be able to click filter type in the dropdown")
    public void user_should_be_able_to_click_filter_type_in_the_dropdown(List<String> filterTypes) {

        System.out.println("Filter Types: "+ filterTypes);


        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(filterPage.manageFilterButton));

        filterPage.selectFilterButton.click();
    }




    @Then("user enters filter name in the search bar and should be able to see selected filter name")
    public void user_enters_filter_name_in_the_search_bar_and_should_be_able_to_see_selected_filter_name() {

      //  WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
     //   wait.until(ExpectedConditions.visibilityOf(filterPage.manageFilterButton));


        filterPage.searchBar.sendKeys("tags" + Keys.ENTER);






    }

















}
