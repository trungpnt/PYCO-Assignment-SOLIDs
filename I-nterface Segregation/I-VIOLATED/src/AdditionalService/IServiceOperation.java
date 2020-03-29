package AdditionalService;

public interface IServiceOperation {
    void calculateShippingCost();
    //Not always necessary to calculate shipping cost!
    void getUsersDetails();
    void processRequest();
    boolean completed();
}
