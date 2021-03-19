import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class ForIInvokeMethodListener {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }

    @Test
    public void thisIsMainTest() {
        System.out.println("Inside thisIsMainTest");
        Assert.assertEquals(5 + 5, 10);
    }

    @Test
    public void thisMethodDependsOnOther() {
        System.out.println("Inside thisMethodDependsOnOther");
        Assert.assertEquals(2 + 2, 4);
    }


}
