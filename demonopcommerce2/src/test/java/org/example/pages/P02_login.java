package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;
public class P02_login {

    public WebElement Login() {

        return driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));

    }

    public WebElement Email() {

        return driver.findElement(By.cssSelector("input[id=\"Email\"]"));

    }

    public WebElement Password() {

        return driver.findElement(By.cssSelector("input[id=\"Password\"]"));

    }

    public WebElement Button() {

        return driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));

    }

    public WebElement MyAccount() {

        return driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));

    }

    public WebElement ErrorMsg() {

        return driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));

    }

    public WebElement Color() {

        return driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));

    }





}
