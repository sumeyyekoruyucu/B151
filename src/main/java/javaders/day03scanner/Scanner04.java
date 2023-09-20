package javaders.day03scanner;

import java.util.Scanner;

public class Scanner04 {


    public static void main(String[] args) {
        //Kullanicidan iki sayi alip 4 iklem yapan ve iklemlerin sonuclarini ekrana yazdiran kodu yaziniz.


        Scanner input = new Scanner(System.in);

        System.out.println("Geben Sie bitte zwei Zahlen an...");

       double firstNumber = input.nextDouble();
       double secondNumber = input.nextDouble();

        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);












    }






}
