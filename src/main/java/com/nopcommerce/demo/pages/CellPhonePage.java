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

public class CellPhonePage extends Utility {
    @CacheLookup
    @FindBy(xpath="//h1[normalize-space()='Cell phones']")
    WebElement cellPhoneTitleLocator;


    @CacheLookup
    @FindBy(xpath="//a[contains(text(),'List')]")
    WebElement ListViewIcon;



    public String actualPageTitleTextOfCellPhonePage() {
        Reporter.log("Get Text From Page Title of Cell Phone Page" );
        CustomListeners.test.log(Status.PASS,"Get Text From Page Title of Cell Phone Page");
        return getTextFromElement(cellPhoneTitleLocator);
    }

    public void clickOnListViewIcon()  {
        Reporter.log("Clicking on List View Icon" );
        CustomListeners.test.log(Status.PASS,"Clicking on List View Icon");
        clickOnElement(ListViewIcon);

    }
    public void clickOnProductNokiaLumia1020()  {
        Reporter.log("Clicking on Product Nokia Lumia1020" );
        CustomListeners.test.log(Status.PASS,"Clicking on Product Nokia Lumia1020");
        List<WebElement> mobileTitlesList = driver.findElements(By.xpath("//h2[@class='product-title']/a"));
        for (WebElement element : mobileTitlesList) {
            if (element.getText().contains("Nokia")) {
                element.click();
                break;
            }
        }
    }

}
