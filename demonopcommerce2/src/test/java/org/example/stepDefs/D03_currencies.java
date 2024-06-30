package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D03_currencies {

    P03_homePage home = new P03_homePage();

    SoftAssert softAssert = new SoftAssert();

    @When("User selects Euro Currency")
    public void EuroClick() {
        Select select = new Select(home.Euro());
        select.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
    }


    @Then("Euro Symbol € should exist on all products")
    public void euroSymbol€ShouldExistOnAllProducts() {

        for (int i = 0 ; i < 4 ; i++){

            String items = home.Products().get(i).getText();
            softAssert.assertTrue(items.contains("€"));

            softAssert.assertAll();

        }

    }
}

