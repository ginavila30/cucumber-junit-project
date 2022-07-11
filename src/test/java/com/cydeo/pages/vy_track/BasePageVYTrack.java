package com.cydeo.pages.vy_track;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePageVYTrack {
    public BasePageVYTrack(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

   public Actions actions = new Actions(Driver.getDriver());
   public WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);



    @FindBy(xpath = "//i[@class=\"fa-asterisk menu-icon\"]/ancestor::a")
    public WebElement fleetModule;

    @FindBy(xpath = "//i[@class=\"fa-asterisk menu-icon\"]/ancestor::a//following-sibling::*//li[contains(@class,\"dropdown-menu-single-item\")]")
    public List<WebElement> fleetDropDownOptions;


    public void selectFromFleetModule(String option){
        for (WebElement dropDownOption : fleetDropDownOptions) {
            if (dropDownOption.getText().equalsIgnoreCase(option)) {
                dropDownOption.click();
            }
        }
    }

    public void hoverOverModule(WebElement module){
        wait.until(ExpectedConditions.elementToBeClickable(module));
        actions.moveToElement(module).perform();
    }


}
