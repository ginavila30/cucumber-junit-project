package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {
    @Given("user is on log in page")
    public void user_is_on_log_in_page() {
        System.out.println("User is on login page");
    }
    @When("librarian enter valid  username")
    public void librarian_enter_valid_username() {
        System.out.println("librarian enters valid username");
    }
    @When("librarian enter valid  password")
    public void librarian_enter_valid_password() {
        System.out.println("librarian enters valid password");
    }
    @Then("librarian should login successfully")
    public void librarian_should_login_successfully() {
        System.out.println("librarian logs in successfully");
    }
    @Then("Homepage should be displayed")
    public void homepage_should_be_displayed() {
        System.out.println("Homepage is displayed");
     }


    @When("student enter valid  username")
    public void student_enter_valid_username() {
        System.out.println("student enters valid username");
    }
    @When("student enter valid  password")
    public void student_enter_valid_password() {
        System.out.println("student enters valid password");

    }
    @Then("student should login successfully")
    public void student_should_login_successfully() {
        System.out.println("student logs in successfully");
    }

    @When("admin enter valid  username")
    public void admin_enter_valid_username() {
        System.out.println("admin enters valid username");
    }
    @When("admin enter valid  password")
    public void admin_enter_valid_password() {
        System.out.println("admin enters valid password");
    }
    @Then("admin should login successfully")
    public void admin_should_login_successfully() {
        System.out.println("admin logs in successfully");
    }

}
