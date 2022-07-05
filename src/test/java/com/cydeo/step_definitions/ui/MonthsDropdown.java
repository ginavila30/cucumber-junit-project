package com.cydeo.step_definitions.ui;

import com.cydeo.pages.MonthDropdown;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class MonthsDropdown {
    MonthDropdown obj = new MonthDropdown();

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get(ConfigurationReader.getProperty("months.dropdown"));
    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String>dropDownValues) {

        for (String monthDropdownValue : dropDownValues) {
            Driver.getDriver().findElement(By.xpath("//option[.='"+monthDropdownValue+"']")).isDisplayed();
        }

    }
}
