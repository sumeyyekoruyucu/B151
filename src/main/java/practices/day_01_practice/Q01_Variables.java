package practices.day_01_practice;

public class Q01_Variables {

    public static void main(String[] args) {
        //Bir variable baslat
        int age = 15;
        int number = 43;
        String isim = "Sumeyye";
        String askim = "Sumeyye";
        String evlendik = "artikEvliyiz";


        System.out.println("isim = " + isim);
        System.out.println(age);
        System.out.println("number = " + number);
        System.out.println("askim = " + askim);
        System.out.println("evlendik = " + evlendik);


        //Variable degerini kopyala
        int myAge = age;
        System.out.println("myAge = " + myAge);
        String onunIsmi = isim;
        System.out.println("onunIsmi = " + onunIsmi);
        String karicim = askim;
        System.out.println("karicim = " + karicim);

        //Ayni satirda coklu variabel deklare et
        int year = 2020, month = 9, day = 1;
        System.out.println("month = " + month);
        System.out.println("day = " + day);
        System.out.println("year = " + year);

        //bir variable degerini guncelle
        year = 2033;
        System.out.println("year = " + year);

        year = 1996;
        System.out.println("year = " + year);

        //Bir variable deklare et : x
        double x;

        //Bir variable baslat : Y
        double y = 55.41;

        //Baska bir variabel baslat : Z
        double z = 10;

        //x degiskenini y degiskenini ile baslat
        x = y;

        //Variable i guncelle
        x = 15.3;

        //Degiskeni yazdir
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }


}
