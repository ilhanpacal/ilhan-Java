package zelda;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class date {

    public static void main(String[] args) {


      LocalTime localSaat =LocalTime.now(ZoneId.of("Turkey"));
        System.out.println(localSaat); // 22:59:58.540941600

        LocalTime localSaat1= LocalTime.now(ZoneId.of("London"));
        System.out.println(localSaat1);

    }
}
