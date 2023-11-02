package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ArrangeDataTablePage {

    public ArrangeDataTablePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "(//a[contains(@class,'mode-icon-only')])[2]")
    public WebElement gridSettingsBtn;

    @FindBy (xpath = "//div[.='Grid Settings']")
    public WebElement gridSettingsText;

    @FindBy (xpath = "//td[@class='title-cell']")
    public List<WebElement> allGridSettings;


}
