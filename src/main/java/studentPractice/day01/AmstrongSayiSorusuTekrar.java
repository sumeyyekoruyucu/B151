package studentPractice.day01;

public class AmstrongSayiSorusuTekrar {
    /*
        amstrong sayıları bulan bir program yazalim
        153 = (1*1*1)+(5*5*5)+(3*3*3)
        153= 1+125+27
        153=153

    153bir Amstrong sayidir
    370bir Amstrong sayidir
    371bir Amstrong sayidir
    407bir Amstrong sayidir
                 */
      /*Basamaklara ayirma
            123%10=3 ==> birler
            123/10=12
            12%10=2 ==>onlar
            12/10=1
            1%10=1 ==> yuzler

             */
    public static void main(String[] args) {


        for (int i=100;i<1000;i++){
            int sayi=i;
            int toplam=((sayi%10)*(sayi%10)*(sayi%10))+((sayi/10%10)*(sayi/10%10)*(sayi/10%10))+((sayi/100)*(sayi/100)*(sayi/100));
            if (sayi==toplam){
                System.out.println(toplam);
            }
        }


        /*
        hocanin
        public static void main(String[] args) {
        for( int i=100; i<=999; i++){
            int template=i;
            int birler;
            int onlar;
            int yuzler ;

            //basamaklara ayırma
            birler = template%10;
            template = template/10;
            onlar = template%10;
            template/=10;
            yuzler = template%10;

            // toplam =Math.pow(birler,3)+Math.pow(onlar,3)+Math.pow(yuzler,3);
            int toplam = (birler*birler*birler)+(onlar*onlar*onlar)+(yuzler*yuzler*yuzler);

            if (toplam ==i){
                System.out.println(i+ " Bir Amstrong sayidir");
            }
         */
    }



}
