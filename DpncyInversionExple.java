package designPrinciples;

interface Notification{
    void send(String message);
}

class EmailNotification implements Notification{
    public void send(String message){
        System.out.println("Email notification: "+message);
    }
}
class PhnNotification implements Notification{
    public void send(String message){
        System.out.println("Phone Notification: "+message);
    }
}

class NotificationServer {

    Notification notification;

    public NotificationServer(Notification notification){
        this.notification=notification;
    }

    public void send(String message){
        notification.send(message);
    }
}

public class DpncyInversionExple {

    public static void main(String[] args) {

        EmailNotification emailNotification=new EmailNotification();
        NotificationServer notificationServer=new NotificationServer(emailNotification);
        notificationServer.send("This message from email");

        PhnNotification phnNotification=new PhnNotification();
        phnNotification.send("This message from phnone");

    }
}