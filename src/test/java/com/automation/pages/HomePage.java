package com.automation.pages;

import com.automation.utils.DriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(DriverUtils.getDriver(), this);
    }

    @FindBy(id="com.expedia.bookings:id/consentButton")
    WebElement acceptBtn;

    @FindBy(xpath="//android.widget.TextView[@text='Get started']")
    WebElement getStartedBtn;

    @FindBy(xpath="//android.view.View[@content-desc='Close']")
    WebElement closeBtn;

    @FindBy(xpath="//android.widget.TextView[@text='Let’s go']")
    WebElement letsGoBtn;

    public void openApplication() {
        // Below buttons is not always available, how can we handle these button to make sure we click on it if it is appeared
        acceptBtn.click();
        getStartedBtn.click();
        closeBtn.click();
        letsGoBtn.click();
    }
}
