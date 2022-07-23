package com.lufra.tests;

import com.lufra.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Login {

    @Test
    public void testLogin() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.newwebpage.com/");
     //   Driver.getDriver().get("http://www.newwebpage.com/");


        Thread.sleep(2000);
        WebElement iframe = driver.findElement(By.cssSelector("iframe[frameborder='0']"));
        driver.switchTo().frame(iframe);
        Thread.sleep(2000);
        //  WebElement privacy_Policy = driver.findElement(By.xpath("//a[.='Privacy Policy']"));
        WebElement webhost = driver.findElement(By.xpath("(//a[contains(@href,'Design')])[1]"));
        Thread.sleep(3000);


        webhost.click();
        Thread.sleep(5000);
        driver.close();


    }
}
