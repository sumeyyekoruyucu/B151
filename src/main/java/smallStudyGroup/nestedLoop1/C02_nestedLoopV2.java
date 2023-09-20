package smallStudyGroup.nestedLoop1;

public class C02_nestedLoopV2 {
    /*
           12345678910
           123456789
           12345678
           1234567
           123456
           12345
           1234
           123
           12
           1
     */
    public static void main(String[] args) {
        int input=10;
        for (int i = input; i >=1 ; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
