package Customer;

public class LoyalCustomer extends Customer  {
    public LoyalCustomer(String name, int age) {
        super(name, age);
    }
    //Benefits of returning customers

    @Override
    public int getRewardPoints() {
        return super.getRewardPoints();
    }

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
