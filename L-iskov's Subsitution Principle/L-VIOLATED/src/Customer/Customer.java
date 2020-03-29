package Customer;

abstract public class Customer {
    protected String name;
    protected int age;
    protected int rewardPoints;
    protected boolean registeredRewardsProgram;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
        this.rewardPoints = 0;
    }

    //Each derived customer class must implement these methods, and this doesn't make
    //sense with infrequent and returning customers because the benefits are different
    public void makePurchases(){}
    public int getRewardPoints(){
        return rewardPoints;
    }
    public void receiveOfferedDiscount() throws Exception {}
    public void invitationToNewProductTrials() throws Exception {}
    public void makePurchase() throws Exception {}
}
