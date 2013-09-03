package com.skrill.step_definiitons;

import com.skrill.pages.BasePage;
import com.skrill.pages.AddCardsAndBankAccounts;
import com.skrill.pages.Settings;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AddCardsAndBankAccountsStep extends BasePage {

    private AddCardsAndBankAccounts addcardsandbankaccounts;
    private Settings settings_page;


    @When("^I click on \"([^\"]*)\" tab$")
    public void I_click_on_tab(String page_type) throws Throwable {
        if (page_type == "Cards and Bank Accounts")
            addcardsandbankaccounts = new AddCardsAndBankAccounts();
        addcardsandbankaccounts.click_add_bank_account_button();
        Thread.sleep(2000);
        if (page_type == "Settings")
            settings_page = new Settings();
        settings_page.click_settings_tab();
        Thread.sleep(2000);

    }

    @Then("^I should see the Cards and Bank Accounts page$")
    public void I_should_see_the_Cards_and_Bank_Accounts_page() {

    }
}
