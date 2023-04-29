package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login loginLocators = new P02_login();


    @Given("user go to login page")
    public void user_go_to_login_page(){
        //get login web element locator
        WebElement login= loginLocators.loginLoc(Hooks.driver);
        //click on login to go to login page
        login.click();
    }

    @When("user login with \"valid\" \"test@example.com\" and \"P@ssw0rd\"")
    public void user_login_with_valid_email_and_password(){
        //get email locator
        WebElement email= loginLocators.emailLoc(Hooks.driver);
        //enter valid email
        email.sendKeys("test@example.com");
        //get password locator
        WebElement password= loginLocators.passwordLoc(Hooks.driver);
        //enter valid password
        password.sendKeys("P@ssw0rd");
    }

    @And("user press on login button")
    public void user_press_on_login_button(){
        //get login button element
        WebElement loginButton = loginLocators.loginButtonLoc(Hooks.driver);
        //click on login button
        loginButton.click();
    }

    @Then("user login to the system successfully")
    public void user_login_to_the_system_successfully(){
        SoftAssert soft= new SoftAssert();
        //verify that current url equals to https://demo.nopcommerce.com/
        String actualUrl = Hooks.driver.getCurrentUrl();
        String expectedUrl=  "https://demo.nopcommerce.com/";
        soft.assertEquals(actualUrl, expectedUrl);
        //verify that "My account" tab isDisplayed
        WebElement myAccount = loginLocators.myAccountLoc(Hooks.driver);
        soft.assertTrue(myAccount.isDisplayed());
        soft.assertAll();
    }
    //Second Scenario
    @When("user login with \"invalid\" \"wrong@example.com\" and \"P@ssw0rd\"")
    public void user_login_with_invalid_email_and_password(){
       //enter invalid email
        WebElement email= loginLocators.emailLoc(Hooks.driver);
        email.sendKeys("rana@gmail");
       //enter invalid password
        WebElement password= loginLocators.passwordLoc(Hooks.driver);
        password.sendKeys("test");
    }

    @Then("user could not login to the system")
    public void user_could_not_login_to_the_system(){
        SoftAssert soft= new SoftAssert();
        //verify error message contains "Login was unsuccessful."
        WebElement error= loginLocators.errorMsgLoc(Hooks.driver);
        String actualMsg= error.getText();
        String expectedMsg = "Login was unsuccessful.";
        soft.assertTrue(actualMsg.contains(expectedMsg));
        //verify the color of this message is red
        String actualColor=error.getCssValue("color");
        actualColor= Color.fromString(actualColor).asHex();
        String expectedColor="#e4434b";
        soft.assertEquals(actualColor,expectedColor);
        soft.assertAll();
    }
}
