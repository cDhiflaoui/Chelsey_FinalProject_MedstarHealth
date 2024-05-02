package com.medstar_health.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locations_Page {
    @FindBy(xpath = "//option[contains(text(),'Neurology and Neurosurgery (17)')]")
    WebElement locationBySpecialty;
}
