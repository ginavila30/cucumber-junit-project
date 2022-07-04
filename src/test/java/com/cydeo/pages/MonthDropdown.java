package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MonthDropdown {
    public MonthDropdown() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "month")
    public WebElement monthDropDown;

    @FindBy(xpath = "//select[@id=\"month\"]//option")
    public List<WebElement> monthDropdownValues;
}
