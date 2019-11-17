package testing;


import testing.drivers.*;
import testing.pages.ListingPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestListner.class)
public class FrameworkTest {



    @Test
  public void TestTwoo()
    {
        ChromeDriver driver = new ChromeDriver();
        System.setProperty("webdriver.gecko.driver", "C:\\D\\Official\\TimePass\\Practice\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver","C:\\D\\Official\\TimePass\\Practice\\chromedriver.exe");

        // This is one method where you want to have your own sharedDriver which can have all the WebDriver methods available
        // Check implementation of SharedDriver Class
        // Second method is shown in TestFrameworkMethod using wrapper class of WebDriver.
        SharedDriver d = new SharedDriver("Chrome");
        d.get("https://www.google.com");
         d.getCurrentUrl();
    }

    @Test
    public void TestFramework()
    {
        InitiateMyDriver d1 = new InitiateMyDriver();
        // Passing a STring of Type BROWSER enum and returning instance of MYdriver which can be used like WebDriver .
        MyDriver driver  = d1.InitiateMyDriver(Browser.CHROME);
        driver.get("https://codebeautify.org/xmlviewer");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }


    @Test // More of a facade patteen instead of Builder pattern. The same object is returned which called the method .
    public void TestBuilderPattern()
    {
        ListingPage lp = new ListingPage();
        lp.applyFlightFilter("6E").applyFlightFilter("SG").
                applyNoOfStopsFilter("2").applyFlightFilter("ED").applyrefundableFilter("true");

    }


    @Test
    public void TestEventListener()
    {
        ChromeDriver driver = new ChromeDriver();
        System.setProperty("webdriver.gecko.driver", "C:\\D\\Official\\TimePass\\Practice\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver","C:\\D\\Official\\TimePass\\Practice\\chromedriver.exe");

        EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
        EventHandler handler = new EventHandler();
        // This EventHandler class is a Class that will implements WebEventListener  which is required in EventFiringWebDriver as Listener
        // This snippet is from register Method of EFWD class
        // public EventFiringWebDriver register(WebDriverEventListener eventListener) {
        //this.eventListeners.add(eventListener);
       // return this;

        eventDriver.register(handler);
        eventDriver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
        //WebElement element = eventDriver.findElement(By.id("target"));
        eventDriver.quit();
    }
}
