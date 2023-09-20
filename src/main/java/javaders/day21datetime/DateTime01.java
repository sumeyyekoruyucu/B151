package javaders.day21datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

    public static void main(String[] args) {

        //Anlik zamani nasil aliriz?

        LocalTime myCurrentTime=LocalTime.now();
        System.out.println(myCurrentTime);//19:03:14.282874800// sondaki nano saniye

        //Anlik zamanda bilesenler nasil alinir?

        int hour=myCurrentTime.getHour();
        System.out.println(hour);//19

        int minute=myCurrentTime.getMinute();
        System.out.println(minute);//6

        int second= myCurrentTime.getSecond();
        System.out.println(second);//30

        int nano=myCurrentTime.getNano();
        System.out.println(nano);//186960700

        //Gelecek ve gecmis zamana nasil gidilir?
        LocalTime next=myCurrentTime.plusMinutes(23).minusSeconds(11);
        System.out.println(next);//19:35:03.439862600

        //Zaman formati nasil degistirilir?

        //"HH" 24'luk saat sistemini, "hh" 12'lik saat sistemini kullanir.
        //"hh:mm a" ifadesindeki " a" 12 lik saat sisteminde "AM", "PM" yazilmasini saglar
        //"ss" saniyeyi gosterir.
        //"mm" "minute" demektir. "MM" "month" demektir.

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("HH:mm:ss a");// buyuk H de 24 luk saat sistemini kullanir
        String formattedMyCurrentTime =dtf1.format(myCurrentTime); //a PM veya AM icin//nachm.(PM)
        System.out.println(formattedMyCurrentTime);//19.20("HH.mm")

        //Date formati nasil degistirilir?
        LocalDate myCurrentDate =LocalDate.of(2022,8,25);
        System.out.println(myCurrentDate);//2022-08-25

       //Tarihi ay/gun/yil sekline ceviriniz
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("MM/dd/yyyy");
                //buyuk M month kucuk m minute anlamina gelir
        String formattedMyCurrentDate = dtf2.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate);// 08/25/2022

        //Tarihi gun/ay isminin ilk 3 harfi/yil in son iki rakami sekline ceviribiz(25/aug/22)
        DateTimeFormatter dtf3 =DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedMyCurrentDate2= dtf3.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate2);//25/Aug./22

        // Tarihi gun/ay ismi/yil sekline ceviriniz . 25/august/22

        DateTimeFormatter dtf4 =DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formattedMyCurrentDate3= dtf4.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate3);//25/August/2022

        //Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?

        //tokyo da ayin kaci?

        LocalDate dateInTokyo= LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);//2023-03-17

        LocalDate dateInTashkent=LocalDate.now(ZoneId.of("Asia/Tashkent"));
        System.out.println(dateInTashkent);//2023-03-16

        //Tokyo da saat kac?

        LocalTime timeInTokyo=LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);//03:46:54.469293300

        // Berlin de saat kac?
        LocalTime timeInBerlin=LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeInBerlin);//19:49:18.883441

















    }
}
