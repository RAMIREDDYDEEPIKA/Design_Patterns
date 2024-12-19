package designPrinciples;

class ShapeUtils{

    public double area(double arg1,double arg2){

        return arg1 * arg2;
    }
}

public class DRYExple {

    public static void main(String[] args) {

        ShapeUtils shapeUtils=new ShapeUtils();

        double rectangleArea=shapeUtils.area(3.2,4.3);
        System.out.println("Rectangle area: "+rectangleArea);

        double squareArea=shapeUtils.area(2,2);
        System.out.println("Square area: "+squareArea);

    }
}