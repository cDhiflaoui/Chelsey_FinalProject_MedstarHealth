package com.medstar_health.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Healthcare_Services_Page {

    @FindBy(xpath = "//a[contains(text(),'Electroencephalogram (EEG) CTS Test')]")
    WebElement eegTest;
}
