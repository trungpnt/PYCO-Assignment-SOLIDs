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

    public void makePurchases(){}
    public int getRewardPoints(){
        return rewardPoints;
    }
}
