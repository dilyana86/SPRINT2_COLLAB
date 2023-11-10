package com.cydeo.pages;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FleetManagement_Page {

    WebDriver driver=Driver.getDriver();
    public FleetManagement_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@title='Filters']")
    public WebElement filterIconButton;
    @FindBy(xpath = "//a[@class='add-filter-button']")
    public WebElement manageFilterButton;
    @FindBy(xpath = "//input[@value='Tags']")
    public WebElement selectFilterButton;     // tags
    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBar;
    @FindBy(xpath = "//div[@class='grid-scrollable-container scrollbar-is-visible']")
    public WebElement allCarsTable;

    @FindBy(xpath = "//div[@class='filter-item oro-drop']")
    public WebElement filterDropDown;

    public WebElement findFilterElement(String name) {
        String xpath = String.format("//label[@title='%s']", name);
        return driver.findElement(By.xpath(xpath));}

    @FindAll({@FindBy(xpath = "//a[@class='dropdown-item choice-value']")})
    public List<WebElement> filterMethods;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle']")
    public WebElement operatorButton;

    @FindBy(xpath = "//input[@name='value']")
    public WebElement valueField;

    @FindBy(xpath = "//input[@name='value_end']")
    public WebElement valueFieldEnd;

    @FindBy(xpath = "//button[@class='btn btn-primary filter-update']")
    public WebElement update;

    @FindBy(xpath = "//td[@data-column-label='Last Odometer']")
    public WebElement lastOdometerColumn;
}







