package smallStudyGroup.nestedLoop1;

public class C01_nestedLoop {
    public static void main(String[] args) {
        // asagdaki sekli nestedsiz loop ile yazdiran bir program yaziniz.
        /*
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         */
        //1.yol
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
        System.out.println("* * * * * *");
        System.out.println("-----------------------------------------");
        //2. yol
        for (int i = 1; i <=6 ; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i <=6 ; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i <=6 ; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i <=6 ; i++) {
            System.out.print("* ");
        }
        System.out.println();
        System.out.println("----------------------------------");
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=6 ; j++) {
                System.out.print("* ");
            }System.out.println();
        }

    }
}

