package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Set;

public class D07_followUsStepDef {
    P03_homePage HLoc= new P03_homePage();


    @When("user opens facebook link")
    public void user_opens_facebook_link(){
        //go to facebook link
        WebElement facebook= HLoc.facebookLoc(Hooks.driver);
        facebook.click();
        //get all opened windows
        Set<String> allTaps= Hooks.driver.getWindowHandles();
        String tab1= (String) allTaps.toArray() [0]; //homepage window
        String tab2= (String) allTaps.toArray() [1]; //facebook window
        //go to facebook window
        Hooks.driver.switchTo().window(tab2);
    }

    @Then("Facebook page {string} is opened in new tab successfully")
    public void Facebook_page_is_opened_in_new_tab_successfully(String url){
        //get the current window url
        String actualUrl= Hooks.driver.getCurrentUrl();
        String expectedUrl=url;
        //verify that facebook page is opened
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @When("user opens twitter link")
    public void user_opens_twitter_link(){
        //go to twitter link
        WebElement twitter= HLoc.twitterLoc(Hooks.driver);
        twitter.click();
        //get all opened windows
        Set<String> allTaps= Hooks.driver.getWindowHandles();
        String tab1= (String) allTaps.toArray() [0]; //homepage window
        String tab2= (String) allTaps.toArray() [1]; //twitter window
        //go to twitter window
        Hooks.driver.switchTo().window(tab2);
    }

    @Then("twitter page {string} is opened in new tab successfully")
    public void twitter_page_is_opened_in_new_tab_successfully(String url){
        //get the current window url
        String actualUrl= Hooks.driver.getCurrentUrl();
        String expectedUrl=url;
        //verify that twitter page is opened
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @When("user opens rss link")
    public void user_opens_rss_link(){
        //go to RSS link
        WebElement RSS= HLoc.RSSLoc(Hooks.driver);
        RSS.click();
        //get all opened windows
        Set<String> allTaps= Hooks.driver.getWindowHandles();
        String tab1= (String) allTaps.toArray() [0]; //homepage window
        String tab2= (String) allTaps.toArray() [1]; //RSS window
        //go to RSS window
        Hooks.driver.switchTo().window(tab2);
    }

    @Then("rss page {string} is opened in new tab successfully")
    public void rss_page_is_opened_in_new_tab_successfully(String url){
        //get the current window url
        String actualUrl= Hooks.driver.getCurrentUrl();
        String expectedUrl=url;
        //verify that rss page is opened
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @When("user opens youTube link")
    public void user_opens_youTube_link(){
        //go to youTube link
        WebElement youTube= HLoc.youtubeLoc(Hooks.driver);
        youTube.click();
        //get all opened windows
        Set<String> allTaps= Hooks.driver.getWindowHandles();
        String tab1= (String) allTaps.toArray() [0]; //homepage window
        String tab2= (String) allTaps.toArray() [1]; //youTube window
        //go to youTube window
        Hooks.driver.switchTo().window(tab2);
    }

    @Then("youTube page {string} is opened in new tab successfully")
    public void youTube_page_is_opened_in_new_tab_successfully(String url){
        //get the current window url
        String actualUrl= Hooks.driver.getCurrentUrl();
        String expectedUrl=url;
        //verify that youTube page is opened
        Assert.assertEquals(actualUrl,expectedUrl);
    }
}
