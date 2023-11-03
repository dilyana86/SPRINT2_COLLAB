package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import io.cucumber.core.filter.Filters;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilterTablePageVH {

    public FilterTablePageVH(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Filters']")
    public WebElement FilterIconButton;

    //click

    @FindBy(xpath = "//a[@class='add-filter-button']")
    public WebElement ManageFiltersButton;

    @FindBy(xpath = "//label[@title='Tags']")
    public WebElement TagsOption;

    @FindBy(xpath = "//div[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value']")
    public WebElement TagsAllButton;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle']")
    public WebElement IsAnyOfOptionDropdownButton;

    @FindBy(xpath = "//a[@class='dropdown-item choice-value']")
    public List<WebElement> DropDownItemChoiceValue;

    @FindBy(xpath = "//a[.='is not any of']")
    public WebElement IsNotAnyOfOption;

    @FindBy(xpath = "//a[.='is any of']")
    public WebElement IsAnyOfOption;

    @FindBy(xpath = "//input[@id='s2id_autogen2']")
    public WebElement InputTagField;

    @FindBy(xpath = "//b[@class='filter-criteria-hint']")
    public WebElement ApprovedFilterCriteriaButton;


    @FindBy(xpath = "//ul[@class='unstyled options']")
    public List<WebElement> TagsCells;










}
