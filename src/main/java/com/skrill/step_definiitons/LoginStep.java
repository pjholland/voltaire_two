package com.skrill.step_definiitons;

import com.skrill.pages.BasePage;
import com.skrill.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class LoginStep extends BasePage {

    protected String ref_mail = "martinkl.ref.rev001@sun-fish.com";
    protected String ref_pass = "martinkl.ref.rev001";
    private LoginPage loginpage;

    @Given("^I am on the skrill login page$")
    public void I_am_on_the_skrill_login_page() throws Throwable {
        loginpage = new LoginPage();
        loginpage.open();
        Thread.sleep(1000);

    }

    @And("^I enter my credentials$")
    public void I_enter_my_credentials() throws Throwable {
        // loginpage.type_username("auto_customer_pmhmajklqu@sun-fish.com");
        // loginpage.type_password("auto_customer_pmhmajklqu@sun-fish.com123");
        loginpage.type_username("auto_customer_gbr_torbdklsaa@sun-fish.com");
        loginpage.type_password("auto_customer_gbr_torbdklsaa@sun-fish.com123");
        Thread.sleep(2000);

    }

    @When("^I click the submit button$")
    public void I_click_the_submit_buton() throws Throwable {
        loginpage.submit_details();
        Thread.sleep(2000);

    }

    @When("^the user logs out$")
    public void the_user_logs_out() throws Throwable {
        loginpage.logout();
        Thread.sleep(2000);

    }

    @When("^I log in as as a \"([^\"]*)\"$")
    public void I_log_in_as_as_a(String user_type) throws Throwable {
        if (user_type == "referral user")
            Thread.sleep(1000);
        loginpage.log_in_as_referrer();
        Thread.sleep(1000);

    }


}

