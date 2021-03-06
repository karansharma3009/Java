package testing.drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import wynk.GoogleChromeDriver;

import java.util.List;
import java.util.Set;

public class SharedDriver implements  WebDriver{
    private  WebDriver driver =null;

    public SharedDriver(String browser)
    {
        if ( browser.equals("Chrome")) {
            GoogleChromeDriver g = new GoogleChromeDriver();
           // ChromeDriver d = g.getDriverInstance();
           // this.driver = d;
        }
        else
        {
            FireFoxDriver f = new FireFoxDriver();
            FirefoxDriver fd = f.getDriverInstance();
            this.driver = fd;
        }
    }

   public void get(String s) {
       this.driver.get(s);
    }

    public String getCurrentUrl() {
        return this.driver.getCurrentUrl();
    }

    public String getTitle() {
        return this.driver.getTitle();
    }

    public List<WebElement> findElements(By by) {
        return this.driver.findElements(by);
    }

    public WebElement findElement(By by) {
        return this.driver.findElement(by);
    }

    public String getPageSource() {
        return this.driver.getPageSource();
    }

    public void close() {
        this.driver.close();
    }

    public void quit() {
        this.driver.quit();;
    }

    public Set<String> getWindowHandles() {
        return this.driver.getWindowHandles();
    }

    public String getWindowHandle() {
        return this.driver.getWindowHandle();
    }

    public TargetLocator switchTo() {
        return this.driver.switchTo();
    }

    public Navigation navigate() {
        return this.driver.navigate();
    }

    public Options manage() {
        return this.driver.manage();
    }

}
