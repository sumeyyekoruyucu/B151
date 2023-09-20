package practices.day_01_practice;

public class C01_BasamaklaraAyirma {

    public static void main(String[] args) {

        // 12345 sayısının rakamları toplamını bulunuz

        int x=12345;
        int birler=x%10;
        int onlar=(x/10)%10;
        int yuzler=(x/100)%10;
        int binler=(x/1000)%10;
        int onbinler=(x/10000);
        System.out.println(birler+onlar+yuzler+binler+onbinler);

    }
}
