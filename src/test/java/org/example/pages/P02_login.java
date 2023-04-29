package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P02_login {
    //method to locate login element
    public WebElement loginLoc(WebDriver driver){
        //locate login button to go to login page by css selector
        WebElement login= driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]"));
        return login;
    }

    //method to locate email element
    public WebElement emailLoc(WebDriver driver){
        //locate email element by id
        WebElement email= driver.findElement(By.id("Email"));
        return email;
    }

    //method to locate password element
    public WebElement passwordLoc(WebDriver driver){
        //locate password by name
        WebElement password = driver.findElement(By.name("Password"));
        return password;
    }

    //method to locate login button element
    public WebElement loginButtonLoc(WebDriver driver){
        //locate login button element by XPath
        WebElement loginButton = driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]"));
        return loginButton;
    }

    //method to locate my account element
    public WebElement myAccountLoc(WebDriver driver){
        //locate my account with link text
        WebElement myAccount = driver.findElement(By.linkText("My account"));
        return myAccount;
    }

    //method to locate error message when login with invalid data
    public WebElement errorMsgLoc(WebDriver driver){
        WebElement errorMsg= driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
        return errorMsg;
    }
}
