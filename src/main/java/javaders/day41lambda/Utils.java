package javaders.day41lambda;

public class Utils { //sik kullanilanlar
    //faydali methodlarin kullanildigi yer
    //Bu class i direk java genel package de olustursak iyi ama bi sorun cikti ayni package a koyduk
    //day41 de
    //kare alma, cift mi tek mi vs. method eklemek ve bunlari method reference olarak kullanmak icin olusturduk

    public static int getSquare(int a){
        return a*a;
    }

    public static boolean isOdd(int a){
        return a%2!=0;
    }
    public static boolean isEven(int a){
        return a%2==0;
    }
    public static int getSumOfDigits(int a){

        int sum =0;

        while (a>0){

            sum += a%10;

            a = a/10;

        }
        return sum;

    }
}
//Utils applicationda sik kullanilanlarin depolandigi class'tir