package testing.drivers;

import org.openqa.selenium.WebDriver;
import wynk.GoogleChromeDriver;

public class InitiateMyDriver {

    MyDriver driver = null;
    WebDriver d = null;
    public MyDriver  InitiateMyDriver(Browser browser)
    {
        if( browser==Browser.CHROME)
        {
            GoogleChromeDriver gcd = new GoogleChromeDriver();
            //d = gcd.getDriverInstance();
            driver = new MyDriver(d);
        }
        else if ( browser==Browser.FIREFOX)
        {
            FireFoxDriver  gcd = new FireFoxDriver();
            d = gcd.getDriverInstance();
            driver = new MyDriver(d);
        }

     return driver;
    }
}
