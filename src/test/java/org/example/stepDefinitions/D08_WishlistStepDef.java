package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.example.pages.P06_WishlistPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D08_WishlistStepDef {
    P03_homePage HLoc= new P03_homePage();
    P06_WishlistPage WLoc= new P06_WishlistPage();
    @When("user clicks on wishlist button on product")
    public void user_clicks_on_wishlist_button_on_product(){
        WebElement wishlistButton= HLoc.wishlistButtonLoc(Hooks.driver);
        wishlistButton.click();
    }

    @Then("A success message with green background is displayed successfully")
    public void A_success_message_with_green_background_is_displayed_successfully(){
        //verify success message is displayed
        WebElement successMessage= HLoc.successMessageLoc(Hooks.driver);
        String actualText= successMessage.getText();
        String expectedText="The product has been added to your wishlist";
        SoftAssert soft= new SoftAssert();
        soft.assertEquals(actualText,expectedText);
        //verify success message background color is green
        String actualBackgroundColor= successMessage.getCssValue("background-color");
        actualBackgroundColor= Color.fromString(actualBackgroundColor).asHex();
        String expectedBackgroundColor= "#4bb07a";
        soft.assertEquals(actualBackgroundColor,expectedBackgroundColor);
        soft.assertAll();
    }

    @And("user clicks on \"Wishlist\" Tab on the top of the page")
    public void user_clicks_on_Wishlist_Tab_on_the_top_of_the_page(){
        //wait till success message is invisible
        WebElement successMessage= HLoc.successMessageLoc(Hooks.driver);
        WebDriverWait wait= new WebDriverWait(Hooks.driver, Duration.ofMillis(4000));
        wait.until(ExpectedConditions.invisibilityOf(successMessage));
        //go to wishlist page
        WebElement wishlistTap= HLoc.wishlistTapLoc(Hooks.driver);
        wishlistTap.click();
    }

    @Then("product Qty would be greater than 0 successfully")
    public void product_Qty_would_be_greater_than_0_successfully(){
        //verify that product quantity is greater than 0
        WebElement quantity= WLoc.quantityLoc(Hooks.driver);
        String val = quantity.getAttribute("value");
        int value=Integer.parseInt(val);
        Assert.assertTrue(value>0);
    }
}
