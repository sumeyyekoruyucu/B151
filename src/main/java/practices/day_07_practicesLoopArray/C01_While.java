package practices.day_07_practicesLoopArray;

import java.util.Scanner;

public class C01_While {
    public static void main(String[] args) {
        // Kullanıcıdan sisteme bir rakam girmesini isteyiniz
        // kullanıcının girdigi sayının while loop kullanarak faktoriyelini bulunuz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir Rakam giriniz");

        int rakam=scan.nextInt();
        int i=1;
        int faktoriyel=1;
        while(i<=rakam){
            faktoriyel=faktoriyel*i;

            i++;
        }
        System.out.println(rakam + "!= " + faktoriyel);






















    }
}
