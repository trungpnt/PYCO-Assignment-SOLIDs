package Client;

import Notification.NotifyCustomers;
import Pizza.Pizza;
import PizzaFeatures.OrderPizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientModule {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String []args) {
        List<Pizza> pizzas = new ArrayList<Pizza>();
        Pizza pizza = new Pizza("tomato",20000,50);
        pizzas.add(pizza);
        OrderPizza orderPizza = new OrderPizza(1,"6:15pm",pizzas);

        NotifyCustomers notifyCustomers = new NotifyCustomers();
        int choice = sc.nextInt();
        //1 for email, 2 for sms, 3 for realtime
        System.out.println("Please enter the choice ");
        notifyCustomers.sendMsg(choice);
    }
}
