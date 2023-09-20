package javaders.day33maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class HashMap01 {

    public static void main(String[] args) {

        String s="Hello Henry!";

        System.out.println(getTheNumOfOccuranceOfLetters(s));//{H=2, e=2, l=2, n=1, o=1, r=1, y=1}
    }

        //Example 1: Verilen bir String te hangi harfin kaç defa kullanıldığını veren method oluşturunuz.
        //      "Hello Henry!"  ==> H=2 , e=2, l=2 , o=1 , n=1 , r=1 , y=1

    public static TreeMap<String,Integer> getTheNumOfOccuranceOfLetters(String s){
        //Hashmap te olur ama alfabetik olsun dedik

        //Stringdeki harf disi karakterleri sil
       s= s.replaceAll("[^A-Za-z]","");

       //Gorunum sayilarini depolamak icin map olustur.

       TreeMap<String,Integer>numOfOccurance=new TreeMap<>();

        //Harfleri al
        String letters[]=s.split("");

        //for each loop

        for (String w:letters){

            Integer numOfOcc=numOfOccurance.get(w);//numOfOcc=numOfOccurance
            if (numOfOcc==null){
                numOfOccurance.put(w,1);
            }else{
                numOfOccurance.replace(w,numOfOcc+1);//var olan icin put yerine replace daha okunur.
            }
        }
        return numOfOccurance;
    }














}
