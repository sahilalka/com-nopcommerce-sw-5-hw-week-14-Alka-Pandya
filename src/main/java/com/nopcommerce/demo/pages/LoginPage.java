package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement logInLink;

    @CacheLookup
    @FindBy(css = "#Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(css = "#Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(css = ".button-1.login-button")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "(//input[@id='termsofservice'])[1]")
    WebElement termsOfServiceCheckBoxLocator;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkoutButtonLocator;



    public void loginLink() {
        Reporter.log("Click On Login Link");
        CustomListeners.test.log(Status.PASS, "Click On Login Link");
        clickOnElement(logInLink);
    }

    public void emailField(String email) {
        Reporter.log("Enter email  " + email + " to Email  field " + emailField.toString());
        CustomListeners.test.log(Status.PASS, "Enter email  " + email);
        sendTextToElement(emailField, email);
    }

    public void passwordField(String password) throws InterruptedException {
        Reporter.log("Enter Password  " + password + " to Password  field " + passwordField.toString());
        CustomListeners.test.log(Status.PASS, "Enter Password  " + password);
        Thread.sleep(2000);
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        Reporter.log("Click On Login Button");
        CustomListeners.test.log(Status.PASS, "Click On Login Button");
        clickOnElement(loginButton);
    }

    public void checkBoxClick() {
        Reporter.log("click on check box ");
        CustomListeners.test.log(Status.PASS, "click on check box");
        clickOnElement(termsOfServiceCheckBoxLocator);
    }

    public void clickCheckOut() {
        Reporter.log("click on check out ");
        CustomListeners.test.log(Status.PASS, "click on check out");
        clickOnElement(checkoutButtonLocator);
    }



}
