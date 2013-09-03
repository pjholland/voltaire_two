package com.skrill;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;


public class MainHooks {

    @After
    public void takeScreenShot(Scenario result) throws IOException {
        result.embed(getScreenShotBytes(), "image/png");

    }

    private byte[] getScreenShotBytes() {
        if(WebDriverSingleton.getInstance() instanceof TakesScreenshot){
            return ((TakesScreenshot) WebDriverSingleton.getInstance()).getScreenshotAs(OutputType.BYTES);
        }
        return new byte[]{};


    }


}
