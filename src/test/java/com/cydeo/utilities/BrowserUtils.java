package com.cydeo.utilities;

import org.junit.Assert;


import java.util.Set;

/*TC : Create utility method

1. Create a new class called BrowserUtils
2. Create a method to make Multiple Windows logic re-usable
3. When method is called, it should switch window and verify
title.

Method info:
• Name: switchWindowAndVerify
• Return type: void
• Arg1: WebDriver
• Arg2: String expectedInUrl
• Arg3: String expectedTitle
  */
public class BrowserUtils {
//Verification of a page title
    public static void verifyTitle(String expectedTitle){
        Assert.assertTrue(" Title verification failed",Driver.getDriver().getTitle().contains(expectedTitle));
    }
//Switching to an specific window and verifying title and url is the expected one
    public static void switchWindowAndVerify(String expectedUrl,String expectedTitle){
        Set<String> windows=Driver.getDriver().getWindowHandles();
        for (String each:windows) {
            if(Driver.getDriver().switchTo().window(each).getCurrentUrl().contains(expectedUrl)){
                break;
            }
        }
        Assert.assertTrue(expectedTitle+" Title verification failed",Driver.getDriver().getTitle().contains(expectedTitle));
        Assert.assertTrue(expectedUrl+" Url verification failed",Driver.getDriver().getCurrentUrl().contains(expectedUrl));
    }
}
