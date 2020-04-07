import com.google.inject.Inject;
import com.google.inject.Provider;


public class CheckoutService {

    private final Discountable discountable;

    @Inject
    public CheckoutService(Discountable discountable){
        this.discountable = discountable;
    }

    public double Checkout(double shoppingCartTotal){
        double totalAfterDiscount = shoppingCartTotal *(1 - discountable.getDiscount());
        System.out.printf("%nShopping Cart initially [$%.2f] with a discount of %.2f%% = [$%.2f]%n%n", shoppingCartTotal,discountable.getDiscount()*100,totalAfterDiscount);

        return totalAfterDiscount;
    }

}
