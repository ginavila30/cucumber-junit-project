package com.cydeo.step_definitions.ui;

import com.cydeo.pages.CRMLogin;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class CRM_Login {
    CRMLogin obj = new CRMLogin();

    @Given("User is on the login page of CRM")
    public void user_is_on_the_login_page_of_crm() {
        Driver.getDriver().get(ConfigurationReader.getProperty("nextbase.crm.url"));
    }
    @When("User enters below credentials crm")
    public void user_enters_below_credentials_crm(Map<String, String>map) {
        obj.UserLoginInput.sendKeys(map.get("username"));
        obj.UserPasswordInput.sendKeys(map.get("password"));
        obj.loginBtnInput.click();
    }

    @Then("User should see page that contains {string}")
    public void userShouldSeePageThatContains(String word) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(word));
    }
}
