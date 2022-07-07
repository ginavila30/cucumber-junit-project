package com.cydeo.cukes_runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// Runs only our failed test
@RunWith(Cucumber.class)
@CucumberOptions(
features ="@target/rerun.txt",
glue="com/cydeo/step_definitions/ui"
)
public class FailedTestRunner {

}
