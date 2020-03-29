package ShopOperationLogic;

import AdditionalService.IServiceOperation;
import Customer.Customer;
import Product.Product;

import java.util.List;

public class ShopOperation implements IServiceOperation {
    private List<Product> productsPurchased;
    private boolean deliveryChoice;
    private Customer a;
    //We have to add deliveryChoice here to see if the customer requests shipping or not
    public ShopOperation(List<Product> productsPurchased, boolean deliveryChoice,Customer a ) {
        this.productsPurchased = productsPurchased;
        this.deliveryChoice = deliveryChoice;
        this.a = a;
    }

    @Override
    public void calculateShippingCost() {
        System.out.println("Products prices + shipping cost = total ");
    }

    @Override
    public void getUsersDetails() {
        System.out.println("Successfully verified for " + a.getName());
    }

    @Override
    public boolean completed() {
        return true;
    }

    @Override
    public void processRequest() {
        //System.out.println("Processing request... but does he come to the shop or not ?");
        if(a.getDeliveryChoice() == false){
            processWithoutShipping();
        }
        else{
            processWithShipping();
        }
    }

    //We need two methods to use in different cases
    //What if in the future we have far more logic to add new benefits for shipping / non-shipping choices?
    private void processWithoutShipping(){
        getUsersDetails();
        boolean isShipped = completed();
        System.out.println("ok it is shipped" );
    }
    private void processWithShipping(){
        getUsersDetails();
        calculateShippingCost();
        boolean isShipped = completed();
        System.out.println("Well the shipper has successfully delivered!");
    }
}
