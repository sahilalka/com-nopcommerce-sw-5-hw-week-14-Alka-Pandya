package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegistrationSuccessfulPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement messageOfSuccessfulRegistration;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement buttonContinue;


    public String actualMessageOfSuccessfulRegistration(){
        Reporter.log("Get text successful registration");
        CustomListeners.test.log(Status.PASS, "Get text successful registration");
        return getTextFromElement(messageOfSuccessfulRegistration);
    }

    public void clickOnButtonContinue() throws InterruptedException {
        Reporter.log("click on continue button " );
        CustomListeners.test.log(Status.PASS, "click on continue button");
        clickOnElement(buttonContinue);
        Thread.sleep(2000);
    }


}
