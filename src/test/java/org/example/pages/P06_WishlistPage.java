package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P06_WishlistPage {
    //method to locate product quantity
    public WebElement quantityLoc(WebDriver driver){
        WebElement quantity= driver.findElement(By.xpath("//tbody/tr[1]/td[6]/input[1]"));
        return quantity;
    }
}
