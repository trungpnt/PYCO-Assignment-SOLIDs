package Client;

import Notification.EmailNotification;
import Notification.RealTimeNotification;
import Notification.SMSNotification;
import Pizza.Pizza;
import PizzaFeatures.NotifyCustomers;
import PizzaFeatures.OrderPizza;

import java.util.ArrayList;
import java.util.List;

public class ClientModule {
    public static void main(String []args){
        List<Pizza> pizzas = new ArrayList<Pizza>();
        Pizza pizza = new Pizza("tomato",20000,50);
        pizzas.add(pizza);
        OrderPizza orderPizza = new OrderPizza(1,"6:15pm",pizzas);

        NotifyCustomers notifyCustomers = new NotifyCustomers();
        notifyCustomers.registerNotificationChannel(new SMSNotification());
        notifyCustomers.registerNotificationChannel(new RealTimeNotification());
        notifyCustomers.registerNotificationChannel(new EmailNotification());

        notifyCustomers.sendMsg();
    }
}
