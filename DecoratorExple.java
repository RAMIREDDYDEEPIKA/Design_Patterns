interface Coffee{
    void prepare();
}

class SimpleCoffee implements Coffee{
    public void prepare(){
        System.out.println("Coffee is ready");
    }
}

abstract class CoffeeDecorator implements Coffee{
    Coffee coffee;
    public CoffeeDecorator(Coffee coffee){
        this.coffee=coffee;
    }
    public void prepare(){
        coffee.prepare();
    }
}

class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee){
        super(coffee);
    }
    public void prepare(){
        coffee.prepare();
        addMilk();
    }
    public void addMilk(){
        System.out.println("added milk");
    }
}
class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee){
        super(coffee);
    }
    public void prepare(){
        coffee.prepare();
        addSugar();
    }
    public void addSugar(){
        System.out.println("added sugar");
    }
}

public class DecoratorExple
{
    public static void main(String[] args) {
        Coffee simplecoffee=new SimpleCoffee();
        System.out.println("Simple coffee");
        simplecoffee.prepare();

        Coffee milkdecorator=new MilkDecorator(simplecoffee);
        System.out.println("\nmilk:");
        milkdecorator.prepare();

        Coffee sugardecorator=new SugarDecorator(milkdecorator);
        System.out.println("\nsugar:");
        sugardecorator.prepare();
    }
}