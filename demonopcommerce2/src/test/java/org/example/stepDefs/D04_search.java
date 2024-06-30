package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.Locale;

import static org.example.stepDefs.Hooks.driver;

public class D04_search {

    P03_homePage Search = new P03_homePage();
    SoftAssert softAssert = new SoftAssert();

    @When("User enter product name {string}")
    public void userEnterProductName(String productName) {
        Search.SearchBar().sendKeys(productName);
        Search.searchButton().click();

    }

    @Then("All products contains {string} appear in search")
    public void allProductsContainsAppearInSearch(String productName) {


        Assert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));

        for (int i = 0; i < Search.ProductTitle().size() - 1; i++) {
            String name = Search.ProductTitle().get(i).getText().toLowerCase();
            softAssert.assertTrue(name.contains(productName));

             softAssert.assertAll();
        }
    }

    @When("User enter product sku {string}")
    public void userEnterProductSku(String Sku) {
        Search.SearchBar().sendKeys(Sku);
        Search.searchButton().click();
        Search.ClickedProducts().get(0).click();

    }

    @Then("All products contains Sku {string} appear in search")
    public void allProductsContainsSkuAppearInSearch(String Sku) {

        softAssert.assertTrue(Search.ProductSku().contains(Sku));



           softAssert.assertAll();
   }
}






