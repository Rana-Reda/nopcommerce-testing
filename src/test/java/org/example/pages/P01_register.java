package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P01_register {
    //method to locate register button to go to register page
    public WebElement registerLoc(WebDriver driver){
        //locate register button element using css selector
        WebElement regLoc = driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]"));
        return regLoc;
    }

    //method to locate gender button
    public WebElement genderLoc(WebDriver driver){
        //locate gender (female) by id
        WebElement gender =driver.findElement(By.id("gender-female"));
        return gender;
    }

    //method to locate firstname element using
    public WebElement FNameLoc(WebDriver driver){
        //locate firstname element by id
        WebElement FName = driver.findElement(By.id("FirstName"));
        return FName;
    }

    //method to locate lastname element using
    public WebElement LNameLoc(WebDriver driver){
        //locate lastname element by name
        WebElement LName = driver.findElement(By.name("LastName"));
        return LName;
    }

    //method to locate day element
    public WebElement dayLoc(WebDriver driver){
        //locate day element by css selector
        WebElement day= driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]"));
        return day;
    }

    //method to locate month element
    public WebElement monthLoc(WebDriver driver){
        //locate month element by name
        WebElement month= driver.findElement(By.name("DateOfBirthMonth"));
        return month;
    }

    //method to locate year element
    public WebElement yearLoc(WebDriver driver){
        //locate year element by name
        WebElement year= driver.findElement(By.name("DateOfBirthYear"));
        return year;
    }

    //method to locate email element
    public WebElement emailLoc(WebDriver driver){
        //locate email element by id
        WebElement email = driver.findElement(By.id("Email"));
        return email;
    }

    //method to locate password element
    public WebElement passwordLoc(WebDriver driver){
        //locate password element by id
        WebElement password= driver.findElement(By.id("Password"));
        return password;
    }

    //method to locate confirm Password element
    public WebElement ConPasswordLoc(WebDriver driver){
        //locate confirm Password element by id
        WebElement confirmP= driver.findElement(By.id("ConfirmPassword"));
        return confirmP;
    }

    //method to locate register button element
    public WebElement registerButtonLoc(WebDriver driver){
        //locate register button by name
        WebElement registerButton= driver.findElement(By.name("register-button"));
        return registerButton;
    }

    //method to locate registration message
    public WebElement registrationMessage(WebDriver driver){
        //locate registration message by link text
        WebElement actualResult =driver.findElement(By.cssSelector("div[class=\"result\"]"));
        return actualResult;
    }
}
