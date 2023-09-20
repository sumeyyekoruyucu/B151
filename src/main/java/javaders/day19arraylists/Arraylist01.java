package javaders.day19arraylists;

import javaders.day15loopsarrays.Arrays01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist01 {
    /*
    1) ayni data tipindeki coklu datalari depolamak icin  Array kullaniriz
    2)Array lerin bir negatif yani var; icine koyacaginiz eleman sayisini en basta belirlemek zorundasiniz
    3)Array ler eleman sayisinda esnek degillerdir. bu yuzden java "Arraylist" adli yeni bir yapi olusturdu.
    bu yapi eleman sayisinda esnektir.Hic eleman koymazsaniz eleman sayisini sifir olarak ayarlar.
    1000 eleman koyarsaniz eleman sayisini 1000 olarak ayarlar
    4) "Arraylist" yerine sadece "list" de diyebiliriz
    5)java Arraylist" leri olusturduktan sonra array leri iptal etmedi cunku;
        i) Array ler super hizlidir
        ii) Array ler memory de coook az yer kaplar.
        //bazi sayilar hep aynidir..ör; ay ,gun isimleri vs bunlarda array kullanilir
    6)Array ler primitive data tipleri ve reference lari depolayabilir
    ama Arraylist ler non primitive data type larini depolar bu yuzden Arraylistler Arraylerden daha cok yer kaplar
     */
    public static void main(String[] args) {

      // Arraylist nasil olusturulur?
        ArrayList<Integer>ages = new ArrayList<>();// int yazsan hata verir ustunde bekle
        // asagidaki opsiyonda duzeltme var ona tikla

        // arraylist console a nasil yazdirilir
        System.out.println(ages);//[]

        //Arrayliste nasil eleman eklenir?
        //1.way
        ages.add(12);
        ages.add(24);
        System.out.println(ages);//[12,24]
        ages.add(9);// add methodu elemanlari giris sirasina(insertion order) gore list e yerlestirir
        System.out.println(ages);//[12,24,9]

        //2.way
        ages.add(1,99);//istedigin yere istedigin elemani yerlestirebilirsin
        System.out.println(ages);//[12, 99, 24, 9]

        ArrayList<Integer>price = new ArrayList<>();
        price.add(23);
        price.add(33);

        //3.yol:addAll()methodu bir list i diger bir list in icine yerlestirir.su an sona gelir.
        // 4. yolda istedigimiz yere yapcaz
        ages.addAll(price);
        System.out.println(ages);//[12, 99, 24, 9, 23, 33]

        //4.yol
        ages.addAll(3,price);
        System.out.println(ages);//[12, 99, 24, 23, 33, 9, 23, 33]

        // Arraylist te eleman sayisi nasil bulunur
        int numOfElementv=ages.size();// size() bir list teki eleman sayisini verir
        System.out.println(numOfElementv);//8

        //Arraylist te specific bir eleman nasil alinir?
        int el1= ages.get(3);//get()methodu index kullanarak istedigimiz elemani almaya yarar
        System.out.println(el1);//23

        //programlama dillerinde set() var olan elemanlari degistirmeye yarar
        ages.set(6,111);//6. indexdeki sayiyi 111 yap
        System.out.println(ages);//[12, 99, 24, 23, 33, 9, 111, 33]

        // Arraylist te specific bir elemanin var olup olmadigini nasil control ederiz
        boolean r1= ages.contains(99);
        System.out.println(r1);//true

        //bir Arraylist in bos olup olmadigini nasil kontrol ederiz
        boolean r2= ages.isEmpty();//bos mu?
        System.out.println(r2);//false

        //bir Arraylist teki tum elemanlari nasil sileriz
        ages.clear();
        System.out.println(ages);//[]

        boolean r3= ages.isEmpty();
        System.out.println(r3);//true

        //ex 1:Bir list in bos olup olmadigini kontrol eden kodu yaziniz
        ArrayList<String>names= new ArrayList<>();
        names.add("Ajda");
        names.add("cuneyt");
        names.add("Angelina");
        names.add("Brad");


        //1.Way:
        if(names.size()==0){
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least 1 element");
        }

        //2.Way: Recommended
        if(names.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least 1 element");
        }


        //practices de boyle birsey ogrendik
        //List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
    }
}
