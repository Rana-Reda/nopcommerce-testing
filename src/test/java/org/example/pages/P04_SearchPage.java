package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P04_SearchPage {
    //method to locate search results
    public List<WebElement> searchResults(WebDriver driver){
        List<WebElement> results= driver.findElements(By.cssSelector("h2[class=\"product-title\"]"));
        return results;
    }

    //method to locate resulted product
    public WebElement resultedProductLoc(WebDriver driver){
        WebElement resultedProduct= driver.findElement(By.cssSelector("div[class=\"product-item\"]"));
        return resultedProduct;
    }

}
