package practices.day_05_looparrays;

public class MaymunAliveTekrar {
    /*
    Adada yalnız bir maymun var
      Her gün 4 muz yemesi gerekiyor
    o adada sadece 165 muz var
    Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.

     */

    public static void main(String[] args) {

        int ms=165;
        int counter=1;
        int kms=165;

        for (int i=1 ; i<=165/4 ; i++) {
            kms = kms - 4;
            System.out.println("Bugun " + counter + ". gun; Maymun hala yasiyor");
            System.out.println("Kalan Muz Sayisi " + kms);
            counter++;
        } if (kms<4){
            System.out.println("Bugun " + counter + ".gun Yeterli muz kalmadi Maymun rahmetli.Rest in Peace");
        }


        /* Hocanin cozumu

        int numberOfBananas = 165;
        int survivalDays = 1;
        boolean monkeyAlive = true;
        System.out.println("Bugun " + survivalDays + " .gun; maymun yasiyor ");

        do {
            numberOfBananas -= 4;//toplam muz sayisinda her gun 4 muz eksilir
            System.out.println("Kalan Muz Sayis " + numberOfBananas);
            survivalDays++;
            if (numberOfBananas < 4) {
                monkeyAlive = false;
                System.out.println("Bugun " + survivalDays + ".gun Yeterli muz kalmadi Maymun rahmetli.Rest in Peace");
            } else {
                System.out.println("Bugun " + survivalDays + " .gun; Maymun hala yasiyor");
            }
        } while (monkeyAlive);

         */












    }
}


