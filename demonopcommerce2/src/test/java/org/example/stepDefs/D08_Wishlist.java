package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;

 public class D08_Wishlist {

     P03_homePage WishList = new P03_homePage();

     SoftAssert softAssert = new SoftAssert();


     @When("User clicks on wishlist button on HTC product")
     public void ClickOnWishList() throws InterruptedException {

       WishList.ProductTitle().get(2).click();
        WishList.HTCButton().click();
         // WishList.WishListButton().get(2).click();
         //Thread.sleep(Duration.ofSeconds(30));
     }

     @Then("Verify that success message will be displayed and background-color of message is green")
     public void verifyThatSuccessMessageWillBeDisplayedAndBackgroundColorOfMessageIsGreen() {

         boolean Msg = WishList.PopUpMsg().isDisplayed();
         softAssert.assertTrue(Msg);

         String GreenColor = WishList.PopUpMsg().getCssValue("background-color");
         String HEXColor = Color.fromString(GreenColor).asHex();
         // System.out.println(HEXColor);
         softAssert.assertEquals(HEXColor,"#4bb07a");
         softAssert.assertAll();
     }




     @And("User clicks on wishlist icon on the top of the page")
     public void userClicksOnWishlistIconOnTheTopOfThePage() {

         WebDriverWait Explicit = new WebDriverWait(driver, Duration.ofSeconds(7));
         Explicit.until(ExpectedConditions.invisibilityOf(WishList.PopUpMsg()));
         WishList.WishListIcon().click();
     }

     @Then("Verify that quantity value is increased")
     public void verifyThatQuantityValueIsIncreased() {

         String Quantity = WishList.QuantityValue().getAttribute("value");
         softAssert.assertTrue(Integer.parseInt(Quantity)>0 );

         softAssert.assertAll();


     }


 }






