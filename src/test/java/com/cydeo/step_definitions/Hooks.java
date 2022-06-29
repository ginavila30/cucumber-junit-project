package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    @Before //before scenario
    public void setup(Scenario scenario){
        System.out.println("before scenario is running");
        System.out.println("Scenario name ->"+scenario.getName());
        System.out.println("Scenario failed ->"+scenario.isFailed());
    }

    @After
    public void teardown(Scenario scenario){
        System.out.println("after scenario is running");
        System.out.println("Scenario name ->"+scenario.getName());
        System.out.println("Scenario failed ->"+scenario.isFailed());

    }
}
