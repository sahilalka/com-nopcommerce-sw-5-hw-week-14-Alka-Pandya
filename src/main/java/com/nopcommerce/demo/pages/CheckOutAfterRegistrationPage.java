package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckOutAfterRegistrationPage extends Utility {
    @CacheLookup
    @FindBy(xpath="//input[@id='BillingNewAddress_FirstName']")
    WebElement firstNameInputBox;

    @CacheLookup
    @FindBy(xpath="//input[@id='BillingNewAddress_LastName']")
    WebElement lastNameInputBox;

    @CacheLookup
    @FindBy(xpath="//input[@id='BillingNewAddress_Email']")
    WebElement emailInputBox;

    @CacheLookup
    @FindBy(xpath="//select[@id='BillingNewAddress_CountryId']")
    WebElement countryDropDown;

    @CacheLookup
    @FindBy(xpath="//input[@id='BillingNewAddress_City']")
    WebElement cityInputBox;

    @CacheLookup
    @FindBy(xpath="//input[@id='BillingNewAddress_Address1']")
    WebElement address1InputBox;

    @CacheLookup
    @FindBy(xpath="//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement postalCodeInputBox;

    @CacheLookup
    @FindBy(xpath="//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement billingNewAddressPhoneNumber;

    @CacheLookup
    @FindBy(xpath="//button[@onclick='Billing.save()']")
    WebElement buttonContinueFromBillingAddress;

    @CacheLookup
    @FindBy(xpath="//input[@id='shippingoption_1']")
    WebElement radioButtonNextDayAir;

    @CacheLookup
    @FindBy(xpath="//button[@class='button-1 shipping-method-next-step-button']")
    WebElement buttonContinueFromShippingMethod;

    @CacheLookup
    @FindBy(xpath="//input[@id='paymentmethod_1']")
    WebElement radioButtonCreditCard;


    @CacheLookup
    @FindBy(xpath="//button[@class='button-1 payment-method-next-step-button']")
    WebElement buttonContinueFromPaymentMethod;

    @CacheLookup
    @FindBy(xpath="//select[@id='CreditCardType']")
    WebElement dropDownSelectCard;

    @CacheLookup
    @FindBy(xpath="//input[@id='CardholderName']")
    WebElement cardHolderNameInputBox;

    @CacheLookup
    @FindBy(xpath="//input[@id='CardNumber']")
    WebElement cardNumberInputBox;

    @CacheLookup
    @FindBy(xpath="//select[@id='ExpireMonth']")
    WebElement dropDownExpiryDateMonth;

    @CacheLookup
    @FindBy(xpath="//select[@id='ExpireYear']")
    WebElement dropDownExpiryDateYear;

    @CacheLookup
    @FindBy(xpath="//input[@id='CardCode']")
    WebElement cardCodeInputBox;

    @CacheLookup
    @FindBy(xpath="//button[@class='button-1 payment-info-next-step-button']")
    WebElement buttonContinueFromPaymentInformation;

    @CacheLookup
    @FindBy(xpath="//span[contains(text(),'Credit Card')]")
    WebElement actualTextOfCardMethod;

    @CacheLookup
    @FindBy(xpath="//span[normalize-space()='2nd Day Air']")
    WebElement actualTextOfShippingMethod;

    @CacheLookup
    @FindBy(xpath="//span[@class='product-subtotal']")
    WebElement actualTotalFinalPrice;

    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Confirm']")
    WebElement buttonConfirm;


    @CacheLookup
    @FindBy(xpath="(//input[@id='shippingoption_2'])[1]")
    WebElement radioButton2ndDayAir;

    /**
     * List of methods to perform actions using above locators variables
     */

    // Fill the all mandatory field

    public void firstName(String fName) {
        Reporter.log("Enter FirstName " + fName + " to UserName field " + firstNameInputBox.toString());
        CustomListeners.test.log(Status.PASS,"Enter FirstName " + fName);
        clearValue(firstNameInputBox);
        sendTextToElement(firstNameInputBox, fName);
    }

    public void lastName(String lName) {
        Reporter.log("Enter LastName " + lName + " to LastName field " + lastNameInputBox.toString());
        CustomListeners.test.log(Status.PASS,"Enter LastName " + lName);
        clearValue(lastNameInputBox);
        sendTextToElement(lastNameInputBox, lName);
    }

    public void email(String email) {
        Reporter.log("Enter Email " + email + " to email field " + emailInputBox.toString());
        CustomListeners.test.log(Status.PASS,"Enter Email " + email);
        clearValue(emailInputBox);
        sendTextToElement(emailInputBox, email);
    }

    public void selectCountryFromDropDown() {
        Reporter.log("Select Country From DropDown" );
        CustomListeners.test.log(Status.PASS,"Select Country From DropDown");
        selectByIndexFromDropDown(countryDropDown, 2);
    }
    public void enterCity(String cityName){
        Reporter.log("Enter City " + cityName + " to City field " + cityInputBox.toString());
        CustomListeners.test.log(Status.PASS,"Enter City " + cityName);
        sendTextToElement(cityInputBox, cityName);
    }

    public void enterAddress(String address)
    {
        Reporter.log("Enter Address " + address + " to Address field " + address1InputBox.toString());
        CustomListeners.test.log(Status.PASS,"Enter Address " + address);
        sendTextToElement(address1InputBox,address );
    }

    public void enterPostCode(String postcode){
        Reporter.log("Enter PostCode " + postcode + " to PostCode field " + postalCodeInputBox.toString());
        CustomListeners.test.log(Status.PASS,"Enter PostCode " + postcode);
        sendTextToElement(postalCodeInputBox, postcode);
    }

    public void enterPhoneNumber(String phoneNumber){
        Reporter.log("Enter Phone Number " + phoneNumber + " to Phone Number field " + billingNewAddressPhoneNumber.toString());
        CustomListeners.test.log(Status.PASS,"Enter PostCode " + phoneNumber);
        sendTextToElement(billingNewAddressPhoneNumber, phoneNumber);
    }

    public void clickContinue(){
        Reporter.log("Click On Continue" );
        CustomListeners.test.log(Status.PASS,"Click On Continue");
        clickOnElement(buttonContinueFromBillingAddress);
    }


    //Click on Radio Button “Next Day Air($0.00)”
    public void clickOnRadioButtonNextDayAir(){
        Reporter.log("Click On Radio Button Next Day Air" );
        CustomListeners.test.log(Status.PASS,"Click On Radio Button Next Day Air");
        clickOnElement(radioButtonNextDayAir);
    }

    //    2.25 Click on “CONTINUE”
    public void clickOnButtonContinueFromShippingMethod(){
        Reporter.log("Click On Radio Button From Shipping Method" );
        CustomListeners.test.log(Status.PASS,"Click On Radio Button From Shipping Method");
        clickOnElement(buttonContinueFromShippingMethod);
    }

    //    2.26 Select Radio Button “Credit Card”
    public void clickOnRadioButtonCreditCard(){

        Reporter.log("Click On Radio Button Credit Card" );
        CustomListeners.test.log(Status.PASS,"Click On Radio Button Credit Card");
        clickOnElement(radioButtonCreditCard);
    }

    // click on continue button --> button 2
    public void clickOnButtonContinueFromPaymentMethod(){
        Reporter.log("Click On Button Continue From Payment Method" );
        CustomListeners.test.log(Status.PASS,"Click On Button Continue From Payment Method");
        clickOnElement(buttonContinueFromPaymentMethod);
    }

    //    2.27 Select “Master card” From Select credit card dropdown
    public void clickOnDropDownSelectCard(String visa){
        Reporter.log("Click On Drop Down SelectCard " + visa + " to Phone Number field " + dropDownSelectCard.toString());
        CustomListeners.test.log(Status.PASS,"Click On Drop Down SelectCard" + visa);
        selectByValueFromDropDown(dropDownSelectCard, visa);
    }

    //    2.28 Fill all the details
    public void fillInCardHolderNameInputBox(String name){
        Reporter.log("Enter Card Holder Name " + name + " to Card Holder field " + cardHolderNameInputBox.toString());
        CustomListeners.test.log(Status.PASS,"Enter Card Holder Name " + name);
        sendTextToElement(cardHolderNameInputBox, name);
    }

    // fill in card number
    public void fillInCardNumberInputBox(String cardNumber){
        Reporter.log("Fill In Card Number Input Box " + cardNumber + " to Card Number field " + cardNumberInputBox.toString());
        CustomListeners.test.log(Status.PASS,"Enter Card Holder Name " + cardNumber);
        sendTextToElement(cardNumberInputBox, cardNumber);
    }

    // select month
    public void selectDropDownExpiryDateMonth(String month){
        Reporter.log("Select DropDown ExpiryDateMonth " + month + " to Card holder field " + dropDownExpiryDateMonth.toString());
        CustomListeners.test.log(Status.PASS,"Enter Card Holder Name " + month);
        selectByValueFromDropDown(dropDownExpiryDateMonth, month);
    }

    // select year
    public void selectDropDownExpiryDateYear(String year){
        Reporter.log("Select DropDown Expiry Date Year " + year + " to Card holder field " + dropDownExpiryDateYear.toString());
        CustomListeners.test.log(Status.PASS,"Enter Card Holder Name " + year);
        selectByValueFromDropDown(dropDownExpiryDateYear, year);
    }

    // fill in card code
    public void fillInCardCodeInputBox(String cardCode){
        Reporter.log("Fill In CardCode Input Box" + cardCode + " to Card holder field " + cardCodeInputBox.toString());
        CustomListeners.test.log(Status.PASS,"Fill In CardCode Input Box" + cardCode);
        sendTextToElement(cardCodeInputBox, cardCode);
    }

    //    2.29 Click on “CONTINUE” --> button 4
    public void clickOnButtonContinueFromPaymentInformation(){
        Reporter.log("Click On Button Continue From Payment Information" );
        CustomListeners.test.log(Status.PASS,"Click On Button Continue From Payment Information");
        clickOnElement(buttonContinueFromPaymentInformation);
    }

    //    2.30 Verify “Payment Method” is “Credit Card”
    public String verifyActualTextOfCardMethod(){
        Reporter.log("Verify Actual Text Of Card Method" );
        CustomListeners.test.log(Status.PASS,"Verify Actual Text Of Card Method");
        return getTextFromElement(actualTextOfCardMethod);
    }

    //    2.32 Verify “Shipping Method” is “Next Day Air”
    public String verifyActualTextOfShippingMethod(){
        Reporter.log("Verify Actual Text Of Shipping Method" );
        CustomListeners.test.log(Status.PASS,"Verify Actual Text Of Shipping Method");
        return getTextFromElement(actualTextOfShippingMethod);
    }

    //    2.33 Verify Total is “$2,950.00”
    public String verifyActualTotalFinalPrice(){
        Reporter.log("Verify Actual Total Of Final Price" );
        CustomListeners.test.log(Status.PASS,"Verify Actual Total Of Final Price");
        return getTextFromElement(actualTotalFinalPrice);
    }

    //    2.34 Click on “CONFIRM”
    public void clickOnButtonConfirm(){
        Reporter.log("Click On Button Confirm" );
        CustomListeners.test.log(Status.PASS,"click On Button Confirm");

        clickOnElement(buttonConfirm);
    }

    public void clickOnRadioButton2ndDayAir() throws InterruptedException {
        Reporter.log("Click On RadioButton DayAir" );
        CustomListeners.test.log(Status.PASS,"Click On RadioButton DayAir");
        clickOnElement(radioButton2ndDayAir);
        Thread.sleep(1000);
    }


}
