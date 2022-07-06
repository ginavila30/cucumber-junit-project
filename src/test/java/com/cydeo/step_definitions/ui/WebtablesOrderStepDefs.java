package com.cydeo.step_definitions.ui;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.CydeoWebTablesAppLoginPage;
import com.cydeo.pages.WebtablesOrderPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebtablesOrderStepDefs {
    CydeoWebTablesAppLoginPage webTableLoginPage = new CydeoWebTablesAppLoginPage();
    WebtablesOrderPage webtableOrderPage = new WebtablesOrderPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get("cydeo.tables.page");
        webTableLoginPage.login(ConfigurationReader.getProperty("tables.app.username"), ConfigurationReader.getProperty("tables.app.username.password"));
        webtableOrderPage.order.click();
    }

    @When("user selects product type {string}")
    public void user_selects_product_type(String productType) {
       Select select = new Select(webtableOrderPage.product);
       select.selectByValue(productType);
    }

    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer quantity) {
       webtableOrderPage.quantityInput.clear();
       webtableOrderPage.quantityInput.sendKeys(String.valueOf(quantity));
    }

    @When("user enters customer name {string}")
    public void user_enters_customer_name(String customerName) {
       webtableOrderPage.nameInput.sendKeys(customerName);
    }

    @When("user enters street {string}")
    public void user_enters_street(String street) {
        webtableOrderPage.streetInput.sendKeys(street);
    }

    @When("user enters city {string}")
    public void user_enters_city(String city) {
        webtableOrderPage.cityInput.sendKeys(city);
    }

    @When("user enters state {string}")
    public void user_enters_state(String state) {
        webtableOrderPage.stateInput.sendKeys(state);
    }

    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String zipcode) {
        webtableOrderPage.zipInput.sendKeys(zipcode);
    }

    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String cardType) {
        for (WebElement each : webtableOrderPage.cardType) {
            if(each.getText().equalsIgnoreCase(cardType)){
                each.click();
                break;
            }
        }

      
    }

    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user enters process order button")
    public void user_enters_process_order_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
