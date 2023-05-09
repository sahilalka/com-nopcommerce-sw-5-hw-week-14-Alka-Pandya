package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.Random;

public class RegisterPage extends Utility {
    public static String generatedEmail;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement titleTextOfRegisterPage;

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameInputBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameInputBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailInputBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordInputBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPasswordInputBox;

    @CacheLookup
    @FindBy(css = ".button-1.register-next-step-button")
    WebElement buttonRegister;


    public void fillInFirstName(String fName){
        Reporter.log("Enter first name " + fName + " to username field " + firstNameInputBox.toString());
        CustomListeners.test.log(Status.PASS, "Enter first name " + fName);
        sendTextToElement(firstNameInputBox, fName);
    }

    public void fillInLastName(String lName){
        Reporter.log("Enter last name " + lName + " to username field " + lastNameInputBox.toString());
        CustomListeners.test.log(Status.PASS, "Enter last name " + lName);
        sendTextToElement(lastNameInputBox, lName);
    }

    public void fillInEmail(){
        Random randomPartOfEmailGenerator = new Random(5000);
        int randomNumberInEmail = randomPartOfEmailGenerator.nextInt();
        //random string generator - to use in email
        RandomString randomString = new RandomString(5);
        String randomStringInEmailGenerator = randomString.nextString();
        generatedEmail = "mocky" + randomNumberInEmail + randomStringInEmailGenerator + "mouse@gmail.com";
        Reporter.log("Enter email " + emailInputBox.toString());
        CustomListeners.test.log(Status.PASS, "Enter email " );

        sendTextToElement(emailInputBox, generatedEmail);
    }
    public void fillInPassword(String password){
        Reporter.log("Enter password " + password + " to password field " + passwordInputBox.toString());
        CustomListeners.test.log(Status.PASS, "Enter password " + password);

        sendTextToElement(passwordInputBox, password);
    }

    public void fillInConfirmPassword(String confirmPassword){
        Reporter.log("Enter confirm password " + confirmPassword + " to confirm password field " + confirmPasswordInputBox.toString());
        CustomListeners.test.log(Status.PASS, "Enter confirm password " + confirmPassword);

        sendTextToElement(confirmPasswordInputBox, confirmPassword);
    }

    public void clickOnButtonRegisterNextStep() throws InterruptedException {
        Reporter.log("click on button register next step " );
        CustomListeners.test.log(Status.PASS, "click on button register next step");
        clickOnElement(buttonRegister);
        Thread.sleep(2000);
    }

    public String actualTitleTextOfRegisterPage() {
        Reporter.log("get actual title text of register page");
        CustomListeners.test.log(Status.PASS, "get actual title text of register page");
        return getTextFromElement(titleTextOfRegisterPage);
    }




}
