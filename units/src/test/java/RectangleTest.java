import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangleTest {

    @Test
    private void testRectangle() {
        Rectangle r = new Rectangle(7, 15);
        Assert.assertEquals(r.area(), 105);
    }
}
