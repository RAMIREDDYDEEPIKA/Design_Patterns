package designPrinciples;

abstract class Bird{
    public abstract void move();
}

class Sparrow extends Bird{
    public void move(){
        System.out.println("Sparrow can flying");
    }
}

class Penguin extends Bird{
    public void move(){
        System.out.println("Penguin can swimming");
    }
}
public class LiskovSubExple
{
    public static void main(String[] args) {
        Sparrow sparrow=new Sparrow();
        sparrow.move();

        Penguin penguin=new Penguin();
        penguin.move();
    }
}