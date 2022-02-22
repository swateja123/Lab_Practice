public class Rectangle
{
public int area;
public int perimeter;
public int base,height;

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea()
    {
        area=2*(this.base+this.height);
        return area;
    }


    public int getPerimeter()
    {
        return this.base*this.height;
    }
    public void print()
    {
        System.out.println("\nPerimeter of Rectangle is: "+getArea());

        System.out.println("Area of Rectangle is: " +getPerimeter());

    }

}
