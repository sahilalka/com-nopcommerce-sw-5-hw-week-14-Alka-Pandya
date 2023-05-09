package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Shopping cart']")
    WebElement shoppingCartTitleLocator;

    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement qtyFieldLocator;

    @CacheLookup
    @FindBy(css = ".cart-label")
    WebElement shoppingCartLocator;

    @CacheLookup
    @FindBy(css = ".button-1.cart-button")
    WebElement goToCartButtonLocator;

    @CacheLookup
    @FindBy(xpath = "//tr[@class='order-total']//td[@class='cart-total-right']/span")
    WebElement totalPriceLocator;

    @CacheLookup
    @FindBy(xpath ="(//input[@id='termsofservice'])[1]")
    WebElement termsOfServiceCheckBoxLocator;

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkoutButtonLocator;

    @CacheLookup
    @FindBy(css = "#updatecart")
    WebElement updateShoppingCartButtonLocator;
    @CacheLookup
    @FindBy(xpath= "//h1[normalize-space()='Shopping cart']")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(className = "qty-input")
    WebElement qtyField1Locator;


    public String getTextFromShoppingCart() {
        Reporter.log("Get text from shopping cart");
        CustomListeners.test.log(Status.PASS, "Get text from shopping cart");
        return getTextFromElement(shoppingCartTitleLocator);
    }

    public void mouseHoverOnShoppingCart() {
        Reporter.log("Mouse hover on shopping cart");
        CustomListeners.test.log(Status.PASS, "Mouse hover on shopping cart");
        mouseHoverToElement(shoppingCartLocator);
    }

    public void clickOnGoToCart() {
        Reporter.log("click On go to cart " );
        CustomListeners.test.log(Status.PASS, "click On go to cart");
        clickOnElement(goToCartButtonLocator);
    }

    public void updateTheQuantity(String qty) {
        Reporter.log("Update the quantity " + qty + " to quantity field " + qtyFieldLocator.toString());
        CustomListeners.test.log(Status.PASS, "Update the quantity " + qty);
        sendTextToElement(qtyFieldLocator, qty);
    }

    public void clickUpdateCartButton() {
        Reporter.log("click On update cart button " );
        CustomListeners.test.log(Status.PASS, "click On update cart button");
        clickOnElement(updateShoppingCartButtonLocator);
    }

    public void clearAnElementFromUpdatedShoppingCart() {
        Reporter.log("clear an element from updated shopping cart " );
        CustomListeners.test.log(Status.PASS, "clear an element from updated shopping cart");
//        WebElement element = driver.findElement(qtyFieldLocator);
//        element.clear();
        clearValue(qtyFieldLocator);
    }

    public String getTextFromTotal() {
        Reporter.log("Get text from total");
        CustomListeners.test.log(Status.PASS, "Get text from total");
        return getTextFromElement(totalPriceLocator);

    }

    public void checkBoxClick() {
        Reporter.log("click on check box " );
        CustomListeners.test.log(Status.PASS, "click on check box");
        clickOnElement(termsOfServiceCheckBoxLocator);
    }

    public void clickCheckOut() {
        Reporter.log("click on check out " );
        CustomListeners.test.log(Status.PASS, "click on check out");
        clickOnElement(checkoutButtonLocator);
    }
    public String verifyTextShoppingCart(){
        Reporter.log("verifyTextShoppingCart" );
        CustomListeners.test.log(Status.PASS, "verifyTextShoppingCart");
        return getTextFromElement( shoppingCartText);
    }


    public String verifyQuantity() {
        Reporter.log("verifyQuantity " );
        CustomListeners.test.log(Status.PASS, "verifyQuantity");
        return driver.findElement(By.className("qty-input")).getAttribute("value");

    }


}
