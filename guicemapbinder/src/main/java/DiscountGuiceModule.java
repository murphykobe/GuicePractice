import java.time.LocalTime;
import com.google.inject.Provides;
import com.google.inject.multibindings.MapBinder;
import java.util.Random;

public class DiscountGuiceModule extends com.google.inject.AbstractModule {

    @Override
    protected void configure(){

        MapBinder<Integer,Discountable> mapBinder = MapBinder.newMapBinder(binder(),Integer.class,Discountable.class);

        mapBinder.addBinding(0).to(BigDiscount.class);
        mapBinder.addBinding(1).to(SmallDiscount.class);
        mapBinder.addBinding(2).to(NoDiscount.class);
       //bind(Discountable.class).toProvider(DiscountProvider.class);
        bind(Random.class).toInstance(new Random());
        bind(Discountable.class).toProvider(DiscountProvider.class);
    }

}
