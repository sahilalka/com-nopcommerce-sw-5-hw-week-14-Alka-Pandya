package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class NokiaLumia1020Page extends Utility {
    @CacheLookup
    @FindBy(xpath="//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement TitleTextOfProductNokiaLumia1020Page;

    @CacheLookup
    @FindBy(xpath="//span[@id='price-value-20']")
    WebElement PriceOfProductNokiaLumia1020;

    @CacheLookup
    @FindBy(xpath="(//input[@id='product_enteredQuantity_20'])[1]")
    WebElement QtyProductNokiaLumia1020;

    @CacheLookup
    @FindBy(xpath="(//button[@id='add-to-cart-button-20'])[1]")
    WebElement ButtonAddToCartFromPageNokiaLumia1020;

    @CacheLookup
    @FindBy(xpath="//p[@class='content']")
    WebElement MessageOfProductBeingInShoppingCart;

    @CacheLookup
    @FindBy(xpath="//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement CrossFromMessage;

    @CacheLookup
    @FindBy(xpath="//span[contains(text(),'Shopping cart')]")
    WebElement ShoppingCartLinkFromNokiaLumia1020Page;



    public String actualTitleTextOfProductNokiaLumia1020Page() {
        Reporter.log("Actual Title Text Of Product NokiaLumia1020Page" );
        CustomListeners.test.log(Status.PASS,"Actual Title Text Of Product NokiaLumia1020Page");
        return getTextFromElement(TitleTextOfProductNokiaLumia1020Page);
    }

    public String actualPriceOfProductNokiaLumia1020() {
        Reporter.log("Actual Price  Of Product NokiaLumia1020" );
        CustomListeners.test.log(Status.PASS,"Actual Price  Of Product NokiaLumia1020");
        return getTextFromElement(PriceOfProductNokiaLumia1020);
    }

    public void clearAnElementBeforeEnteringQty() {
        Reporter.log("Clear An Element Before Entering Qty" );
        CustomListeners.test.log(Status.PASS,"Clear An Element Before Entering Qty");
        clearValue(QtyProductNokiaLumia1020);
    }

    public void updateTheQuantity(String qty) {
        Reporter.log("Update the Quantity  " + qty + "to Quantity Field" + QtyProductNokiaLumia1020.toString());
        CustomListeners.test.log(Status.PASS,"Update the Quantity " + qty);
        sendTextToElement(QtyProductNokiaLumia1020, qty);
    }

    public void clickOnButtonAddToCartFromPageNokiaLumia1020() throws InterruptedException {
        Reporter.log("Click On Button Add To Cart From Page NokiaLumia1020" );
        CustomListeners.test.log(Status.PASS,"Click On Button Add To Cart From Page NokiaLumia1020");
        clickOnElement(ButtonAddToCartFromPageNokiaLumia1020);
        Thread.sleep(1000);
    }

    public String actualMessageOfProductBeingInShoppingCart() throws InterruptedException {
        Reporter.log("Actual Message Of Product Being In Shopping Cart" );
        CustomListeners.test.log(Status.PASS,"Actual Message Of Product Being In Shopping Cart");
        return getTextFromElement(MessageOfProductBeingInShoppingCart);
    }

    public void clickOnCrossFromMessage() throws InterruptedException {
        Reporter.log("Click On Cross From Message" );
        CustomListeners.test.log(Status.PASS,"Click On Cross From Message");
        clickOnElement(CrossFromMessage);
        Thread.sleep(1000);
    }

    public void hoverToShoppingCartAndClickOnAddToCart() throws InterruptedException {
        Reporter.log("Hover To Shopping Cart And Click On Add To Cart" );
        CustomListeners.test.log(Status.PASS,"Hover To Shopping Cart And Click On Add To Cart");
        mouseHoverToElementAndClick(ShoppingCartLinkFromNokiaLumia1020Page);
        Thread.sleep(2000);
    }



}
