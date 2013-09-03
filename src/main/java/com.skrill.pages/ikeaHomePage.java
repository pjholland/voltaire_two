package com.skrill.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class ikeaHomePage extends BasePage {

    By search_for_product = By.id("search");
    By search_button = By.xpath("//*[@id=\"lnkSearchBtnHeader\"]/div[2]/input");
    By search_string = By.className("serpSearchString");
    By image_carousel = By.id("innerContainer");

    public void open() {
        getDriver().get("http://www.ikea.com/gb/en/");
    }

    public void typeInSearch(String searchforproduct){
        WebElement searchforProduct = getDriver().findElement(search_for_product);
        searchforProduct.sendKeys(searchforproduct);
    }

        public void clickSearchButton (){
        WebElement  activatesearch = getDriver().findElement(search_button);
        activatesearch.click();
    }

    public void searchresults (){
        WebElement checksearchResults = getDriver().findElement(search_string);
        checksearchResults.isDisplayed();
    }

}
