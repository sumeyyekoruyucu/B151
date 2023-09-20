package studentPractice.day02;

public class Factorial {
    public static void main(String[] args) {

        //Verilen bir sayının faktoriyelini Recursion ile bulunuz.. Recursive method

        int d = 5; // 1*2*3*4*5

        System.out.println(factoriyeliBul(10));

    }

    public static long factoriyeliBul(int sayi){
        if(sayi == 0 || sayi == 1)
            return 1;
        else
            return (sayi * factoriyeliBul(sayi-1));
    }
}
