package PerimeterArea;

public class CalculateArea_Perimeter
{
    public double circleArea;
    public double circlePerimeter;
    public double squareArea;
    public double squarePerimeter;
    public double RectangleArea;
    public double RectanglePerimeter;
    public void circle(double radius)
    {

        circlePerimeter=2*Math.PI*radius;
        circleArea=Math.PI*radius*radius;
        System.out.println("Perimeter of Circle is: "+String.format("%.2f",(circlePerimeter)));

        System.out.println("Area of Circle is: "+String.format("%.2f",(circleArea)));
    }
    public void square(double length)
    {

        squarePerimeter=4*length;
        squareArea=length*length;
        System.out.println("\nPerimeter of Square is: "+String.format("%.2f",(squarePerimeter)));

        System.out.println("Area of Square is: "+String.format("%.2f",(squareArea)));

    }
    public void rectangle(double base,double height)
    {

        RectanglePerimeter=2*(base+height);
        RectangleArea=base*height;
        System.out.println("\nPerimeter of Rectangle is: "+String.format("%.2f",(RectanglePerimeter)));

        System.out.println("Area of Rectangle is: "+String.format("%.2f",(RectangleArea)));

    }

    public static void main(String[] args)
    {
        CalculateArea_Perimeter c=new CalculateArea_Perimeter();
        c.circle(1.5);
        c.square(4);
        c.rectangle(2,3);

    }

}
