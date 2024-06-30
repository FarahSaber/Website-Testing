package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;
import static org.example.stepDefs.Hooks.driver;


public class D02_login {
    P02_login Log = new P02_login();
    SoftAssert softAssert = new SoftAssert();


    @When("user go to login page")
    public void LoginClick() {
        Log.Login().click();

    }


    @And("user login with valid {string}  {string}")
    public void userLoginWithValid(String mail, String pass) {
        Log.Email().sendKeys(mail);
        Log.Password().sendKeys(pass);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {

        Log.Button().click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {

        String Link = driver.getCurrentUrl();
        softAssert.assertEquals(Link,"https://demo.nopcommerce.com/");

        boolean MyAccount = Log.MyAccount().isDisplayed();
        softAssert.assertTrue(MyAccount);

        softAssert.assertAll();

    }

    @And("user login with invalid {string} and {string}")
    public void userLoginWithInvalidAnd(String Email, String Password) {
        Log.Email().sendKeys(Email);
        Log.Password().sendKeys(Password);
    }


    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {

        String Error = Log.ErrorMsg().getText();
        boolean contain = Error.contains("Login was unsuccessful.");
        softAssert.assertTrue(contain);


        String RedColor = Log.Color().getCssValue("color");
        System.out.println(RedColor);
        softAssert.assertEquals(RedColor,"rgba(228, 67, 75, 1)");
        String colorHex = Color.fromString(RedColor).asHex();
        System.out.println(colorHex);
        softAssert.assertEquals(colorHex,"#e4434b");


        softAssert.assertAll();

    }





}


