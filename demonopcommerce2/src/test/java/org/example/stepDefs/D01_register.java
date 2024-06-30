package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_register {

    P01_register Reg = new P01_register();

    @When("user go to register page")
    public void RegisterClick(){
        Reg.Register().click();

    }

    @And("user select gender type")
    public void userSelectGenderType() {
        Reg.Gender().click();
    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String FName, String LName) {
        Reg.FirstName().sendKeys(FName);
        Reg.LastName().sendKeys(LName);
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
        Select select = new Select(Reg.DayParent());
        select.selectByVisibleText("14");

        Select selectMonth = new Select(Reg.MonthParent());
        selectMonth.selectByValue("3");

        Select selectYear = new Select(Reg.YearParent());
        selectYear.selectByVisibleText("1999");
    }

    @And("user enter email {string} field")
    public void userEnterEmailField(String mail) {
        Reg.Email().sendKeys(mail);
    }

    @And("user enter company name")
    public void userEnterCompanyName() {
        Reg.CompanyName().sendKeys("HeroPlast");
    }

    @And("user fills Password fields {string} {string}")
    public void userFillsPasswordFields(String Pass, String ConfPass) {
        Reg.Password().sendKeys(Pass);
        Reg.ConfirmPassword().sendKeys(ConfPass);
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        Reg.Button().click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {

        SoftAssert softAssert = new SoftAssert();
        Boolean Text = Reg.Msg().isDisplayed();
        softAssert.assertTrue(Text);

        String TextColor = Reg.Color().getCssValue("color");
       // System.out.println(TextColor);
        softAssert.assertEquals(TextColor,"rgba(76, 177, 124, 1)");



        softAssert.assertAll();

    }
}
