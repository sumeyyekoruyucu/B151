package javaders.day15loopsarrays;

import com.sun.jdi.IntegerValue;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        /* 1) Array, Java nin ayni data tipinde  coklu data depolamak icin  olusturdugu bir yapidir.ör:ögrenci notlari
           2) Array in icine farkli data tipleri koyamazsiniz.
           3) Array lerde [] kullaniriz sagda ve solda . kac data koyacagimizi yeni stringdeki,sagdaki [] icine koyariz
        */
        //Arrayler primtive data typleri veya "referencelar" ile calsir
        // String non primitive ama onun stack deki reference ini barindiriyor
        // Array ler "super fast" dir ve memory de "cok az" yer kaplar



        //Array nasil olusturulur?

        String stdNames[]=new String[5];


        //Array nasil yazdirilir?
        //System.out.println(stdNames)
        //Array den almayip direk stdNames yazarsak stack data daki adresini verir//[Ljava.lang.String;@49e4cb85

        System.out.println(Arrays.toString(stdNames));// Array den aldik ama daha indexlere eleman girmedik
        // [null, null, null, null, null]
        // nullar Stringin default degeridir.
        // int olsaydi 0 gorcektik sayilar icin default deger 0 dir. butun numerikler icin 0
        // boolean icin default deger false dur
        // deger girmedigimiz icin default deger yazdirdi

        //Array e nasil eleman eklenir
        stdNames[0]="Ajda";//[Ajda,null,null,null,null]
        // Array lar index kullanir
        stdNames[3]="Cuneyt";//[Ajda, null, null, Cuneyt, null]
        stdNames[2]="Kemal";
        stdNames[1]="Ayhan";
        stdNames[4]="Filiz";
        System.out.println(Arrays.toString(stdNames));//[Ajda, Ayhan, Kemal, Cuneyt, Filiz]

        //Array deki specific bir elemani nasil alabiliriz?
        System.out.println(stdNames[3]);

        //Example 1: stdNames array indeki her ismin sonuna yildiz koyarak cansole a yazdir
        //1.way
        for (int i=0; i<stdNames.length; i++){ //length Stringlerde parantezli Arraylarde parantezsiz kullanilir
            System.out.println(stdNames[i]+"*");

        }
        // length burda variable method degil.Variable degeri en basta biz belirledik 5 diye.java hesaplamadi

        //2.way: for-each loop==>Enhanced(Zenginlestirilmis) loop - mumkunse hep for-each loop kullanin
        // for each loop ilk 3 bolumu javaya yaptirir.biz data tipini,ismini yazariz.bu loop da genellikle w yu kullaniriz
        for(String w: stdNames){
            System.out.println(w+"*");
        }
        // bu hep bastan sona otamatik yazdirir sondan basliycaksak bunu kullanamayiz
        //Arrayin ,collection olmadigi yerde for-each kullanmayiz
        //Array oldugunu [] den anlariz

        // ex 2: Bir integer Array olusturunuz, 5 eleman ekleyiniz elemanlarin toplamini bulup console a yazdiriniz
        int ages[]=new int[5];
        ages[0]=12;
        ages[1]=23;
        ages[2]=9;
        ages[3]=38;
        ages[4]=27;
        System.out.println(Arrays.toString(ages));//[12, 23, 9, 38, 27]

        int sum=0;

        for (int w : ages){
            sum=sum+w;
        }
        System.out.println(sum);//109

        //Example 3: Bir char Array olusturunuz 3 eleman ekleyiniz bu elemanlarin carpimini yazdiriniz

        char initials[]=new char[3];
        initials[0]='J';//74
        initials[1]='P';//80
        initials[2]='A';//65
        int carpim=1; //carpmanin etkisiz elemani old icin
        for (char w: initials){
            carpim=carpim * w; //char i matematiksel islemde kullanirsaniz java onun ascii degerini alir


        }
        System.out.println(carpim);//384800



















    }
}
