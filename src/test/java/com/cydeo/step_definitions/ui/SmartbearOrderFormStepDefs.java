package com.cydeo.step_definitions.ui;

import com.cydeo.pages.SmartBearLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SmartbearOrderFormStepDefs {
    SmartBearLoginPage smartbearObj= new SmartBearLoginPage();

    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("smartbear.url"));
        smartbearObj.usernameInput.sendKeys(ConfigurationReader.getProperty("smartbear.username"));
        smartbearObj.passwordInput.sendKeys(ConfigurationReader.getProperty("smartbear.password"));
        smartbearObj.loginBtn.click();
    }
    @When("User clicks on order")
    public void user_clicks_on_order() {
        smartbearObj.orderTab.click();
    }
    @When("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String productName) {
       smartbearObj.selectProduct(productName);
    }
    @When("User enters {string} to quantity")
    public void user_enters_to_quantity(String quantityNum) {
     smartbearObj.quantityInput.sendKeys(quantityNum);
    }
    @When("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String costumerName) {
       smartbearObj.customerName.sendKeys(costumerName);
    }
    @When("User enters {string} to street")
    public void user_enters_to_street(String street) {
        smartbearObj.street.sendKeys(street);
    }
    @When("User enters {string} to city")
    public void user_enters_to_city(String cityName) {
       smartbearObj.city.sendKeys(cityName);
    }
    @When("User enters {string} to state")
    public void user_enters_to_state(String state) {
        smartbearObj.state.sendKeys(state);
    }
    @When("User enters {string} to zipcode")
    public void userEntersToZipcode(String zipcode) {
        smartbearObj.zipcode.sendKeys(zipcode);
    }
    @When("User selects {string} as card type")
    public void user_selects_as_card_type(String cardType) {
      smartbearObj.chooseCreditCard(cardType);
    }
    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String cardNum) {
       smartbearObj.creditCardNumInput.sendKeys(cardNum);
    }
    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String expDate) {
     smartbearObj.expirationDate.sendKeys(expDate);
    }
    @When("User clicks process button")
    public void user_clicks_process_button() {
       smartbearObj.processBtn.click();
    }
    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String customerName) {
       smartbearObj.viewAllOrdersTab.click();
       Assert.assertEquals(customerName,smartbearObj.nameInOrdersList.getText());
    }
}
