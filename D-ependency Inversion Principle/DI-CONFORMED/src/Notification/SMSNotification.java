package Notification;

public class SMSNotification implements INotifitcationWay{

    @Override
    public void notifyCustomer() {
        System.out.println("Sending SMS to the customer");
    }
}
