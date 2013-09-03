package com.skrill.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Settings extends BasePage {

    By settings_tab = By.linkText("Settings");
    By user_settings_display_box = By.id("user_settings_container");


    public void click_settings_tab ()throws Throwable{
        WebElement Settings_Tab = getDriver().findElement(settings_tab);
        Settings_Tab.click();
        Thread.sleep(1000);
    }

    public void view_user_settings ()throws Throwable{
        getDriver().findElement(user_settings_display_box).isDisplayed();

    }

}
