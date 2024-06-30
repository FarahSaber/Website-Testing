package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import static org.example.stepDefs.Hooks.driver;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class D05_hoverCategories {

    P03_homePage Hover = new P03_homePage();
    SoftAssert softAssert = new SoftAssert();

    List<WebElement> SubCategories = new ArrayList<>();


@When("User selects randomly from three main category")
    public void UserSelectRandomCategory() throws InterruptedException {
    List < WebElement> Categories = new ArrayList<>();
    Categories.add(Hover.Computers());
    Categories.add(Hover.Electronics());
    Categories.add(Hover.Apparel());

    int min = 0;
    int max = Categories.size()-1;
    int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);

    Actions action = new Actions(driver);
    action.moveToElement(Categories.get(random_int)).perform();
    Thread.sleep(7000);

    Actions action2 = new Actions(driver);
    action2.moveToElement(Categories.get(0)).perform();
    Thread.sleep(3000);

}

    @And("User hovers and select randomly from sub main categories")
    public void userHoversAndSelectRandomlyFromSubMainCategories() throws InterruptedException {


        SubCategories.add(Hover.Desktops());
        SubCategories.add(Hover.Notebooks());
        SubCategories.add(Hover.Software());

        int min = 0;
        int max = SubCategories.size()-1;
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);

        Actions action3 = new Actions(driver);
        action3.moveToElement(SubCategories.get(0)).perform();


        //SubCategories.get(0).click();
        Thread.sleep(7000);


    }

    @Then("User should be redirected to new sub-category page")
    public void userShouldBeRedirectedToNewSubCategoryPage() {

    Hover.PageSubtitle().click();
    String ActualTitle = driver.findElement(By.cssSelector("div[class=\"page-title\"] h1")).getText().toLowerCase().trim();

      //  String ActualTitle = SubCategories.get(0).getText().toLowerCase().trim();
            String ExpectedTitle = Hover.PageSubtitle().getText().toLowerCase().trim();

          //  softAssert.assertEquals(ActualTitle,ExpectedTitle);

//        System.out.println(ActualTitle);
//        System.out.println(ExpectedTitle);

            softAssert.assertTrue(ExpectedTitle.contains(ActualTitle));
        // softAssert.assertAll();

}
}
