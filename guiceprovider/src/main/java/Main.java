import com.google.inject.Guice;
import com.google.inject.Injector;


public class Main {

    public static void main(String[] args){
        Injector guice = Guice.createInjector(new DiscountGuiceModule());
        CheckoutService service = guice.getInstance(CheckoutService.class);

        service.Checkout(100.00D);
    }

}
