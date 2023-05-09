package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OrderConfirmationPage extends Utility {
    @CacheLookup
    @FindBy(xpath="//li[@class='payment-method']//span[2]")
    WebElement paymentMethodTextLocator;

    @CacheLookup
    @FindBy(xpath="//li[@class='shipping-method']//span[2]")
    WebElement shippingMethodTextLocator;

    @CacheLookup
    @FindBy(xpath="//tr[@class='order-total']/td[@class='cart-total-right']/span")
    WebElement totalPriceLocator;

    @CacheLookup
    @FindBy(css=".button-1.confirm-order-next-step-button")
    WebElement confirmButtonLocator;






    public String getTextFromPaymentMethod() {
        Reporter.log("Get Text From Payment Method" );
        CustomListeners.test.log(Status.PASS,"Get Text From Payment Method");
        return getTextFromElement(paymentMethodTextLocator);
    }

    public String getTextFromShippingMethod()
    {
        Reporter.log("Get Text From Shipping Method" );
        CustomListeners.test.log(Status.PASS,"Get Text From Shipping Method");
        return getTextFromElement(shippingMethodTextLocator);
    }

    public String getTextFromTotalPrice() {
        Reporter.log("Get Text From Total Price" );
        CustomListeners.test.log(Status.PASS,"Get Text From Total Price");
        return getTextFromElement(totalPriceLocator);
    }

    public void clickConfirmButton() {
        Reporter.log("Click On Confirm Button" );
        CustomListeners.test.log(Status.PASS,"Click On Confirm Button");
        clickOnElement(confirmButtonLocator);

    }



}
