package com.medstar_health.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Find_A_Doctor_Page {

    @FindBy(xpath = "//input[@placeholder='Doctor name, specialty, or condition']")
    WebElement searchDoctorBySpecialty;
}
