package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class PaymentPage extends Utility {
    @CacheLookup
    @FindBy(css="#paymentmethod_1")
    WebElement creditCartRadioLocator;

    @CacheLookup
    @FindBy(css=".button-1.payment-method-next-step-button")
    WebElement continueButtonPaymentMethodLocator;

    @CacheLookup
    @FindBy(id="CreditCardType")
    WebElement creditCardDropdownLocator;

    @CacheLookup
    @FindBy(id="CardholderName")
    WebElement cardHolderNameFieldLocator;

    @CacheLookup
    @FindBy(id="CardNumber")
    WebElement cardNumberFieldLocator;

    @CacheLookup
    @FindBy(id="ExpireMonth")
    WebElement expireMonthDropdownLocator;

    @CacheLookup
    @FindBy(id="ExpireYear")
    WebElement expireYearDropdownLocator;
    @CacheLookup
    @FindBy(xpath="//input[@data-val-regex-pattern='^[0-9]{3,4}$']")
    WebElement cardCodeFieldLocator;

    @CacheLookup
    @FindBy(css=".button-1.payment-info-next-step-button")
    WebElement continueButtonAfterCreditCardInfoLocator;



    public void selectCreditCardRadioButton() {
        Reporter.log("Select Credit Card Radio Button" );
        CustomListeners.test.log(Status.PASS,"Select Credit Card Radio Button");
        clickOnElement(creditCartRadioLocator);
    }

    public void continuePaymentButton() {
        Reporter.log("Continue Payment Button" );
        CustomListeners.test.log(Status.PASS,"Continue Payment Button");
        clickOnElement(continueButtonPaymentMethodLocator);
    }

    public void selectCreditCard(int index) {
        Reporter.log("Select Credit Card  " + index + " to Credit Card  field " + creditCardDropdownLocator.toString());
        CustomListeners.test.log(Status.PASS,"Select Credit Card" + index);
        selectByIndexFromDropDown(creditCardDropdownLocator, index);
    }

    public void cardHolderName(String name) {
        Reporter.log("Select card Holder Name  " + name + " to Credit Card  field " + cardHolderNameFieldLocator.toString());
        CustomListeners.test.log(Status.PASS,"Select Card Holder Name" + name);
        sendTextToElement(cardHolderNameFieldLocator, name);
    }

    public void cardNumber(String cardNumber) {
        Reporter.log("Select card Number   " + cardNumber + " to Credit Card  field " + cardNumberFieldLocator.toString());
        CustomListeners.test.log(Status.PASS,"Select Card Number" + cardNumber);
        sendTextToElement(cardNumberFieldLocator, cardNumber);
    }

    public void selectExpiryMonth(int index) {
        Reporter.log("Select Expiry Month " + index + " to Credit Card  field " + expireMonthDropdownLocator.toString());
        CustomListeners.test.log(Status.PASS,"Select Expiry Month" + index);

        selectByIndexFromDropDown(expireMonthDropdownLocator, index);
    }

    public void selectExpiryYear(int index)
    {
        Reporter.log("Select Expiry Year " + index + " to Credit Card  field " + expireYearDropdownLocator.toString());
        CustomListeners.test.log(Status.PASS,"Select Expiry Year" + index);
        selectByIndexFromDropDown(expireYearDropdownLocator, index);
    }

    public void enterCardCode(String cardNumber) {
        Reporter.log("Enter Card Code " + cardNumber + " to Credit Card  field " + cardCodeFieldLocator.toString());
        CustomListeners.test.log(Status.PASS,"Enter Card Code" + cardNumber);
        sendTextToElement(cardCodeFieldLocator, cardNumber);
    }

    public void paymentContinueButton(){
        Reporter.log("Click Payment Continue Button" );
        CustomListeners.test.log(Status.PASS,"Click Payment Continue Button");
        clickOnElement(continueButtonAfterCreditCardInfoLocator);
    }

}
