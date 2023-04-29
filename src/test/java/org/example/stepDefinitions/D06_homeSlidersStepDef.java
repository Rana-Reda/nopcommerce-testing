package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D06_homeSlidersStepDef {
    P03_homePage HLoc= new P03_homePage();

    @When("user clicks on first slider")
    public void user_clicks_on_first_slider(){
        WebElement firstSlider= HLoc.FSliderLoc(Hooks.driver);
        WebDriverWait wait= new WebDriverWait(Hooks.driver, Duration.ofMillis(10000));
        wait.until(ExpectedConditions.visibilityOf(firstSlider));
        firstSlider.click();
    }

    @Then("user is directed to a new url for this slider successfully")
    public void user_is_directed_to_a_new_url_for_this_slider_successfully(){
        //verify that clicking on first slider directs user to this url https://demo.nopcommerce.com/iphone-6
        String actualUrl= Hooks.driver.getCurrentUrl();
        String expectedUrl= "https://demo.nopcommerce.com/iphone-6";
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @When("user clicks on second slider")
    public void user_clicks_on_second_slider() throws InterruptedException {
        WebElement secondSlider = HLoc.SSliderLoc(Hooks.driver);
        WebDriverWait wait= new WebDriverWait(Hooks.driver, Duration.ofMillis(10000));
        wait.until(ExpectedConditions.visibilityOf(secondSlider));
        secondSlider.click();
    }

    @Then("user is directed to a new url for second slider successfully")
    public void user_is_directed_to_a_new_url_for_second_slider_successfully(){
        //verify that clicking on second slider directs user to this url https://demo.nopcommerce.com/nokia-lumia-1020
        String actualUrl= Hooks.driver.getCurrentUrl();
        String expectedUrl= "https://demo.nopcommerce.com/nokia-lumia-1020";
        Assert.assertEquals(actualUrl,expectedUrl);
    }
}
