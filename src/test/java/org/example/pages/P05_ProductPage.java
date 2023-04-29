package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P05_ProductPage {
    //method to locate the sku in the page
    public WebElement SKULoc(WebDriver driver){
        WebElement SKU = driver.findElement(By.cssSelector("div[class=\"sku\"]"));
        return SKU;
    }
}
