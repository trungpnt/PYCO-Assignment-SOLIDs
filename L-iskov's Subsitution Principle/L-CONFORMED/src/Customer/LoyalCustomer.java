package Customer;

public class LoyalCustomer extends Customer implements ReturningCustomer {
    public LoyalCustomer(String name, int age) {
        super(name, age);
    }
    //Benefits of returning customers
    @Override
    public void receiveOfferedDiscount() {
        System.out.println("receiving discount..");
    }

    @Override
    public void invitationToNewProductTrials() {
        System.out.println("Being invited");
    }

    @Override
    public void makePurchase() {
        System.out.println("Processing order");
        rewardPoints++;
    }
}
