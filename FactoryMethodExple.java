interface Shape
{
    void draw();
}

class Circle implements Shape{
    public void draw() {
        System.out.println("Circle shape");
    }
}

class Rectangle implements Shape{
    public void draw(){
        System.out.println("Rectangle shape");
    }
}

class ShapeFactory{

    public Shape createShape(String shapeType){

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}

public class FactoryMethodExple
{
    public static void main(String[] args) {

        ShapeFactory factory=new ShapeFactory();
        Shape shape1= factory.createShape("circle");
        shape1.draw();
        Shape shape2= factory.createShape("rectangle");
        shape2.draw();
    }
}