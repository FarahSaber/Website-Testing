package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;

public class D06_homeSliders {

    P03_homePage Slider = new P03_homePage();
    SoftAssert softAssert = new SoftAssert();

    @When("User select on First Slider home page")
    public void SelectFirstSlider(){

        Slider.SliderIcon().get(0).click();

    }

    @And("User click on First selected slider")
    public void userClickOnFirstSelectedSlider() {
        Slider.SliderPicture().get(0).click();
        WebDriverWait Explicit = new WebDriverWait(driver, Duration.ofSeconds(7));
        Explicit.until(ExpectedConditions.numberOfWindowsToBe(2));
    }

    @Then("User should be directed to First product link")
    public void userShouldBeDirectedToFirstProductLink() {

        softAssert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/nokia-lumia-1020");

    }

    @When("User select on Second Slider home page")
    public void userSelectOnSecondSliderHomePage() {

        Slider.SliderIcon().get(1).click();
    }

    @And("User click on Second selected slider")
    public void userClickOnSecondSelectedSlider() {
        Slider.SliderPicture().get(1).click();
        WebDriverWait Explicit = new WebDriverWait(driver, Duration.ofSeconds(7));
        Explicit.until(ExpectedConditions.numberOfWindowsToBe(2));
    }

    @Then("User should be directed to Second product link")
    public void userShouldBeDirectedToSecondProductLink() {

        softAssert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/iphone-6");
    }
}
