package com.cydeo.step_definitions.ui;

import com.cydeo.utilities.Driver;
import io.cucumber.core.gherkin.Step;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.hc.core5.reactor.Command;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before(order = 1) //before scenario
    public void setup(Scenario scenario) {
        System.out.println("before scenario is running");
        System.out.println("Scenario name ->" + scenario.getName());
        // System.out.println("Scenario failed ->"+scenario.isFailed());
    }

    @After
    public void teardown(Scenario scenario) {
        System.out.println("after scenario is running");
        //  System.out.println("Scenario name ->"+scenario.getName());
        //  System.out.println("Scenario failed ->"+scenario.isFailed());
       if(scenario.isFailed()) {
           byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);// casting the driver to take screenshot and storing the screenshot in byte array.
           scenario.attach(screenshot, "image/png", scenario.getName()); // attaching to my scenario teh screenshot and defining, the screenshot, the location/extensionType, and the name which comes from the scenario name.
       }
        Driver.closeDriver();

    }

//    @AfterStep
//    public void afterStep(Scenario scenario) {
//
//        byte[] stepScreenshots= ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);// casting the driver to take screenshot and storing the screenshot in byte array.
//        scenario.attach(stepScreenshots,"image/png",scenario.getName()); // attaching to my scenario teh screenshot and defining, the screenshot, the location/extensionType, and the name which comes from the scenario name.
//
//    }
}
