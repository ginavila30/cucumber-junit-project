package com.cydeo.cukes_runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//Only one purpose-> instructing how and what to run
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"pretty","html:target/cucumber_reports.html","json:target/cucumber-report.json","me.jvt.cucumber.report.PrettyReports:target","rerun:target/rerun.txt"} ,
        features= "src/test/resources/features/vytrack",
        glue = "com/cydeo/step_definitions/vy_track_step_defs",
        tags = "@B26G12-43",
        dryRun = false,
        publish=true
)
public class CukesRunner {

}
