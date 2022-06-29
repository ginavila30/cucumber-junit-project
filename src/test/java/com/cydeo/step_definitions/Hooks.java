package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before //before scenario
    public void setup(){
        System.out.println("before scenario is running");
    }

    @After
    public void teardown(){
        System.out.println("after scenario is running");
    }
}
