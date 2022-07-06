package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRMLogin {
    public CRMLogin(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement UserLoginInput;

    @FindBy(name = "USER_PASSWORD")
    public WebElement UserPasswordInput;

    @FindBy(css = ".login-btn")
    public WebElement loginBtnInput;
}
