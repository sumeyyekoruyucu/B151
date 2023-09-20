package javaders.day12switchincrementdecrementloops;

import java.util.Scanner;

public class Switch01 {
    /*
    Ay numarasi verildiginde numarasi verilen ay'in ismini ve decembere kadar kitum aylarin isimlerini konsola yazdiran kodu yaziniz
     */
    /* not: Switch parantezi icinde "String","int","byte","short","char" kullanilabilir
    "boolean","float","double,"long" kullanilamaz */
    public static void main(String[] args) {
        int monthNumber=3;

        switch (monthNumber){
            case 1:
                System.out.println("January");
               // break;
            case 2:
                System.out.println("February");
               // break;
            case 3:
                System.out.println("March");
               // break;//break koymazsan sonrakileri de calistirir break gorene kadar
            case 4:
                System.out.println("April");
               // break;
            case 5:
                System.out.println("May");
              //  break;
            case 6:
                System.out.println("June");
               // break;
            case 7:
                System.out.println("July");
               // break;
            case 8:
                System.out.println("August");
               // break;
            case 9:
                System.out.println("September");
                // break;
            case 10:
                System.out.println("Oktober");
               // break;
            case 11:
                System.out.println("November");
                // break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number");

        }






    }
}
