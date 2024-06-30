package org.example.pages;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;


import static org.example.stepDefs.Hooks.driver;
public class P03_homePage {

    public WebElement Euro() {
        return driver.findElement(By.id("customerCurrency"));
    }

    public List<WebElement> Products() {
        return driver.findElements(By.cssSelector("div[class=\"prices\"]"));
    }

///////////////////////////// F04

    public WebElement SearchBar() {
        return driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]"));
    }

    public WebElement searchButton() {
        return driver.findElement(By.cssSelector("[class=\"button-1 search-box-button\"]"));

    }

    public List<WebElement> ProductTitle() {
        return driver.findElements(By.cssSelector("h2[class=\"product-title\"]"));


    }

    public List<WebElement> ProductSku() {
        return driver.findElements(By.cssSelector("div[class=\"sku\"]"));
    }

    public List<WebElement> ClickedProducts() {
        return driver.findElements(By.cssSelector("div[class=\"product-item\"]"));
    }




    ////////////////////
    // F05 HoverCategories

    public WebElement Computers(){
        return driver.findElement(By.cssSelector("a[href=\"/computers\"]"));
        //return driver.findElement(By.cssSelector("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));

    }

    public WebElement Electronics(){

        return driver.findElement(By.cssSelector("a[href=\"/electronics\"]"));
        //return driver.findElement(By.cssSelector("/html/body/div[6]/div[2]/ul[1]/li[2]/a"));

    }

    public WebElement Apparel(){

        return driver.findElement(By.cssSelector("a[href=\"/apparel\"]"));
       // return driver.findElement(By.cssSelector("/html/body/div[6]/div[2]/ul[1]/li[3]/a"));

    }

    public WebElement Desktops(){
        return driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]/a"));

    }

    public WebElement Notebooks(){
        return driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[2]/a"));

    }

    public WebElement Software(){
        return driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[3]/a"));

    }

    public WebElement PageSubtitle(){
        return driver.findElement(By.cssSelector("a[href=\"/desktops\"]"));

    }



    ///////////////////////
    // F06 Sliders

    public List<WebElement> SliderIcon() {
        return driver.findElements(By.cssSelector("div[class=\"nivo-controlNav\"]>a"));
    }

    public List<WebElement> SliderPicture() {
        return driver.findElements(By.cssSelector("div[class=\"nivoSlider\"]>a"));
    }

/////////////////////
    //F07 FollowUs

    public WebElement FaceBook() {
        return driver.findElement(By.cssSelector("li[class=\"facebook\"]"));

    }

    public WebElement Twitter() {
        return driver.findElement(By.cssSelector("li[class=\"twitter\"]"));

    }

    public WebElement RSS() {
        return driver.findElement(By.cssSelector("li[class=\"rss\"]"));

    }

    public WebElement YouTube() {
        return driver.findElement(By.cssSelector("li[class=\"youtube\"]"));

    }


    public List<WebElement> Websites(){
        return driver.findElements(By.cssSelector("ul[class=\"networks\"]>li>a"));
    }
















    /////////////////

    //F08 wishlist


    public List<WebElement> WishListButton(){
        return driver.findElements(By.cssSelector("button[class=\"button-2 product-box-add-to-cart-button\"]"));

    }




    public WebElement HTCButton() {
        return driver.findElement(By.cssSelector("button[id=\"add-to-wishlist-button-18\"]"));

    }

    public WebElement PopUpMsg() {
        return driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));

    }

    public WebElement QuantityValue() {
        return driver.findElement(By.cssSelector("input[class=\"qty-input\"]"));

    }

    public WebElement WishListIcon(){
        return driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]"));

    }












}
