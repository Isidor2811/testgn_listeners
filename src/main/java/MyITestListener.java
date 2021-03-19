import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

import java.util.List;
import java.util.stream.Collectors;

public class MyITestListener implements ITestListener {

    public void onTestStart(ITestResult test) {
        System.out.println("====== Test method starts: [" + test.getName() + "] ======");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("[" + result.getName() + "] finished success result");
    }

    public void onStart(ITestContext context) {
        System.out.println("Start date: " + context.getStartDate());
        System.out.println("****** Test from xml starts: [" + context.getName() + "] ******");
    }

    public void onFinish(ITestContext context) {
        List<String> passedTests = context.getPassedTests()
                .getAllMethods().stream().map(ITestNGMethod::getMethodName).collect(Collectors.toList());
        List<String> failedTests = context.getFailedTests()
                .getAllMethods().stream().map(ITestNGMethod::getMethodName).collect(Collectors.toList());
        System.out.println("****** Test from xml finished: [" + context.getName() + "] ******");
        System.out.println("This is onFinish method" + passedTests);
        System.out.println("This is onFinish method" + failedTests);
        System.out.println("End date: " + context.getEndDate());
    }

}
