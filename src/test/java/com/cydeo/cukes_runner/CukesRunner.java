package com.cydeo.cukes_runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       // plugin ="html:target/cucumber_reports.html" ,
        features= "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        tags = "@Regression and not @Student",
        dryRun = false

)
public class CukesRunner {

}
