package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterTable_Page {


    public FilterTable_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[@class='actions-panel pull-right form-horizontal']/div/a/i")
    public WebElement filterIconButton;


    @FindBy(xpath = "//a[@class='add-filter-button']")
    public WebElement manageFilterButton;


    @FindBy(xpath = "//input[@value='Tags']")
    public WebElement selectFilterButton;     // tags

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBar;









}

