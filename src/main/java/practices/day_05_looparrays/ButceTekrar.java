package practices.day_05_looparrays;

public class ButceTekrar {
    // Tum aile uyelerinin birikiminin
    // bulundugu ortak ihtiyaclar icin
    // kullanildigi bir butce ile kisisel
    // harcamalarin yapildigi
    // harclik'larin oldugu basit bir ev bütçesi kodu yazınız.

    public static int butce1;

    public int harclik1;

    public void maas(int alinanMaas){butce1+=alinanMaas;}
    public void alharclik(int alinanHarclik){
        butce1-=alinanHarclik;
        harclik1+=alinanHarclik;
    }
    public void harHarclik(int harcananHarclik){harclik1-=harcananHarclik;}

    public void butcedenHarcama(int harcanacanPara){butce1-=harcanacanPara;}






}
