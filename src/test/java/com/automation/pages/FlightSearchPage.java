package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Scanner;

public class FlightSearchPage extends SearchPage{

    @FindBy(xpath = "//android.widget.TextView[@text='Flying from']")
    WebElement flyingFromField;

    @FindBy(xpath = "//android.widget.TextView[@text='Flying to']")
    WebElement flyingToField;

    @FindBy(xpath = "//android.widget.TextView[@text='Travellers']")
    WebElement travellersField;

    @FindBy(xpath = "//android.widget.TextView[@text='Preferred class']")
    WebElement preferredClassField;

    @FindBy(id = "com.expedia.bookings:id/parentPanel")
    WebElement sameLocationErrorPopUp;

    @FindBy(id = "android:id/message")
    WebElement sameLocationErrorMsg;

    @FindBy(id = "android:id/button1")
    WebElement sameLocationErrorDoneBtn;


    public boolean isFlightSearchPageDisplayed() {
        return flyingFromField.isDisplayed() && flyingToField.isDisplayed();
    }

    public void enterSourceLocation(String source) {
        flyingFromField.click();
        searchBox.sendKeys(source);
        searchResultList.get(0).click();
    }



    public boolean isSameLocationErrorIsDisplayed() {
        return sameLocationErrorPopUp.isDisplayed();
    }

    public String getSameLocationErrorMessage() {
        return sameLocationErrorMsg.getText();
    }

    public void clickOnDoneButtonOnInvalidSearchErrorPopup() {
        sameLocationErrorDoneBtn.click();
    }
}
