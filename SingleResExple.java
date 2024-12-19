package designPrinciples;

class Order
{
    String amount;

    public Order(String amount){
        this.amount=amount;
    }
}

class OrderProcess
{
    public void orderProcess(Order order)
    {
        System.out.println("Processing amount: "+order.amount);
    }
}

class OrderPayment{
    public void orderPayment(Order order){
        System.out.println("Payment amount: "+order.amount);
    }
}

public class SingleResExple
{
    public static void main(String[] args)
    {
        Order response=new Order("500");

        OrderProcess oProcess=new OrderProcess();
        oProcess.orderProcess(response);

        OrderPayment oPayment=new OrderPayment();
        oPayment.orderPayment(response);
    }
}