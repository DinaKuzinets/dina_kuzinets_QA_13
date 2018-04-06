import org.testng.Assert;
import org.testng.annotations.Test;

public class QuadraticTestDPositive {

    @Test
    public void testQuadraticDPositive() {
        Quadratic q = new Quadratic(17, 18, 2);
        Assert.assertEquals(q.discriminant(), 188);
    }
}
