package geometyshapes;

import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest {
    
    public TriangleTest() {
    }

    @Test
    public void testArea() {
        Triangle t = new Triangle(7, 8);
        double expected = 28;
        double actual = t.area();
        assertEquals(expected, actual, 0.0001);
    }
    
}
