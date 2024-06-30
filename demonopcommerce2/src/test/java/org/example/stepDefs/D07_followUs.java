package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;

import static org.example.stepDefs.Hooks.driver;

public class D07_followUs {

    P03_homePage Follow = new P03_homePage();
    SoftAssert softAssert = new SoftAssert();



    @When("User scroll down and click on FacebookIcon")
    public void UserClickOnFacebook() throws InterruptedException {

        Follow.FaceBook().click();
        Thread.sleep(2000);
    }

    @Then("User should be directed to Facebook Website {string}")
    public void userShouldBeDirectedToFacebookWebsite(String FacebookLink) {

        WebDriverWait Explicit = new WebDriverWait(driver, Duration.ofSeconds(7));
        Explicit.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());


        driver.switchTo().window(Tabs.get(1));

        softAssert.assertEquals(driver.getCurrentUrl(), FacebookLink);

        driver.close();

    }

    @When("User scroll down and click on TwitterIcon")
    public void userScrollDownAndClickOnTwitterIcon() throws InterruptedException {

        Follow.Twitter().click();
        Thread.sleep(2000);

    }

    @Then("User should be directed to Twitter Website {string}")
    public void userShouldBeDirectedToTwitterWebsite(String TwitterLink) {

        WebDriverWait Explicit = new WebDriverWait(driver, Duration.ofSeconds(7));
        Explicit.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());


        driver.switchTo().window(Tabs.get(1));

        softAssert.assertEquals(driver.getCurrentUrl(), TwitterLink);

        driver.close();

    }



    @When("User scroll down and click on RSSIcon")
    public void userScrollDownAndClickOnRSSIcon() throws InterruptedException {

        Follow.RSS().click();
        Thread.sleep(2000);

    }

    @Then("User should be directed to RSS Website {string}")
    public void userShouldBeDirectedToRSSWebsite(String RssLink) {

        WebDriverWait Explicit = new WebDriverWait(driver, Duration.ofSeconds(7));
        Explicit.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(Tabs.get(1));

        softAssert.assertEquals(driver.getCurrentUrl(), RssLink);

        driver.close();
    }



    @When("User scroll down and click on YouTubeIcon")
    public void userScrollDownAndClickOnYouTubeIcon() throws InterruptedException {

        Follow.YouTube().click();
        Thread.sleep(2000);

    }

    @Then("User should be directed to YouTube Website {string}")
    public void userShouldBeDirectedToYouTubeWebsite(String YoutubeLink) {

        WebDriverWait Explicit = new WebDriverWait(driver, Duration.ofSeconds(7));
        Explicit.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(Tabs.get(1));

        softAssert.assertEquals(driver.getCurrentUrl(), YoutubeLink);

        driver.close();

        softAssert.assertAll();
    }


}
