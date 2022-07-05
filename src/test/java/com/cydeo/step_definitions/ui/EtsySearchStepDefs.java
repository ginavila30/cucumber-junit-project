package com.cydeo.step_definitions.ui;

import com.cydeo.pages.EtsyPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.description.annotation.AnnotationSource;
import org.junit.Assert;

public class EtsySearchStepDefs {
    EtsyPage etsyObj = new EtsyPage();

    @Given("User is on Etsy home page")
    public void user_is_on_etsy_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("etsy.url"));
        Assert.assertEquals("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone", Driver.getDriver().getTitle());
    }

    @When("User types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsyObj.searchBox.sendKeys("Wooden Spoon");

    }

    @When("User clicks search button")
    public void user_clicks_search_button() {
        etsyObj.searchBtn.click();
    }

    @Then("User sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Wooden spoon"));
    }

    @When("User types {string} in the search box")
    public void user_types_in_the_search_box(String searchKeyWord) {
        etsyObj.searchBox.sendKeys(searchKeyWord);

    }

    @Then("User sees {string} is in the title")
    public void user_sees_is_in_the_title(String searchKeyWord) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(searchKeyWord));
    }


}
