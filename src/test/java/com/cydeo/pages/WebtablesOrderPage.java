package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebtablesOrderPage extends BasePage{
    public  WebtablesOrderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "product")
    public WebElement product;

    @FindBy(name = "quantity")
    public WebElement quantityInput;

    @FindBy(css = "input[value='100']")
    public WebElement pricePerUnit;

    @FindBy(css = "input[value='8']")
    public WebElement discount;

    @FindBy(css = "input[value='0']")
    public WebElement Total;

    @FindBy(name = "name")
    public WebElement nameInput;

    @FindBy(name = "street")
    public WebElement streetInput;

    @FindBy(name = "city")
    public WebElement cityInput;

    @FindBy(name = "state")
    public WebElement stateInput;

    @FindBy(name = "zip")
    public WebElement zipInput;

    @FindBy(name = "cardNo")
    public WebElement cardNoInput;

    @FindBy(name = "cardExp")
    public WebElement cardExpInput;

    @FindBy(css = "button[type='submit']")
    public WebElement processOrders;

    @FindBy(xpath = "//button[text()='Reset Fields']")
    public WebElement resetFields;

    @FindBy(css = "button[type='button']")
    public WebElement calculate;

    @FindBy(name = "card")
    public List<WebElement>cardType;





}
