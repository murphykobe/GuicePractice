
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Inject;

public class BasicApplication {

    private final CheckoutService checkoutservices;

    @Inject
    public BasicApplication(CheckoutService checkoutService){
        this.checkoutservices = checkoutService;
    }

    void start(){
        checkoutservices.Checkout(100.00D);
    }
    public static void main(String[] args){
        Injector guice = Guice.createInjector(new DiscountGuiceModule());
        BasicApplication application = guice.getInstance(BasicApplication.class);
        application.start();

    }

}
