package javaders.day11nestedifternaryswitch;

import java.util.Scanner;
public class NestedIf01 {


    /*
       Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
       Eger calisan kadinsa 60 yasindan buyukse "Emekli Olabilir "yazdirin
       Eger calisan erkek ise 65 yasindan buyukse "Emekli Olabilir" yazdiran.
     */

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Please enter your age...");
            int age = input.nextInt();

            System.out.println("Please enter your gender...");//male, female
            String gender = input.next();

            if(age<0 || age>120){

                System.out.println("Negative ages or ages greater than 120 are invalid");

            }else if(gender.equalsIgnoreCase("male")){//equalsIgnoreCase() icin male = Male = MALE = mAlE dir

                if(age>65){
                    System.out.println("Can be retired");
                }else{
                    System.out.println("Should work");
                }

            }else if(gender.equalsIgnoreCase("female")){

                if(age>60){
                    System.out.println("Can be retired");
                }else{
                    System.out.println("Should work");
                }

            }else{
                System.out.println("Undefined gender");
            }


        }


}
