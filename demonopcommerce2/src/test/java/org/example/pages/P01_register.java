package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;

public class P01_register {

    public WebElement Register(){
        return driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    }

    public WebElement Gender(){
        return driver.findElement(By.id("gender-female"));
    }

    public WebElement FirstName(){
        return driver.findElement(By.id("FirstName"));
    }

    public WebElement LastName(){
        return driver.findElement(By.id("LastName"));
    }

    public WebElement DayParent(){
        return driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]"));
    }

    public WebElement MonthParent(){
        return driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"]"));
    }

    public WebElement YearParent(){
        return driver.findElement(By.cssSelector("select[name=\"DateOfBirthYear\"]"));
    }

    public WebElement Email(){
        return driver.findElement(By.id("Email"));
    }

    public WebElement CompanyName(){
        return driver.findElement(By.id("Company"));
    }

    public WebElement Password(){
        return driver.findElement(By.id("Password"));
    }

    public WebElement ConfirmPassword(){
        return driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement Button(){
        return driver.findElement(By.id("register-button"));
    }

    public WebElement Msg(){
        return driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }

    public WebElement Color(){
        return driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }












}
