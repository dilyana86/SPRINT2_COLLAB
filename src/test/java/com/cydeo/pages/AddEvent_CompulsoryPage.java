package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AddEvent_CompulsoryPage {

    public AddEvent_CompulsoryPage() {
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

    @FindBy(xpath = "//a[text()='Add Event']")
    public WebElement addEventPopup;

    @FindBy(xpath = "//label[@class='required']")
    public List<WebElement> addEventPopupRequiredFields;

    @FindBy(xpath = "//button[@type= 'submit']")
    public WebElement saveButtonPopup;

    @FindBy(xpath = "//div[.='This value should not be blank.']")
    public WebElement valueIsNotBlank;

    @FindBy(xpath = "//input[@data-name='field__title']")
    public WebElement titleField;

    @FindBy(xpath = "//button[@title='close']")
    public WebElement closePopup;

    @FindBy(css = "div[class='loader-mask shown']")
    @CacheLookup
    protected WebElement loaderMask;

    public void waitUntilLoaderScreenDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
