package Notification;

public class RealTimeNotification implements INotifitcationWay {

    @Override
    public void notifyCustomer() {
        System.out.println("Sending message to the customers when they're logged in");
    }
}
