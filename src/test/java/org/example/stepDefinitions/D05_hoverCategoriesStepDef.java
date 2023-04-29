package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class D05_hoverCategoriesStepDef {
    P03_homePage HLoc= new P03_homePage();
    WebElement randomCategory;
    String randomCategoryText;

    @When("user hovers on one of the three main categories")
    public void user_hovers_on_one_of_the_three_main_categories(){
       //get the category elements
        ArrayList<WebElement> categories= HLoc.categories(Hooks.driver);
        //generate a random number
        Random rand= new Random();
        int randomIndex= rand.nextInt(categories.size());
        //select random category
         randomCategory= categories.get(randomIndex);
        //wait until the element is visible
        WebDriverWait wait= new WebDriverWait(Hooks.driver, Duration.ofMillis(10000));
        wait.until(ExpectedConditions.visibilityOf(randomCategory));
        //hover on the selected random category
        Actions act= new Actions(Hooks.driver);
        act.moveToElement(randomCategory).build().perform();
    }

    @And("user select one of the three sub categories")
    public void user_select_one_of_the_three_sub_categories() throws InterruptedException {
        //get the random category you selected
        WebElement category = randomCategory;
        //get text of the random category you selected
        randomCategoryText= randomCategory.getText().toLowerCase().trim();
        //declare an arraylist for the subcategories
        ArrayList<WebElement> subcategoryList;
        //wait till the list of subcategories appear
        Thread.sleep(4000);
        //check if the category contains subcategory or not
        List<WebElement> subcategory= HLoc.subcategoryListLoc(Hooks.driver);
        //if the category element has children then it has a subcategory list
        if(subcategory.size()>0){
            //if it has a subcategory
            //check what is the random selected category is, to get its subcategory
            if(randomCategoryText.contains("appa")){
                subcategoryList= HLoc.apparelSubCatLoc(Hooks.driver);
            }
            else if(randomCategoryText.contains("elec")) {
              subcategoryList=HLoc.electronicsSubCatLoc(Hooks.driver);
            }
            else{
                subcategoryList=HLoc.computerSubCatLoc(Hooks.driver);
            }
            Random rand= new Random();
            int randomIndex= rand.nextInt(subcategoryList.size());
            //select random subcategory
            WebElement randomSubcategory = subcategoryList.get(randomIndex);
            //update your category with random subcategory
            randomCategory=randomSubcategory;
            //update text to be that for the random subcategory
            randomCategoryText= randomSubcategory.getText().toLowerCase().trim();
            randomCategory.click();
        }
        //if the category doesn't have a subcategory then select category
        else{
            randomCategory.click();
        }
    }

    @Then("the selected sub category opens successfully")
    public void the_selected_sub_category_opens_successfully(){
        //verify that current url is for the category you opened
        String actualUrl= Hooks.driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(randomCategoryText));
    }
}
