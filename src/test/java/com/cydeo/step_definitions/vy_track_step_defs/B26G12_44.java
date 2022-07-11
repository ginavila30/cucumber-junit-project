package com.cydeo.step_definitions.vy_track_step_defs;

import com.cydeo.pages.vy_track.BasePageVYTrack;
import com.cydeo.pages.vy_track.VYTrakLoginPage;
import com.cydeo.pages.vy_track.VehiclePage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class B26G12_44 extends BasePageVYTrack {
    VYTrakLoginPage loginObj = new VYTrakLoginPage();
    VehiclePage vehicleObj = new VehiclePage();

    @Given("that user is logged in and on {string} feature under fleet module")
    public void thatUserIsLoggedInAndOnFeatureUnderFleetModule(String module) {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.url"));
        loginObj.login(ConfigurationReader.getProperty("vytrack.username"), ConfigurationReader.getProperty("vytrack.password"));
       hoverOverModule(fleetModule);
       // fleetModule.click();
        selectFromFleetModule(module);
        wait.until(ExpectedConditions.titleContains("Car"));
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(ConfigurationReader.getProperty("vehicle.feature.title"), actualTitle);
    }

    @When("the user clicks on reset")
    public void the_user_clicks_on_reset() {
        vehicleObj.settingsBtn.click();
        vehicleObj.idVisibilitySetting.click();
        vehicleObj.closeGridSettingBtn.click();
        int updatedHeaders= vehicleObj.gridHeaders.size();
        vehicleObj.resetBtn.click();
        int defaultHeaders = vehicleObj.gridHeaders.size();
        assertNotEquals(updatedHeaders, defaultHeaders);
    }

    @Then("reset button is clickable and the grid returns to default settings")
    public void reset_button_is_clickable_and_the_grid_returns_to_default_settings() {
        assertTrue(vehicleObj.resetBtn.isEnabled());

    }

    @When("the user clicks on refresh")
    public void the_user_clicks_on_refresh() throws InterruptedException {
        vehicleObj.refreshBtn.click();
        wait.until(ExpectedConditions.attributeToBe(vehicleObj.loadingBar,"style","display: none;"));
        Assert.assertEquals(vehicleObj.loadingBar.getAttribute("style"),("display: none;"));
//        wait.until(ExpectedConditions.attributeToBe(vehicleObj.tableContainer,"class","other-scroll-container loading"));
//        Assert.assertEquals(("other-scroll-container loading"),vehicleObj.tableContainer.getAttribute("class"));

    }
    @Then("refresh button is clickable")
    public void refresh_button_is_clickable() {

        Assert.assertTrue(vehicleObj.refreshBtn.isEnabled()); ;
    }



}
