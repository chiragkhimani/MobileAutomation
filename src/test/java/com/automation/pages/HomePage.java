package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(id = "com.expedia.bookings:id/consentButton")
    WebElement acceptBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Get started']")
    WebElement getStartedBtn;

    @FindBy(xpath = "//android.view.View[@content-desc='Close']")
    WebElement closeBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Let’s go']")
    WebElement letsGoBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Stays']")
    WebElement staysTab;

    @FindBy(xpath = "//android.widget.TextView[@text='Flights']")
    WebElement flightTab;

    public void openApplication() {
        // Below buttons is not always available, how can we handle these button to make sure we click on it if it is appeared
        click(acceptBtn);
        click(getStartedBtn);
        click(closeBtn);
        click(letsGoBtn);
    }

    public boolean isHomePageDisplayed() {
        return staysTab.isDisplayed() && flightTab.isDisplayed();
    }

    public void clickOnFlightTab() {
        flightTab.click();
    }

    public void clickOnStayMenu() {
        staysTab.click();
    }
}
