package com.skrill.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AddCardsAndBankAccounts extends BasePage {


    By add_bank_account_button = By.linkText("Add Bank Account");
    By cards_and_bank_tab = By.linkText("Cards and Bank Accounts");


    public void click_add_bank_account_button()throws Throwable{
    WebElement CardsAndBankTab = getDriver().findElement(cards_and_bank_tab);
    CardsAndBankTab.click();
    Thread.sleep(1000);
}

    public void user_is_on_the_cards_and_banks_account_page(){
        getDriver().findElement(add_bank_account_button).isDisplayed();
    }
}
