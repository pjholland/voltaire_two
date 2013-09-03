package com.skrill;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.iphone.IPhoneDriver;
import org.openqa.selenium.safari.SafariDriver;


public class testGetSingleton {

    public enum Browsers {
        Firefox, Chrome, InternetExplorer, Android, Iphone, Safari
    }

    private static WebDriver driver = null;

    String appURL = "https://my-stage.dev.moneybookers.net/login";

    public static WebDriver testGetSingleton(Browsers browser, String appURL) throws Exception {
//        if (driver != null) {   {
//            return driver;

        switch (browser) {        //check our browser
            case Firefox: {
                driver = new FirefoxDriver();
                break;
            }
            case Chrome: {
                driver = new ChromeDriver();
                break;
            }
            case InternetExplorer: {
                driver = new InternetExplorerDriver();
                break;
            }
            case Android: {
                driver = new AndroidDriver();
                break;
            }
            case Iphone: {
                driver = new IPhoneDriver();
                break;
            }
            case Safari: {
                driver = new SafariDriver();
                break;
            }
            //if our browser is not listed, throw an error
            default: {
                throw new Exception();
            }


        }
        //open a new driver instance to our application URL
        driver.get(appURL);


        return driver;
    }


}