package PizzaFeatures;

import Pizza.Pizza;

import java.util.List;

public class OrderPizza {
    private int id;
    private String time;
    private List<Pizza> pizzas;

    public OrderPizza(int id, String time, List<Pizza> pizzas) {
        this.id = id;
        this.time = time;
        this.pizzas = pizzas;
    }


}
