import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
public Rectangle r;
    @BeforeEach
    void setUp()
    {
        r=new Rectangle(2,3);
    }

    @Test
    void getArea()
    {
       // r.getArea();
        assertEquals(10.0,r.getArea(),0);
    }

    @Test
    void getPerimeter()
    {
       assertEquals(6.0,r.getPerimeter(),0);
    }
}