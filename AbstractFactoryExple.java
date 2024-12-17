interface Button{
    void render();
}
interface CheckBox{
    void render();
}

class WindowsButton implements Button{
    public void render(){
        System.out.println("Windows button");
    }
}
class MacButton implements Button{
    public void render(){
        System.out.println("Mac button");
    }
}
class WindowsCheckBox implements CheckBox{
    public void render(){
        System.out.println("windows checkbox");
    }
}
class MacCheckBox implements CheckBox{
    public void render(){
        System.out.println("Mac checkbox");
    }
}

interface GUIFactory{
    Button createButton();
    CheckBox createCheckbox();
}

class Windowsfactory implements GUIFactory{
    public Button createButton(){
        return new WindowsButton();
    }
    public CheckBox createCheckbox(){
        return new WindowsCheckBox();
    }
}
class MacFactory implements GUIFactory{
    public Button createButton(){
        return new MacButton();
    }
    public CheckBox createCheckbox(){
        return new MacCheckBox();
    }
}

public class AbstractFactoryExple
{
    Button button;
    CheckBox checkbox;
    public AbstractFactoryExple(GUIFactory factory){
        button= factory.createButton();
        checkbox= factory.createCheckbox();
    }
    public void render(){
        button.render();
        checkbox.render();
    }
    public static void main(String[] args)
    {
        GUIFactory factory;

        factory=new Windowsfactory();
        AbstractFactoryExple app=new AbstractFactoryExple(factory);
        app.render();

        factory=new MacFactory();
        app=new AbstractFactoryExple(factory);
        app.render();
    }
}