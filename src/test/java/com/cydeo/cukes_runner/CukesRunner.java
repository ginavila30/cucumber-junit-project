package com.cydeo.cukes_runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//Only one purpose-> instructing how and what to run
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"pretty","html:target/cucumber_reports.html"} ,
        features= "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        tags = "@student and @smoke",
        dryRun = false

)
public class CukesRunner {

}
