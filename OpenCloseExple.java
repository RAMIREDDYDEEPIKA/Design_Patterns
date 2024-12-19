package designPrinciples;

interface Shape{
   void area();
}

class Circle implements Shape{

    public void area() {
        double radius=5.3;
        double result= Math.PI * radius * radius;
        System.out.println("Circle area: "+result);
    }
}

class RectangleShape implements Shape{

    public void area() {
        double lenght=4.3,breadth=5.2;
        double result=lenght*breadth;
        System.out.println("Rectangle area: "+result);
    }
}
public class OpenCloseExple
{
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.area();

        RectangleShape rectangle=new RectangleShape();
        rectangle.area();
    }
}