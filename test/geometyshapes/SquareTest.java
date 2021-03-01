package geometyshapes;

import org.junit.Test;
import static org.junit.Assert.*;

public class SquareTest {
    
    public SquareTest() {
    }

    @Test
    public void testArea() {
        Square s = new Square(4);
        double expected = 16;
        double actual = s.area();
        assertEquals(expected, actual, 0.0001);
    }
    
}
