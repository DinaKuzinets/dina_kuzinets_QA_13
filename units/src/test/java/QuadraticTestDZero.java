import org.testng.Assert;
import org.testng.annotations.Test;

public class QuadraticTestDZero {

    @Test
    public void testQuadraticDZero() {
        Quadratic q = new Quadratic(8, 8, 2);
        Assert.assertEquals(q.discriminant(), 0);
    }


}
