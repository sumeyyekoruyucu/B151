package javaders.day20arraylistdatetime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {

    /*
    ex 1: bir integer listte birbirine en yakin iki elemani bulunuz
    [12,23,10,19]  ==> 12 and 10

     */

    public static void main(String[] args) {

        List<Integer>nums= new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);
        System.out.println(nums);

       // Collections.sort(); methodu listedeki elemanlari natural order yapar
        // Array lerde Array.sort Arraylist lerde Collections.sort
        Collections.sort(nums);
        System.out.println(nums);

        int minDiff = nums.get(1)-nums.get(0);// mesela yani

        for (int i=1; i<nums.size() ; i++){
            minDiff=Math.min(minDiff, nums.get(i)-nums.get(i-1));
        }

        System.out.println(minDiff);

        for (int i=1; i< nums.size(); i++ ){
            if(nums.get(i)-nums.get(i-1) == minDiff){
                System.out.println(nums.get(i-1) + " and "+ nums.get(i));
            }
        }

















    }
}
