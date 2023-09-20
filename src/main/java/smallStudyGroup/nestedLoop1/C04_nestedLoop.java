package smallStudyGroup.nestedLoop1;

import java.util.Scanner;

public class C04_nestedLoop {
    /*
    * * * * .
    * * * . .
    * * . . .
    * . . . .
    . . . . .
    */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen satir sayisi giriniz");
        int toplamSatir= scan.nextInt();
        for (int bulSatir = 1; bulSatir <=toplamSatir ; bulSatir++) {
            for (int i = 1; i <=toplamSatir-bulSatir ; i++) {
                System.out.print("* ");
            }
            for (int i = 1; i <=bulSatir ; i++) {
                System.out.print(". ");
            }
            System.out.println();
        }









    }
}
