import com.google.inject.ImplementedBy;
import com.google.inject.ProvidedBy;

@ProvidedBy(DiscountProvider.class)
public interface Discountable {
    double getDiscount();
}
