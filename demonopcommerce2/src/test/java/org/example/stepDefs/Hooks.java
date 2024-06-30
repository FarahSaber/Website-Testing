package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver;


    @Before
    public void SetUp() {

        String browserName = "Chrome";

        if (browserName.contains("Chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.contains("edge")) {
            driver = new EdgeDriver();

        } else if (browserName.contains("firefox")) {
            driver = new FirefoxDriver();

        } else driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // tare2a tanya lel wa2t
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://demo.nopcommerce.com/");

    }

    @After
    public void Quit() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(2));
        driver.quit();


    }
}
