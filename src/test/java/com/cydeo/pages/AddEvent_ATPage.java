package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEvent_ATPage extends LoginPage{

    public AddEvent_ATPage() {PageFactory.initElements(Driver.getDriver(),this);}

   @FindBy(xpath = "//span[text()='Vehicles']")
    public WebElement vehicle;

    @FindBy(xpath = "//span[normalize-space()='Fleet']")
    public WebElement fleetButton;

    @FindBy(css = "tr[class='grid-row row-click-action']" )
    public WebElement vehicleRow;
 //tr[@class=normalize-space('grid-row row-click-action')]
    @FindBy(xpath = "//a[.='Add EventAdd Event']")
    public WebElement addEventButton;

    @FindBy(xpath = "//span[@class='color empty-color']")
    public WebElement colorButton;

    @FindBy(id = "oro_calendar_event_form_allDay-uid-6543c84414b09")
    public WebElement allDayEventButton;

    @FindBy(id = "recurrence-repeat-view3657")
    public WebElement repeatButton;

    @FindBy(id = "recurrence-repeats-view3657")
    public WebElement repeatsDropdownMenu;

    @FindBy(xpath = "//button[@title='close']")
    public WebElement closeButton;

    @FindBy(xpath = "//a[text()='Add Event']")
    public WebElement addEventPage;



}
