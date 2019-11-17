import com.google.gson.internal.LinkedTreeMap;
import com.jayway.restassured.response.Response;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import wynk.GetLayoutAPI;
import wynk.UIClass;

public class wynkTest {

    GetLayoutAPI object ;
    @Test
    public void APItest1()
    {
        object = new GetLayoutAPI();
        String ATVkeys = object.getATVKeysFromAPIResponses();
        object.getContentAPIRespone(ATVkeys);
    }


    @Test
   // @Parameters("browser")
    public void UItest1() throws InterruptedException {
        UIClass ui = new UIClass();
        WebDriver driver = ui.InititeWynkdriver("CHROME");
        ui.performvalidations(driver);
    }

}

