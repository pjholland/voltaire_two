package com.skrill.step_definiitons;

import com.skrill.pages.Settings;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class SettingsStep {

    private Settings settings_page;

    @Given("^I click on the Settings tab$")
    public void I_click_on_the_Settings_tab() throws Throwable {
        settings_page = new Settings();
        settings_page.click_settings_tab();
        Thread.sleep(2000);

    }

    @Then("^I should see my settings$")
    public void I_should_see_my_settings() throws Throwable {
        settings_page.view_user_settings();

    }



}