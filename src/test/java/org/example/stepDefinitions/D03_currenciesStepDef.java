package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class D03_currenciesStepDef {
    P03_homePage HLoc = new P03_homePage();

    @Given("user is on homepage")
    public void user_is_on_homepage(){
        // The user is already on home page, which was navigated to in the @Before.
        // No additional action is needed here.
    }
    @When("user select Euro currency from dropdown list")
    public void user_select_Euro_currency(){
        //get dropdown list web element
        WebElement currency= HLoc.currencyLoc(Hooks.driver);
        //create b=new select with dropdown
        Select sel= new Select(currency);
        //select euro currency
        sel.selectByIndex(1);
    }

    @Then("Euro Symbol is shown on the products displayed in Home page successfully")
    public void Euro_Symbol_is_shown_on_the_products(){
        //loop over each product of the 4 products displayed in home page
        for(int i=0; i<=3; i++){
            List<WebElement> prices= HLoc.priceLoc(Hooks.driver);
            //get the text of the price of each product
            String actualText= prices.get(i).getText();
            String expectedText="€";
            //verify that it has euro symbol
            Assert.assertTrue(actualText.contains(expectedText));
        }
    }

}
