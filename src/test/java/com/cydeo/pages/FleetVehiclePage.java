package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FleetVehiclePage {

    public FleetVehiclePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']")
    public WebElement vehicleTable;

    @FindBy(xpath = "//label[@class='dib'][2]")
    public WebElement totalPageNumber;

    @FindBy(xpath = "//i[@class='fa-chevron-right hide-text']")
    public WebElement nextPageButton;

    @FindBy(xpath = "//i[@class='fa-chevron-left hide-text']")
    public WebElement previousPageButton;

    @FindBy(xpath = "//label[@class='dib'][3]")
    public WebElement totalRecordings;

    @FindBy(className = "input-widget")
    public WebElement pageNumber;


}
