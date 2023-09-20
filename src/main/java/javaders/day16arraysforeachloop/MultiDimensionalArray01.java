package javaders.day16arraysforeachloop;

import java.util.Arrays;

public class MultiDimensionalArray01 {//cok boyutlu Array(ic ice array. genellikle 2 boyutlu kullanilir)
    public static void main(String[] args) {
        // Bazen Array in icine eleman olarak Array koyarlar
        // arr[][]=[[5,2],[11,23],[38,41]]  //arr[0][1]=2  , arr[2][0]=38

        /*
        Bir Arrayin elemanlari da array olursa bu tarz array lere multidimensional Array denir
         */

        //"Multidimensional Array" nasil olusturulur?
        String names[][]=new String[3][2];

        //"Multidimensional Array" e nasil eleman eklenir?
        names[1][0]="P";
        names[2][1]="Z";
        names[0][0]="A";
        names[0][1]="K";
        names[1][1]="M";
        names[2][0]="C";

        //"Multidimensional Array"leri console yazdirmak icin "toString()" methodu; degil "deepToString()"methodunu kullaniriz
        System.out.println(Arrays.deepToString(names));//[[A, K], [P, M], [C, Z]]

        //Multidimensional Array icinden specific bir eleman nasil yazdirilir.
        // arrayin tamami icin deepToString()",ama specific String icin sadece string ismi indexleriyle
        System.out.println(names[1][1]);//M


        //Multidimensional Array icindeki bir Array i yazdirmak(normal onceki gibi toString)
        System.out.println(Arrays.toString(names[0]));//[A, K]
        System.out.println(Arrays.toString(names[1]));//[P, M]

        //Kisa yoldan "Multidimensional Array" nasil olusturulur?
        String students[][]={{"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"}};
        // usttekinin data tipine string Array diyoruz String[] ile gosteriyoruz

        //ilk yaptigimiz Array de direk index girdigimiz icin icerdeki Arraylerde hep ayni sayida eleman koymak zorundayiz
        // Ama kisa yoldan da eleman sayisina biz karar veriyoruz.

        //Ex 1: yukaridaki students array inde toplam kac isim oldugunu bulunuz.
        // 1. arraya git eleman sayisini al,2.arraya git eleman sayisini al ,3.arraya git eleman sayisini al yani tekrarli

        int sum=0;
        for(String[] w :students){
            sum=sum+w.length;

        }
        System.out.println(sum);//8 (2+1+3+2)
        //bu loop ta ilk indexden baslayip tek tek kendi otomatik bakiyor. hepsini ayni anda almiyor

        //Ex 2: Yukaridaki students Array inde icinde "m" olan isimleri console a yazdiriniz
        // herbir Array in icinde tekrarli islem yaptigimiz icin  nested loop(ic ice loop kullancaz). Bu looplar da tabiki for each olacak

        for (String[] w: students){ //ilkini array olarak aliyoruz
            for (String k:w){ //ikinciyi array icindeki elaman olarak
                if (k.contains("m")){
                    System.out.println(k);
                }
            }

        }

        //Ex 3:bir integer multidimensional array olusturunuz tum elamanlarin carpimini hesaplayiniz
        int nums[][]={{5,4},{2,3,2},{7}};
        int result=1;
        for (int [] w: nums){
            for (int k:w){
                result=result*k;
            }
        }
        System.out.println(result);//1680

        //Ex 4:iki boyutlu bir arrayi tek boyutlu bir array e ceviriniz
        int numbers[][]={{5,4},{2,3,2},{7}}; // {5,4,2,3,2,7}

        //1.step iki boyutlu Arrayde kac eleman oldugunu bulan kodu yazmaliyiz
        int toplamElemanSayisi=0;
        for (int[] w:numbers){
            toplamElemanSayisi=toplamElemanSayisi+w.length;
        }

        //2.step tek boyutlu array i iki boyutlu array in eleman sayisini kullanarak olusturmaliyiz
        int newArr[]=new int[toplamElemanSayisi];

        //3.step iki boyutlu Arrayde ki elemanlari tek boyutlu array e transfer etmeliyiz
        int idx=0;

        for (int[] w:numbers){
            for (int k:w){
                newArr[idx]=k;
                idx++;

            }
        }
        System.out.println(Arrays.toString(newArr));//[5, 4, 2, 3, 2, 7]

        //Ex 5: Bir integer multidimensional arraydeki en kucuk ve en buyuk elemanin toplamini bulunuz

        int ages[][]={{15,4},{12,43,21},{7}};//47

        int small=ages[0][0];//bu sadece bir kabul istersen baska bir elemana en kucuk de
        int big=ages[0][0];
        for (int[] w: ages){
            for (int k:w){
               small= Math.min(small,k);
               big= Math.max(big,k);

            }
        }
        System.out.println(big+small);





























    }
}
