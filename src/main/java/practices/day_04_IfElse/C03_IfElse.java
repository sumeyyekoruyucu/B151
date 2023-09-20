package practices.day_04_IfElse;

import java.util.Scanner;

public class C03_IfElse {
    public static void main(String[] args) {
        /*
Kullanıcıdan ayrı ayrı iki kelime sisteme girmesini isteyin.
Eger İlk kelimenin karakter sayısı çift ise,
 ikinci kelimeyi birinci kelimenin ortasına koyun.
İlk kelimenin karakter sayısı tek ise, konsola
"ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli" yazdırın.
*/
        Scanner input=new Scanner(System.in);

        System.out.println("Lutfen birinci kelime giriniz");
        String ilk=input.next();
        System.out.println("Lutfen ikinci kelimeyi giriniz");
        String ikinci=input.next();
        if (ilk.length()%2==0){
          String ilkYarisi= ilk.substring(0,ilk.length()/2);
          String sonYarisi=ilk.substring(ilk.length()/2);
            System.out.println(ilkYarisi+ikinci+sonYarisi);//veysümeyyesel
        }else{
            System.out.println("ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli");

        }



























    }
}
