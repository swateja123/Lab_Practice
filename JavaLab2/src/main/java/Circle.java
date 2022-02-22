public class Circle extends Square
{
    //extends the circle square class and methods override
    public Circle(double length) {
        super(length);
    }

    @Override
    public double getArea() {
        return Math.PI*this.length*this.length;
    }

    @Override
    public double getPerimeter()
    {
       // return super.getPerimeter(length);
        return 2*Math.PI*this.length;
    }

    @Override
    public void print() {

        System.out.println("\nPerimeter of Circle is: "+getPerimeter());

        System.out.println("Area of circle is: "+getArea());
    }
}
