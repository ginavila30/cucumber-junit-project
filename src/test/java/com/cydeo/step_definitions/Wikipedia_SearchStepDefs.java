package com.cydeo.step_definitions;

import com.cydeo.pages.WikipediaSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wikipedia_SearchStepDefs {
    WikipediaSearchPage wikiObj=new WikipediaSearchPage();
    @And("User clicks wiki search button")
    public void userClicksWikiSearchButton() {
        wikiObj.searchBtn.click();

    }

    @Given("user is on Wikipedia home page")
    public void userIsOnWikipediaHomePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("wikipedia.url"));
    }

    @When("User types {string} in the wiki search box")
    public void userTypesSearchKeyInTheWikiSearchBox(String searchKey) {
        wikiObj.searchBox.sendKeys(searchKey);
    }

    @Then("User sees {string} is in the wiki title")
    public void userSeesSearchKeyIsInTheWikiTitle(String searchKey) {
        BrowserUtils.verifyTitle(searchKey);
    }

    @Then("User sees {string} is in the main header")
    public void userSeesSearchKeyIsInTheMainHeader(String searchKey) {
        Assert.assertTrue(wikiObj.mainHeader.getText().contains(searchKey));
    }

    @Then("User sees {string} is in the image header")
    public void userSeesSearchKeyIsInTheImageHeader(String searchKey) {
        Assert.assertTrue(wikiObj.imageHeader.getText().contains(searchKey));
    }
}
