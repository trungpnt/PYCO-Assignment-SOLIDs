package PizzaFeatures;

import Notification.INotifitcationWay;
import Pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public class NotifyCustomers {
    List<Pizza> pizzas = new ArrayList<Pizza>();
    OrderPizza orderPizza = new OrderPizza(1,"12h36'",pizzas);
    //This class should only talk to an interface, without knowing the internal logic
    INotifitcationWay iNotifitcationWay;

    public void registerNotificationChannel(INotifitcationWay way){
        iNotifitcationWay = way;
    }
    public void sendMsg(){
        iNotifitcationWay.notifyCustomer();
    }

}
