package Customer;

public class InfrequentCustomer extends Customer  {

    public InfrequentCustomer(String name, int age) {
        super(name, age);
    }

    @Override
    public void makePurchases() {
        super.makePurchases();
    }

    @Override
    public int getRewardPoints() {
        return super.getRewardPoints();
    }

    @Override
    public void receiveOfferedDiscount() throws Exception {

    }

    @Override
    public void invitationToNewProductTrials() throws Exception {

    }

    @Override
    public void makePurchase() throws Exception{

    }
}
