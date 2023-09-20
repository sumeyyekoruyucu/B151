package smallStudyGroup.switch1;
import java.util.Scanner;
public class C04_switch {
    public static void main(String[] args) {
        //Ayakkabi Boyutu kontrol etmek için Java Programı
        //switch...case ifadesini kullanarak
        //Boyutu icin size ler: small -Medium- Large- Extra -Large-unKnown-
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 35~50 arasi bir ayakkabi numarasi giriniz");
        int ayakkabiNo = scan.nextInt();
        switch (ayakkabiNo){
            case 35:
            case 36:
            case 37:
            case 38:
                System.out.println("Small");
                break;
            case 39:
            case 40:
            case 41:
            case 42:
                System.out.println("Medium");
                break;
            case 43:
            case 44:
            case 45:
            case 46:
                System.out.println("Large");
                break;
            case 47:
            case 48:
            case 49:
            case 50:
                System.out.println("Extra Large");
                break;
            default:
                System.out.println("lutfen gecerli bir ayakkabi numarasi giriniz");

        }

        if (ayakkabiNo<35||ayakkabiNo>50){
            System.out.println("lutfen gecerli bir deger giriniz");
        } else if (ayakkabiNo<39) {
            System.out.println("Small");
        } else if (ayakkabiNo<44) {
            System.out.println("medium");
        }else if (ayakkabiNo<47){
            System.out.println("large");
        }else
            System.out.println("Extra large");

    }


}
