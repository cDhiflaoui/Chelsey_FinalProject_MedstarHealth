package com.medstar_health.pages;

import com.medstar_health.utilities.Driver;
import com.medstar_health.utilities.SeleniumUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomePage {
    private static final Logger logger = LogManager.getLogger(HomePage.class);

    /**
     * Constructor to initialize the webdriver and elements on the page
     */
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//img[@src='/-/media/themes/mho/medstar/mho-theme/images/partial-design/header/logo.svg?iar=0&hash=427B5894065C2E75C566D94E5A51CA5F']")
    WebElement logoHomePage;

    @FindBy(xpath = "//a[@data-variantitemid='{83B8F34B-0D5C-47F1-A100-A38804407907}']")
    WebElement findADoctor;


    @FindBy(xpath = "//a[@data-variantitemid='{DB8FA77A-8022-457A-B33E-3813B61D8A0C}']")
    WebElement careersPage;

    @FindBy(xpath = "//a[@data-variantitemid='{A3EFE2D7-2C5F-472C-8F8D-981BC3A3A114}']")
    WebElement healthcareServices;

    @FindBy(xpath = "//a[@data-variantitemid='{1279CAFE-6DCD-4425-B6CC-1BA973E1EA04}']")
    WebElement locationsLink;

    @FindBy(xpath = "//a[@data-variantitemid='{E43AC2DC-6E7E-45F9-8C3F-29864E17891D}']")
    WebElement patientPortal;

    @FindBy(xpath = "//a[@data-variantitemid='{CFB383EB-B1D6-47AE-8758-ABD5A84B7B37}']")
    WebElement researchAndEducation;



    //=======================methods/functions===================================

    /**
     * This method will return the company logo of the homepage logo in the UI
     * @return strings of the company logo
     */
    public String getHomePageCompanyLogo(){
        logger.info("Getting the Home Page Company Logo");
        return logoHomePage.getAttribute("alt");
    }

    public void clickFindADoctorButton(){
        logger.info("Clicking on Find A Doctor Button on Home Page");
        findADoctor.click();
    }



}