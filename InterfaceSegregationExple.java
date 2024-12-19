package designPrinciples;

interface area{
    void area();
}

interface perimeter{
    void perimeter();
}

class Rectangle implements area,perimeter{

    double length;
    double breadth;

    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public void area(){
        System.out.println("Rectangle area: "+length*breadth);
    }

    public void perimeter(){
        System.out.println("Rectangle perimeter: "+2*(length+breadth));
    }
}

class Square implements area{

    double side;

    public Square(double side){
        this.side=side;
    }

    public void area(){
        System.out.println("Area of Square: "+side*side);
    }
}
public class InterfaceSegregationExple {

    public static void main(String[] args) {

        Rectangle rectangle=new Rectangle(3.2,6.5);
        rectangle.area();
        rectangle.perimeter();

        Square square=new Square(3);
        square.area();
    }
}