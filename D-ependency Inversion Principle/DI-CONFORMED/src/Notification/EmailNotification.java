package Notification;

public class EmailNotification implements INotifitcationWay {
    @Override
    public void notifyCustomer() {
        System.out.println("Sending email to the customer");
    }
}
