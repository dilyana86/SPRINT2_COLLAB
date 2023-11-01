package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEvent_CompulsoryPage {

    public AddEvent_CompulsoryPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[text()='Vehicles']")
    public WebElement vehicle;

    @FindBy(xpath = "//span[normalize-space()='Fleet']")
    public WebElement fleetButton;

    @FindBy(css = ".grid-row.row-click-action")
    public WebElement vehicleRow;

    @FindBy(xpath = "//span[.='General Information']")
    public WebElement addEventPage;


    @FindBy(xpath = "//a[text()='Add Event']")
    public WebElement addEventButton;



}
