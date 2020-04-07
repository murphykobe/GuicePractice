import java.time.LocalTime;
import com.google.inject.Provides;

public class DiscountGuiceModule extends com.google.inject.AbstractModule {

    @Override
    protected void configure(){
       //bind(Discountable.class).toProvider(DiscountProvider.class);
    }


//    @Provides
//    public Discountable get(){
//        int hour = LocalTime.now().getHour();
//
//        if(isEarlyMorning((hour))){
//            return new EarlyBirdDiscount();
//        }
//        if(isLateNight(hour)){
//            return new NightOwlDisocunt();
//        }
//        return new NoDiscount();
//
//    }
//    private  boolean isEarlyMorning(int currHour){
//        return (currHour >= 5 && currHour <= 9 );
//    }
//
//    private  boolean isLateNight(int currHour){
//        return (currHour >=0 && currHour <=4 );
//    }

}
