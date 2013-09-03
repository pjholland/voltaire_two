package com.skrill.step_definiitons;

import com.skrill.pages.BasePage;
import com.skrill.pages.ikeaHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.Assert.assertTrue;

public class ikeaHomePageStep extends BasePage{

    private ikeaHomePage ikeahomepage;


    @Given("^i am on the ikea homepage$")
    public void i_am_on_the_ikea_homepage() throws Throwable {
        ikeahomepage = new ikeaHomePage();
        ikeahomepage.open();

    }

    @Given("^I search for \"([^\"]*)\"$")
    public void I_search_for(String product) throws Throwable {
        ikeahomepage.typeInSearch(product);
        Thread.sleep(1000);
        ikeahomepage.clickSearchButton();

    }

    @Then("^i should see results related to \"([^\"]*)\"$")
    public void i_should_see_results_related_to(String result) throws Throwable {
        assertTrue(getDriver().getPageSource().contains(result));

    }

    @When("^i look at the image carousel$")
    public void i_look_at_the_image_carousel() throws Throwable {
        ikeahomepage.checkElementDisplayed(Locators.id, "innerContainer");

    }

    @Then("^I should see the main image first$")
    public void it_should_contain_four_images() throws Throwable {
        ikeahomepage.checkElementDisplayed(Locators.id, "201342_hpip01a_02");

    }

    @Then("^i should see text$")
    public void i_should_see_text() throws Throwable {
        ikeahomepage.checkTextPresentOnPage("themoon");

    }

}
