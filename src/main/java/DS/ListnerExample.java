package DS;

import org.testng.*;
import org.testng.xml.XmlSuite;

import java.awt.event.ItemListener;
import java.util.List;
import java.util.Map;

public class ListnerExample implements ITestListener {
    public void onTestStart(ITestResult iTestResult) {

        Reporter.log("Starting Test ");
    }

    public void onTestSuccess(ITestResult iTestResult) {
        Reporter.log("Test SUCESSFULL");
    }

    public void onTestFailure(ITestResult iTestResult) {
        Reporter.log("FAILED ");
        Reporter.log(String.valueOf(iTestResult.getEndMillis()));
        Reporter.log( iTestResult.getHost());
        Reporter.log( iTestResult.getInstanceName());

    }

    public void onTestSkipped(ITestResult iTestResult) {
        Reporter.log("SKIPPED",true);
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {
        Reporter.log("STARTED THE TEST ");
    }

    public void onFinish(ITestContext iTestContext) {
        Reporter.log("FINESHED ");
    }

    public void generateReport(List<XmlSuite> list, List<ISuite> list1, String s) {

        for (ISuite suite : list1) {

            //Following code gets the suite name
            String suiteName = suite.getName();

            //Getting the results for the said suite
            Map<String, ISuiteResult> suiteResults = suite.getResults();
            for (ISuiteResult sr : suiteResults.values()) {
                ITestContext tc = sr.getTestContext();
                System.out.println("Passed tests for suite '" + suiteName +
                        "' is:" + tc.getPassedTests().getAllResults().size());
                System.out.println("Failed tests for suite '" + suiteName +
                        "' is:" + tc.getFailedTests().getAllResults().size());
                System.out.println("Skipped tests for suite '" + suiteName +
                        "' is:" + tc.getSkippedTests().getAllResults().size());
            }
        }
    }
}
