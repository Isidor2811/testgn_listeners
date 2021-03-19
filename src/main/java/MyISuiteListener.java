import org.testng.ISuite;
import org.testng.ISuiteListener;

public class MyISuiteListener implements ISuiteListener {

    public void onStart(ISuite suite) {
        System.out.println("Suite " + suite.getName() + " started...");
    }

    public void onFinish(ISuite suite) {
        System.out.println("Suite " + suite.getName() + " finished...");
    }
}
