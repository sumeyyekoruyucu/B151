package smallStudyGroup.switch1;

import java.util.Scanner;

public class C02_switch {
    public static void main(String[] args) {
        // Kullanicidan kacinci ay oldugunu alip mevsimi yazdiran bir
        // switch olusturun

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kacıncı ay oldugunu giriniz");
        int ayNo= scan.nextInt();

        switch (ayNo){
            case 12:
                System.out.println("ay adi : aralik");
                System.out.println("mevsim adi : kiş");
                break;
            case 1:
                System.out.println("ocak");
                System.out.println("kiş");
                break;
            case 2:
                System.out.println("subat");
                System.out.println("kiş");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz");

                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonbahar");
                break;
            default:
                System.out.println("lutfen gecerli bir ay numarasi giriniz");

        }

    }
}
