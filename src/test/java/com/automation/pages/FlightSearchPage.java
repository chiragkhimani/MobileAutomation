package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightSearchPage extends BasePage{

    @FindBy(xpath = "//android.widget.TextView[@text='Flying from']")
    WebElement flyingFromField;

    @FindBy(xpath = "//android.widget.TextView[@text='Flying to']")
    WebElement flyingToField;

    @FindBy(xpath = "//android.widget.TextView[@text='Select dates']")
    WebElement dateField;

    @FindBy(xpath = "//android.widget.TextView[@text='Travellers']")
    WebElement travellersField;

    @FindBy(xpath = "//android.widget.TextView[@text='Preferred class']")
    WebElement preferredClassField;

    @FindBy(id="com.expedia.bookings:id/search_btn")
    WebElement searchBtn;

    @FindBy(id="com.expedia.bookings:id/search_src_text")
    WebElement searchBox;

    public boolean isFlightSearchPageDisplayed() {
        return flyingFromField.isDisplayed() && flyingToField.isDisplayed();
    }
}
