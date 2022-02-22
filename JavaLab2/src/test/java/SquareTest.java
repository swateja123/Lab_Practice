import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {
    public Square s;
    @Test
    void getArea()
    {
        s=new Square(4);
        assertEquals(16.0,s.getArea(),0);
    }

    @Test
    void getPerimeter()
    {
        s=new Square(4);
        assertEquals(16.0,s.getPerimeter(),0);
    }
}