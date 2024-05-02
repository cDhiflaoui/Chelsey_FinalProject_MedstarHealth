package com.medstar_health.stepdefinitions;

import com.medstar_health.pages.HomePage;
import com.medstar_health.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class VerifyLogoDisplayHomePage {
    HomePage homePage= new HomePage();

    @Given("User is navigated successfully to Medstar Health Home Page")
    public void user_is_navigated_successfully_to_medstar_health_home_page() {
        Driver.getDriver().get("https://www.medstarhealth.org/");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    @Then("User is able to see the company logo on Home Page")
    public void user_is_able_to_see_the_company_logo() {
        Assert.assertEquals("Medstar Health Home",homePage.getHomePageCompanyLogo());
    }


}
