package com.cydeo.step_definitions;

import com.cydeo.pages.GeneralInfoPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class GeneralInfo_StepDefinitions {


    GeneralInfoPage generalInfo = new GeneralInfoPage();

    @Then("user click any vehicle row in the list")
    public void user_click_any_vehicle_row_in_the_list() {
        generalInfo.licensePlate.click();
    }

    @Then("user should see vehicle information displayed")
    public void userShouldSeeVehicleInformationDisplayed(List<String> expectedInfo) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(generalInfo.generalInfoText));

        List<String> actualInfo = new ArrayList<>();
        for (WebElement eachInfo : generalInfo.allInfo) {
            actualInfo.add(eachInfo.getText());

        }
        //System.out.println(actualInfo);

        Assert.assertEquals("Info are not displayed",expectedInfo,actualInfo);


    }


    @And("user click Eye icon at the end of each row")
    public void userClickEyeIconAtTheEndOfEachRow() {
        Actions hover = new Actions(Driver.getDriver());
        hover.moveToElement(generalInfo.kebabMenu);

        BrowserUtils.sleep(2);


        generalInfo.eyeIcon.click();
//        try {
//            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
//            wait.until(ExpectedConditions.visibilityOf(generalInfo.kebabMenu));
//
//            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
//            js.executeScript("arguments[0].dispatchEvent(new Event('mouseover'))", generalInfo.kebabMenu);
//            generalInfo.eyeIcon.click();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }

    @Then("sales manager and store manager should see Edit, Delete and Add Event buttons on the General Information page")
    public void salesManagerAndStoreManagerShouldSeeEditDeleteAndAddEventButtonsOnTheGeneralInformationPage() {
        Assert.assertTrue(generalInfo.editBtn.isDisplayed());
        Assert.assertTrue(generalInfo.deleteBtn.isDisplayed());

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(generalInfo.eyeIcon));

        Assert.assertTrue(generalInfo.addEventBtn.isDisplayed());
    }
}
