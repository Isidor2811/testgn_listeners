import org.testng.Assert;
import org.testng.annotations.Test;

public class SuiteTest2 {

    @Test
    public void multiplicationTest() {
        Assert.assertEquals(4 * 3, 12);
    }


    @Test
    public void divisionTest() {
        Assert.assertEquals(4 / 2, 2);
    }
}
