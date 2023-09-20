package javaders.day21datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataTime02 {

    public static void main(String[] args) {

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);//2023-03-16T20:03:26.719153700

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("M/dd/yyyy - hh:mm a");
        String formattedLdt = dtf1.format(ldt);

        System.out.println(formattedLdt);// 3/16/2023 - 08:09 nachm.






    }
}
