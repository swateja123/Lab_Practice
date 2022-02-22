import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
public  Circle c;


    @Test
    void getArea() {
        c=new Circle(1.5);
        assertEquals(7.0685834705770345,c.getArea(),0);
    }

    @Test
    void getPerimeter() {
        c=new Circle(1.5);
        assertEquals(9.42477796076938,c.getPerimeter(),0);
    }
}