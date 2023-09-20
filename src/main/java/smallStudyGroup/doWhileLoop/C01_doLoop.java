package smallStudyGroup.doWhileLoop;

public class C01_doLoop {
    public static void main(String[] args) {
        //Soru 1) 5 ile 10 arasindaki(5 ve  10 dahil) sayilari  ayni satirda yazdirin
        //1.yol
        for (int i = 5; i <=10 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println("\n"+"******************");
        int a=5;
        //2.yol
        while (a<=10){
            System.out.print(a+" ");
            a++;
        }

        a=0;
        //3.yol
        System.out.println("\n"+"**********************");
        do {
            System.out.print(a+" ");
            a++;
        }while (a<=10);


    }
}
