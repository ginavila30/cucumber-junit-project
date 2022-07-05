package com.cydeo.step_definitions.ui;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatingCucumber {
    @Given("{word} is hungry")
    public void somebody_is_hungry(String name) {
        System.out.println("It is from Given "+name);
    }
    @When("he eats {int} cucumbers")
    public void he_eats_some_cucumbers(int num) {
        System.out.println("It is from When "+num);
    }
    @Then("he will be full")
    public void he_will_be_full() {
        System.out.println("It is from Then");
    }
}
