package com.skrill;

import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(
        features = {"src/test/resources"},
        format = {"pretty", "html:target/reports/cucumber/html", "json:target/cucumber.json", "usage:target/usage.jsonx", "junit:target/junit.xml"},
        // Run every thing but ignore @wip and @fail
        // tags = {"@ikea,@skrill","~@wip","~@fail"}, strict = true)
        tags = {"@in-progress"}, strict = true)


public class RunCukesTest {

    @AfterClass
    public static void tearDown() {
        WebDriverSingleton.getInstance().quit();
    }

}
