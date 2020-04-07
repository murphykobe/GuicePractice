import com.google.inject.Provider;
import java.time.LocalTime;

public class DiscountProvider implements Provider<Discountable>{

    private  boolean isEarlyMorning(int currHour){
        return (currHour >= 5 && currHour <= 9 );
    }

    private  boolean isLateNight(int currHour){
        return (currHour >=0 && currHour <=4 );
    }

    @Override
    public Discountable get(){
        int hour = LocalTime.now().getHour();

        if(isEarlyMorning((hour))){
            return new EarlyBirdDiscount();
        }
        if(isLateNight(hour)){
            return new NightOwlDisocunt();
        }
        return new NoDiscount();
    }

}
