package practices.day_14_practice;

public class C01_Varargs {

    public static void main(String[] args) {

        /*
        parametre olarak bir int ve istediginiz kadar String olan bir method olusturun,
        en uzun String'in harf sayisi ile int parametre degeri carpıp sonucu yazdırın
         */

        int sayi=5;
        String str1="Zulal";
        String str2="Zeynep";
        String str3="Ali";

        carpim(sayi,str1,str2,str3);
    }

    // int varargs yapmaya gerek yok int 1 tane,string birden fazla onu varargs yapariz
    //bir method da varargs kullanacaksak once varargs disindakiler sonra varargs yazilir
    //bir methoda birden fazla varargs olamaz.

    private static void carpim(int sayi, String...str) {
        String enUzunKelime="";

        for (String each:str) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;

            }

        }
        System.out.println(enUzunKelime.length() * sayi);//30


    }


}
