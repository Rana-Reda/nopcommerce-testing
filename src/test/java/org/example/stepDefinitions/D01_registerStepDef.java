package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_register registerLocators = new P01_register();
    @Given("user go to register page")
    public void user_go_to_register_page(){
        //get the register button web element
        WebElement regLoc = registerLocators.registerLoc(Hooks.driver);
        //click on register to go to register page
        regLoc.click();
    }

    @When("user select gender type")
    public void user_select_gender_type(){
        //get gender web element
        WebElement gender= registerLocators.genderLoc(Hooks.driver);
        //select female
        gender.click();
    }

    @And("user enter first name \"automation\" and last name \"tester\"")
    public void user_enter_first_name_and_lastName(){
        //get firstname element
        WebElement firstname= registerLocators.FNameLoc(Hooks.driver);
        //enter automation as firstname
        firstname.sendKeys("automation");
        //get lastname element
        WebElement lastname= registerLocators.LNameLoc(Hooks.driver);
        //enter tester as lastname
        lastname.sendKeys("tester");
    }

    @And("user enter date of birth")
    public void user_enter_date_of_birth(){
        //get day element
        WebElement day= registerLocators.dayLoc(Hooks.driver);
        //create new select with day element
        Select selectDay = new Select(day);
        //select your birthday (17)
        selectDay.selectByIndex(17);
        //get month element
        WebElement month= registerLocators.monthLoc(Hooks.driver);
        //create new select with month element
        Select selectMonth = new Select(month);
        //select your birth month (6)
        selectMonth.selectByValue("6");
        //get year element
        WebElement year = registerLocators.yearLoc(Hooks.driver);
        //create new select with year element
        Select selectYear = new Select(year);
        //select your birth year (1999)
        selectYear.selectByValue("1999");
    }

    @And("user enter email \"test@example.com\" field")
    public void user_enter_email_field(){
        //get email element
        WebElement email= registerLocators.emailLoc(Hooks.driver);
        //enter "testt@example.com" in email field
        email.sendKeys("test@example.com");
    }

    @And("user fills Password fields \"P@ssw0rd\" \"P@ssw0rd\"")
    public void user_fills_Password_fields(){
        //get password element
        WebElement password = registerLocators.passwordLoc(Hooks.driver);
        //enter "P@ssw0rd" in password field
        password.sendKeys("P@ssw0rd");
        //get confirm password element
        WebElement confirm= registerLocators.ConPasswordLoc(Hooks.driver);
        //send the same password
        confirm.sendKeys("P@ssw0rd");
    }

    @And("user clicks on register button")
    public void user_clicks_on_register_button(){
        //get register button element
        WebElement registerButton = registerLocators.registerButtonLoc(Hooks.driver);
        //click on register
        registerButton.click();
    }

    @Then("success message is displayed")
    public void success_message_is_displayed(){
        //get registration message element
        WebElement actualResult = registerLocators.registrationMessage(Hooks.driver);
        //get registration message text
        String message= actualResult.getText();
        //declare your expected result
        String expectedResult= "Your registration completed";
        //verify that actual result contains expected result
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(message.contains(expectedResult),"you registered successfully");
        //get the color of the message
        String actualColor =actualResult.getCssValue("color");
        //verify that the color of this message is green
        String expectedColor ="rgba(76, 177, 124, 1)";
        soft.assertEquals(actualColor, expectedColor);
        soft.assertAll();

    }
}
