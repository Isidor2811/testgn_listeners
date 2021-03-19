import org.testng.Assert;
import org.testng.annotations.Test;


public class ForAnnotationTransformer {

    @Test
    public void thisIsMainTest() {
        Assert.assertEquals(5 + 5, 9);
    }

    @Test(dependsOnMethods = "thisIsMainTest")
    public void thisMethodDependsOnOther() {
        Assert.assertEquals(2 + 2, 4);
    }


}
