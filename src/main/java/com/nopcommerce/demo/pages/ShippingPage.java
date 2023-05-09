package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShippingPage extends Utility {
    @CacheLookup
    @FindBy(css = "#shippingoption_1")
    WebElement nextDayAirRadioLocator;

    @CacheLookup
    @FindBy(css = ".button-1.shipping-method-next-step-button")
    WebElement continueButtonAfterShippingLocator;



    public void shippingMethod(){
        Reporter.log("click on next day air radio  " );
        CustomListeners.test.log(Status.PASS, "click on next day air radio");
        clickOnElement(nextDayAirRadioLocator);
    }

    public void shippingMethodContinueButton(){
        Reporter.log("click on continue button " );
        CustomListeners.test.log(Status.PASS, "click on continue button");
        clickOnElement(continueButtonAfterShippingLocator);


    }




}
