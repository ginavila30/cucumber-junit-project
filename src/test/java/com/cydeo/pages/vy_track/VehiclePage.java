package com.cydeo.pages.vy_track;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehiclePage {
    public VehiclePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@title=\"Refresh\"]")
    public WebElement refreshBtn;

    @FindBy(xpath = "//a[@title=\"Reset\"]")
    public WebElement resetBtn;

    @FindBy(xpath = "//a[@title=\"Grid Settings\"]")
    public WebElement settingsBtn;

    @FindBy(xpath ="//label[.=\"Id\"]/..//following-sibling::td[@class=\"visibility-cell\"]//input" )
    public WebElement idVisibilitySetting;

    @FindBy(xpath = "//span[@class=\"close\"]")
    public WebElement closeGridSettingBtn;

    @FindBy(xpath = "//thead[@class=\"grid-header\"]//a")
    public List<WebElement> gridHeaders;

    @FindBy(className = "loading-bar")
    public WebElement loadingBar;


    @FindBy(className = "other-scroll-container")
    public  WebElement tableContainer;

}
