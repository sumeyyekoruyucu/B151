package smallStudyGroup.doWhileLoop;

import java.util.Scanner;

public class C03_doLoop {
    public static void main(String[] args) {
        // kullanicidan istedigi kadar sayi girmesini isteyin
        // kullanicinin girdigi sayilarin toplami 500'u gecerse
        // artik yeter cok sayi girdin, toplam.... oldu yazsin

        Scanner scan=new Scanner(System.in);

        int sayi=0;
        int toplam=0;

        do {
            System.out.println("lutfen toplamak istediginiz sayilari giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
        }while (toplam<500);

        System.out.println("toplam sayi bu kadar oldu yeter artık kapasitemi asiyor : "+toplam);

    }
}
