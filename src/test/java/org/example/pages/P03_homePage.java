package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class P03_homePage {

    //F03_currencies feature
   //method to locate currency dropdown list
    public WebElement currencyLoc(WebDriver driver){
        WebElement currency= driver.findElement(By.id("customerCurrency"));
        return currency;
    }

    //method to locate price of each product
    public List<WebElement> priceLoc(WebDriver driver){
        List<WebElement> prices= driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
        return prices;
    }

    //F04_search feature
    //method to locate search bar
    public WebElement searchBarLoc(WebDriver driver){
        //locate search bar by id
        WebElement searchBar= driver.findElement(By.id("small-searchterms"));
        return searchBar;
    }

    //method to locate search button
    public WebElement searchButtonLoc(WebDriver driver){
        //locate search button using css selector
        WebElement searchButton = driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
        return searchButton;
    }

    //F05_hoverCategories feature
    //method to locate category elements
    public ArrayList<WebElement> categories(WebDriver driver){
        ArrayList<WebElement> categories= new ArrayList<>();
        //locate three main categories
        WebElement computers= driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
        WebElement electronics= driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
        WebElement apparel= driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]"));
        //add the three ain categories to the arraylist of categories
        categories.add(computers);
        categories.add(electronics);
        categories.add(apparel);
        return categories;
    }

    //method to locate children of subcategory
    public List<WebElement> subcategoryListLoc(WebDriver driver){
        List<WebElement> subList= driver.findElements(By.xpath("//ul/li"));
        return subList;
    }
    //method to locate computer subcategories
    public ArrayList<WebElement> computerSubCatLoc(WebDriver driver){
        ArrayList<WebElement> computerSubCat=new ArrayList<>();
        //get all the subcategories and add them to the arraylist
        computerSubCat.add(driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")));
        computerSubCat.add(driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]")));
        computerSubCat.add(driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[3]/a[1]")));
        return computerSubCat;
    }
    //method to locate electronics subcategories
    public ArrayList<WebElement> electronicsSubCatLoc(WebDriver driver){
        ArrayList<WebElement> subcategories= new ArrayList<>();
        subcategories.add(driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]")));
        subcategories.add(driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")));
        subcategories.add(driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[3]/a[1]")));
        return subcategories;

    }
    //method to locate apparel subcategories
    public ArrayList<WebElement> apparelSubCatLoc(WebDriver driver){
        ArrayList<WebElement> subcategories= new ArrayList<>();
        subcategories.add(driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")));
        subcategories.add(driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/ul[1]/li[2]/a[1]")));
        subcategories.add(driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/ul[1]/li[3]/a[1]")));
        return subcategories;
    }

    //F06_homeSliders feature
    //method to locate first slider
    public WebElement FSliderLoc(WebDriver driver){
        WebElement firstSlider= driver.findElement(By.xpath("//a[@rel='0']"));
        return firstSlider;
    }

    //method to locate second slider
    public WebElement SSliderLoc(WebDriver driver){
        WebElement secondSlider= driver.findElement(By.xpath("//a[@rel='1']"));
        return secondSlider;
    }

    //F07_followUs feature
    //method to locate facebook page
    public WebElement facebookLoc(WebDriver driver){
        WebElement facebook= driver.findElement(By.linkText("Facebook"));
        return facebook;
    }

    //method to locate twitter page
    public WebElement twitterLoc(WebDriver driver){
        WebElement twitter= driver.findElement(By.linkText("Twitter"));
        return twitter;
    }

    //method to locate RSS
    public WebElement RSSLoc(WebDriver driver){
        WebElement RSS= driver.findElement(By.linkText("RSS"));
        return RSS;
    }

    //method to locate youTube
    public WebElement youtubeLoc(WebDriver driver){
        WebElement youTube= driver.findElement(By.linkText("YouTube"));
        return youTube;
    }

    //F08_Wishlist feature
    //method to locate wishlist button for product "HTC One M8 Android L 5.0 Lollipop"
    public WebElement wishlistButtonLoc(WebDriver driver){
        WebElement wishlistButton= driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/button[3]"));
        return wishlistButton;
    }

    //method to locate success message
    public WebElement successMessageLoc(WebDriver driver){
        WebElement successMessage= driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
        return successMessage;
    }

    //method to locate wishlist tap
    public WebElement wishlistTapLoc(WebDriver driver){
        WebElement wishlistTap= driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]"));
        return wishlistTap;
    }


}
