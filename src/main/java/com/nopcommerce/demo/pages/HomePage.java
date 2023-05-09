package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath="//h2[normalize-space()='Welcome to our store']")
    WebElement welcomeToStoreLocator;

    @CacheLookup
    @FindBy(linkText="Electronics")
    WebElement electronicMenuLocator;

    @CacheLookup
    @FindBy(linkText="Cell phones")
    WebElement cellPhonesSubMenuLocator;



    public void selectMenu(String menu) {
        Reporter.log("Select Menu" );
        CustomListeners.test.log(Status.PASS,"Select Menu");
        List<WebElement> listOfMenuElements = driver.findElements(By.xpath("//div[@class='header-menu']/ul[@class='top-menu notmobile']/li/a"));
        for (WebElement element : listOfMenuElements) {
            System.out.println(element.getText());

            if (element.getText().trim().equalsIgnoreCase(menu)) {
                element.click();
                break;
            }
        }
    }


    public String getTextFromWelcomeStore()
    {
        Reporter.log("Get Text From Welcome Store" );
        CustomListeners.test.log(Status.PASS,"Get Text From Welcome Store");
        return getTextFromElement(welcomeToStoreLocator);
    }

    public void mouseHoverOnElectronics() {
        Reporter.log("Mouse Hover On Electronics");
        CustomListeners.test.log(Status.PASS,"Mouse Hover On Electronics");
        mouseHoverToElement(electronicMenuLocator);
    }

    public void mouseHoverAndClickOnCellPhone() {
        Reporter.log("Mouse Hover And Click OnCell Phone" );
        CustomListeners.test.log(Status.PASS,"Mouse Hover And Click OnCell Phone");
        mouseHoverToElementAndClick(cellPhonesSubMenuLocator);
    }
}
