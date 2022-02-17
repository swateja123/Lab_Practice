package PerimeterArea;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateArea_PerimeterTest {
    public CalculateArea_Perimeter p;
@org.junit.Before
    public void setup()
{
    p=new CalculateArea_Perimeter();
    System.out.println("Running the Test");
}
    @Test
    public void circle()
    {
    p.circle(1.5);
    assertEquals(9.42477796076938,p.circlePerimeter,0);
    assertEquals(7.0685834705770345,p.circleArea,0);
    }

    @Test
    public void square()
    {
    p.square(4);
        assertEquals(16.00,p.squarePerimeter,0);
        assertEquals(16.00,p.squareArea,0);
    }

    @Test
    public void rectangle()
    {
        p.rectangle(2,3);
        assertEquals(10.00,p.RectanglePerimeter,0);
        assertEquals(6.00,p.RectangleArea,0);
        System.out.println("All the cases passed");
    }
}