package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckOutPage extends Utility {
    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeSignInPageTitleLocator;

    @CacheLookup
    @FindBy(css=".button-1.checkout-as-guest-button")
    WebElement checkoutAsGuestButtonLocator;

    @CacheLookup
    @FindBy(css="#BillingNewAddress_FirstName")
    WebElement firstNameFieldLocator;

    @CacheLookup
    @FindBy(css="#BillingNewAddress_LastName")
    WebElement lastNameFieldLocator;


    @CacheLookup
    @FindBy(css="#BillingNewAddress_Email")
    WebElement emailFieldLocator;

    @CacheLookup
    @FindBy(css="#BillingNewAddress_CountryId")
    WebElement countryDropDownLocator;

    @CacheLookup
    @FindBy(css="#BillingNewAddress_City")
    WebElement cityFieldLocator;

    @CacheLookup
    @FindBy(css="#BillingNewAddress_Address1")
    WebElement addressFieldLocator;

    @CacheLookup
    @FindBy(css="#BillingNewAddress_ZipPostalCode")
    WebElement postCodeFieldLocator;

    @CacheLookup
    @FindBy(css="#BillingNewAddress_PhoneNumber")
    WebElement phoneNumberFieldLocator;

    @CacheLookup
    @FindBy(name="save")
    WebElement continueButtonLocator;

    @CacheLookup
    @FindBy(linkText="Register")
    WebElement ButtonRegister;

    //By ButtonRegister = By.cssSelector(".button-1.register-button");


    public String getTextFromWelcomeText() {
        Reporter.log("Get Text From Welcome Text" );
        CustomListeners.test.log(Status.PASS,"Get Text From Welcome Text");
        return getTextFromElement(welcomeSignInPageTitleLocator);
    }

    public void clickCheckOut() {
        Reporter.log("Click Check Out" );
        CustomListeners.test.log(Status.PASS,"Click Check Out");
        clickOnElement(checkoutAsGuestButtonLocator);
    }

    public void firstName(String fName) {
        Reporter.log("Enter First Name " + fName + " to First Name field " + firstNameFieldLocator.toString());
        CustomListeners.test.log(Status.PASS,"Enter First Name " + fName);
        sendTextToElement(firstNameFieldLocator, fName);
    }

    public void lastName(String lName) {
        Reporter.log("Enter Last Name " + lName + " to Last Name field " + lastNameFieldLocator.toString());
        CustomListeners.test.log(Status.PASS,"Enter Last Name " + lName);
        sendTextToElement(lastNameFieldLocator, lName);
    }

    public void email(String email) {
        Reporter.log("Enter email  " + email + " to Email  field " + emailFieldLocator.toString());
        CustomListeners.test.log(Status.PASS,"Enter email  " + email);
        sendTextToElement(emailFieldLocator, email);
    }

    public void selectCountryFromDropDown() {
        Reporter.log("Select Country From DropDown" );
        CustomListeners.test.log(Status.PASS,"Select Country From DropDown");
        selectByIndexFromDropDown(countryDropDownLocator, 2);

    }
    public void enterCity(String cityName){
        Reporter.log("Enter City Name " + cityName + " to City Name field " + cityFieldLocator.toString());
        CustomListeners.test.log(Status.PASS,"Enter City Name " + cityName);
        sendTextToElement(cityFieldLocator, cityName);
    }

    public void enterAddress(String address){
        Reporter.log("Enter Address " + address + " to Address field " + addressFieldLocator.toString());
        CustomListeners.test.log(Status.PASS,"Enter Address " + address);

        sendTextToElement(addressFieldLocator,address );
    }

    public void enterPostCode(String postcode){
        Reporter.log("Enter Post Code " + postcode + " to Post Code field " + postCodeFieldLocator.toString());
        CustomListeners.test.log(Status.PASS,"Enter Post Code " + postcode);
        sendTextToElement(postCodeFieldLocator, postcode);
    }

    public void enterPhoneNumber(String phoneNumber){
        Reporter.log("Enter Phone Number " + phoneNumber + " to Phone Number field " + phoneNumberFieldLocator.toString());
        CustomListeners.test.log(Status.PASS,"Enter Phone Number " + phoneNumber);
        sendTextToElement(phoneNumberFieldLocator, phoneNumber);
    }

    public void clickContinue(){
        Reporter.log("Click on Continue" );
        CustomListeners.test.log(Status.PASS,"Click on Continue");
        clickOnElement(continueButtonLocator);
    }

    public void clickOnButtonRegister() throws InterruptedException {
        Reporter.log("Click On Button Register" );
        CustomListeners.test.log(Status.PASS,"Click On Button Register");
        clickOnElement(ButtonRegister);
        Thread.sleep(1000);
    }


}
