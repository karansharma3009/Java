package testing.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


// Here myDriver is extending EventfiringWebDriver , which is basically a Wrapper class of Webdriver
// Now you can use all the methods which Webdriver has using MyDriver objects in our code.


public class MyDriver extends EventFiringWebDriver {
    WebDriver driver = null;
    String browser = null;

    public MyDriver(WebDriver driver) {
        super(driver);
    }


}
