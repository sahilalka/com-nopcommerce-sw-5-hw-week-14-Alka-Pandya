package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OrderCompletionPage extends Utility {
    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Thank you']")
    WebElement thankYouTitleLocator;

    @CacheLookup
    @FindBy(xpath="//strong[normalize-space()='Your order has been successfully processed!']")
    WebElement successfullMessageLocator;

    @CacheLookup
    @FindBy(css=".button-1.order-completed-continue-button")
    WebElement continueButtonCompletedOrderLocator;





    public String getTextFromThankYouTitle() {
        Reporter.log("Get Text From ThankYou Title" );
        CustomListeners.test.log(Status.PASS,"Get Text From ThankYou Title");
        return getTextFromElement(thankYouTitleLocator);
    }
    public String getTextFromOrderSuccessMessage() {
        Reporter.log("Get Text From Order SuccessMessage" );
        CustomListeners.test.log(Status.PASS,"Get Text From Order SuccessMessage");
        return getTextFromElement(successfullMessageLocator);
    }

    public void clickOnContinueOrderCompletionButton(){
        Reporter.log("Click On Continue Order Completion Button" );
        CustomListeners.test.log(Status.PASS,"Click On Continue Order Completion Button");
        clickOnElement(continueButtonCompletedOrderLocator);
    }



}
