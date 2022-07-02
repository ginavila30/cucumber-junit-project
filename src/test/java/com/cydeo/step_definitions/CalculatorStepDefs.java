package com.cydeo.step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class CalculatorStepDefs {
    int actualResult;
    @Given("Calculator is open")
    public void calculator_is_open() {
        System.out.println("Given calculator is open");
    }
    @When("I add {int} with {int}")
    public void i_add_with(int num1, int num2) {
        System.out.println("Wen I add"+ num1+" and "+num2);
        actualResult= num1+num2;
    }
    @Then("I should get {int}")
    public void i_should_get(int expectedResult) {
        Assert.assertEquals(expectedResult,actualResult);
        System.out.println("Then I should get "+expectedResult);
    }

}
