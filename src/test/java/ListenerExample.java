import DS.ApacheExcel;
import DS.ListnerExample;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnerExample.class)
public class ListenerExample {


    @Test
    public void passedTEst()
    {
        Assert.assertEquals(true,true);
    }

    @Test
    public void passedTEst2()
    {
        Assert.assertEquals(true,true);
    }


    @Test
    public void FailedTest()
    {
        Assert.assertEquals(false,true);
    }

    @Test
    public void readExcel()
    {
        ApacheExcel ae = new ApacheExcel() ;
        ae.readFromExcel();;
    }


}




