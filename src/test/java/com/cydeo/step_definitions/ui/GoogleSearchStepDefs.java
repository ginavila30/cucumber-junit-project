package com.cydeo.step_definitions.ui;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;

import static org.openqa.selenium.Keys.ENTER;

public class GoogleSearchStepDefs {

    GoogleSearchPage google = new GoogleSearchPage();

    @Given("User is on google home page")
    public void user_is_on_google_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));
    }

    @When("User types apple in the google search box and hits enter")
    public void user_types_apple_in_the_google_search_box_and_hits_enter() {
        google.searchBox.sendKeys(ConfigurationReader.getProperty("google.search.word") + ENTER);
    }

    @Then("User sees apple – Google Search is in the google title")
    public void user_sees_apple_google_search_is_in_the_google_title() {
        Assert.assertEquals("apple - Google Search", Driver.getDriver().getTitle());
    }

    @When("User types {string} in the google search box and hits enter")
    public void userTypesInTheGoogleSearchBoxAndHitsEnter(String searchKeyWord) {
        google.searchBox.sendKeys(searchKeyWord + ENTER);
    }

    @Then("User sees {string} is in the google title")
    public void userSeesIsInTheGoogleTitle(String expectedTitle) {
        Assert.assertEquals("Title verification failed", expectedTitle, Driver.getDriver().getTitle());
    }

    @Then("User should be able to search for following:")
    public void user_should_be_able_to_search_for_following(List<String> searchKeyWords) {
        System.out.println("Search Key Words->" + searchKeyWords);
        for (String searchKeyWord : searchKeyWords) {
            google.searchBox.clear();
            google.searchBox.sendKeys(searchKeyWord + ENTER);
            Assert.assertEquals(searchKeyWord + " - Google Search", Driver.getDriver().getTitle());

        }

    }

    @When("User searches for {string} capital")
    public void user_searches_for_capital(String countryName) {
        google.searchBox.sendKeys("What is the capital of " + countryName + ENTER);
    }

    @Then("User should see {string} in the result")
    public void user_should_see_in_the_result(String capitalCity) {
        Assert.assertEquals(capitalCity, google.capitalText.getText());
    }

}
