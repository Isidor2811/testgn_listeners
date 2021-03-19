import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

    @Test
    public void additionTest() {
        Assert.assertEquals(4 + 4, 8);
    }

    @Test
    public void subtractionTest() {
        Assert.assertEquals(4 - 3, 1);
    }

    @Test
    public void multiplicationTest() {
        Assert.assertEquals(4 * 3, 12);
    }


    @Test
    public void divisionTest() {
        Assert.assertEquals(4 / 2, 2);
    }

}
