import org.testng.Assert;
import org.testng.annotations.Test;

public class QuadraticTestANull {


    @Test
    public void testQuadratic() {
        Quadratic q = new Quadratic(0, 8, 2);
        Assert.assertEquals(q.a, 0);
    }

}
