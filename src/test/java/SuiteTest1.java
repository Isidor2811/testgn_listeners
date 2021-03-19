import org.testng.Assert;
import org.testng.annotations.Test;

public class SuiteTest1 {

    @Test
    public void additionTest() {
        Assert.assertEquals(4 + 4, 8);
    }

    @Test
    public void subtractionTest() {
        Assert.assertEquals(4 - 3, 1);
    }



}
