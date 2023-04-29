package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.example.pages.P04_SearchPage;
import org.example.pages.P05_ProductPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D04_searchStepDef {
    P03_homePage HLoc= new P03_homePage();
    P04_SearchPage SLoc= new P04_SearchPage();
    P05_ProductPage PLoc= new P05_ProductPage();


    @When("user enters {string} in search bar")
    public void user_enters_product_in_search_bar(String product){
        //get search bar locator
        WebElement searchBar= HLoc.searchBarLoc(Hooks.driver);
        //enter product in search bar
        searchBar.sendKeys(product);
    }

    @And("user clicks on the search button")
    public void user_clicks_on_the_search_button(){
        //get search button web element
        WebElement searchButton= HLoc.searchButtonLoc(Hooks.driver);
        //click on search button
        searchButton.click();
    }

    @Then("search results for {string} are displayed")
    public void search_results_for_product_are_displayed(String product){
        SoftAssert soft= new SoftAssert();
        //verify that url contains "https://demo.nopcommerce.com/search?q="
        String actualUrl=Hooks.driver.getCurrentUrl();
        String expectedUrl= "https://demo.nopcommerce.com/search?q=";
        soft.assertTrue(actualUrl.contains(expectedUrl));
        //verify that search shows relevant results
        //get results web elements list
        List<WebElement> results= SLoc.searchResults(Hooks.driver);
        int size= results.size();
        //loop over every result
        for(int i=0; i< size; i++){
            String actualText=results.get(i).getText().toLowerCase();
            String expectedText= product;
            soft.assertTrue(actualText.contains(expectedText));
        }
        soft.assertAll();
    }

    @When("user search for {string}")
    public void user_search_for_SKU(String SKU){
        //enter sku in search bar
        WebElement searchBar= HLoc.searchBarLoc(Hooks.driver);
        searchBar.sendKeys(SKU);
    }

    @Then("the search results for {string} product are displayed successfully")
    public void the_search_results_for_SKU_product_are_displayed_successfully(String SKU){
        //click on the resulted product
        WebElement resultedProduct= SLoc.resultedProductLoc(Hooks.driver);
        resultedProduct.click();
        //verify that the product contains the SKU you searched for
        WebElement SKULoc= PLoc.SKULoc(Hooks.driver);
        String actualText= SKULoc.getText();
        String expectedText= SKU;
        Assert.assertTrue(actualText.contains(expectedText));
    }
}
