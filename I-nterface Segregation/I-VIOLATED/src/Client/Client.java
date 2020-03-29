package Client;

import Customer.Customer;
import Product.Product;
import ShopOperationLogic.ShopOperation;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args){
        List<Product> productsToBuy = new ArrayList<Product>();
        Customer customer = new Customer("Bobby",1,productsToBuy,false);
        ShopOperation shopOperation = new ShopOperation(productsToBuy,customer.getDeliveryChoice(),customer);
        shopOperation.processRequest();
    }
}
