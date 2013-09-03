package com.skrill.pages;

import org.openqa.selenium.By;


public class AccountOverview extends BasePage {


    By transactions_list = By.id("last_transactions") ;


    public void transaction_list_is_visible(){
        getDriver().findElement(transactions_list).isDisplayed();

    }
}