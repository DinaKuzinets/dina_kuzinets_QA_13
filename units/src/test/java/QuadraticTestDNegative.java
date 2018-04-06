import org.testng.Assert;
import org.testng.annotations.Test;

public class QuadraticTestDNegative {

    @Test
    public void testQuadraticDNegative() {
        Quadratic q = new Quadratic(17, 18, 20);
        Assert.assertEquals(q.discriminant(), -1036);
    }
}
