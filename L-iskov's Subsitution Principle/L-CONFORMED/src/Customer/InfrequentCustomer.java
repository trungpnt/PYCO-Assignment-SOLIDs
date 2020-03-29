package Customer;

public class InfrequentCustomer extends Customer  {

    public InfrequentCustomer(String name, int age) {
        super(name, age);
    }

    @Override
    public void makePurchases() {
        System.out.println("processing order");
    }
}
