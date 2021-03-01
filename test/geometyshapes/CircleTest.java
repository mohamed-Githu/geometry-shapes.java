package geometyshapes;

import org.junit.Test;
import static org.junit.Assert.*;

public class CircleTest {
    
    public CircleTest() {
    }

    @Test
    public void testArea() {
        Circle c = new Circle(10);
        double expected = 314;
        double actual = c.area();
        assertEquals(expected, actual, 10);
    }
    
}
