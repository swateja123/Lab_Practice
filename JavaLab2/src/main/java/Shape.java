public class Shape
{
    public static void main(String[] args) {


        Rectangle r = new Rectangle(2, 3);
        r.print();
        Square s = new Square(2);
        s.print();
        //child class object is created
        Circle c= new Circle(2.4);
        c.print();

    }
}
