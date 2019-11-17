import org.testng.annotations.Factory;

public class TestFactory {

    @Factory()
    public Object[] getTestClasses() {
        Object[] tests = new Object[3];
        tests[0] = new ListenerExample();
        tests[1] = new ListenerExample();
        tests[2]= new ListenerExample();
        return tests;
    }

}