package wynk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UIClass implements HomePageConstants {


    public WebDriver InititeWynkdriver(String browser)
    {
        if(browser.equals("CHROME"))
        {
            GoogleChromeDriver chrome = new GoogleChromeDriver();
           return chrome.getDriverInstance();
        }
        else
        {
            FireFoxDriver firefox =new FireFoxDriver();
          return   firefox.getDriverInstance();
        }
    }


    public void performvalidations(WebDriver driver) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait (driver, 20);
        driver.get("https://www.airtelxstream.in/search");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(secondSearch)));
        driver.findElement(By.xpath(secondSearch)).sendKeys("Happy Bhag Jayegi");
        driver.findElement(By.xpath(searchButton)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(resultsFirst)));
        MoveToElement(driver,resultsFirst);
        driver.findElement(By.xpath(resultsFirst)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(playOnSecondPage)));
        driver.findElement(By.xpath(playOnSecondPage)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(enterMobile)));
        driver.findElement(By.xpath(enterMobile)).sendKeys("1111111111");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(continueButton)));
        driver.findElement(By.xpath(continueButton)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(enterOTP1)));
       /* driver.findElement(By.xpath(enterOTP1)).click();
        driver.findElement(By.xpath(enterOTP1)).sendKeys("1");*/
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(enterOTP2)));
        //driver.findElement(By.xpath(enterOTP2)).click();
        driver.findElement(By.xpath(enterOTP2)).sendKeys("2");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(enterOTP2)));
       // driver.findElement(By.xpath(enterOTP3)).click();
        driver.findElement(By.xpath(enterOTP3)).sendKeys("3");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(enterOTP3)));
       // driver.findElement(By.xpath(enterOTP4)).click();
        driver.findElement(By.xpath(enterOTP4)).sendKeys("4");
        driver.findElement(By.xpath(enterOTP1)).click();
        driver.findElement(By.xpath(enterOTP1)).sendKeys("1");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(verify)));
        driver.findElement(By.xpath(verify)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(popUpClose)));
        MoveToElement(driver,popUpClose);
        driver.findElement(By.xpath(popUpClose)).click();
        driver.findElement(By.xpath(HomePage)).click();

    }

    public void MoveToElement(WebDriver driver , String elem )
    {
        Actions action=new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(resultsFirst))).perform();
    }
}
