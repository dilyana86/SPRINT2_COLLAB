package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GeneralInfoPage {

    public GeneralInfoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//td[@data-column-label='License Plate']")
    public WebElement licensePlate;

    @FindBy(xpath = "//label[@class='control-label']")
    public List<WebElement> allInfo;

    @FindBy(xpath = "//span[.='General Information']")
    public WebElement generalInfoText;

    @FindBy(xpath = "(//ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu'])[7]")
    public WebElement kebabMenu;

    @FindBy(xpath = "(//i[@class='fa-eye hide-text'])[6]")
    public WebElement eyeIcon;

    @FindBy(xpath = "//a[@title='Add an event to this record']")
    public WebElement addEventBtn;

    @FindBy(xpath = "//a[@title='Delete Car']")
    public WebElement deleteBtn;

    @FindBy(xpath = "//a[@title='Edit Car']")
    public WebElement editBtn;
}
