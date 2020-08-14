package com.Nhs.stepDefinitions;


import com.Nhs.utilities.ConfigurationReader;
import com.Nhs.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook {


    @Before
    public void setUp(){
        System.out.println("##### setup! start d#######\n");

        Driver.get().manage().window().maximize();
        Driver.get().get(ConfigurationReader.get("url"));

    }

    @After
    public void tearDown(Scenario scenario){
        //if the scenario fails take the screenshot
        if(scenario.isFailed()){
            System.out.println("Test failed! Check your screenShot");
            byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png");
        }else{
            System.out.println("CleanUp!");
            System.out.println("Test completed! Thumbs Up");
        }
        System.out.println("############## - THE END - ############");

        // After every test we gonna close browser

       //Driver.closeDriver();
    }
}
