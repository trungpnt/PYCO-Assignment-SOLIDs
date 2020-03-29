package Client;

import Customer.Customer;
import Customer.LoyalCustomer;
import Customer.InfrequentCustomer;

public class ClientModule {
    public static void main(String [] args){
        Customer infreq = new InfrequentCustomer("tran thi a",15);
        infreq.makePurchases();
        System.out.println(infreq.getRewardPoints());

        Customer loyal = new LoyalCustomer("tran van b",20);
        loyal.makePurchases();
        System.out.println(loyal.getRewardPoints());

    }


}
