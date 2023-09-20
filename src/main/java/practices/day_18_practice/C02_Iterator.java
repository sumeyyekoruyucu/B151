package practices.day_18_practice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class C02_Iterator {

    public static void main(String[] args) {

   /*
       Bir Set olusturunuz icerisine int elemanlar ekleyiniz.
       set'deki cift elemanları iterator ile siliniz
     */

        Set<Integer>st=new TreeSet<>(Arrays.asList(1,2,3,4,5));

        Iterator itr=st.iterator();//setlerde index yapisi yoktur bu sebeple iterator kullanilir.
        //list haric hicbir collection uyesinde index yapisi yoktur.

        while(itr.hasNext()){//yaninda eleman var mi kontrol ediyor.

            Object sayi=itr.next();//itr i bir adim ileri atar.uzerinden gectigi elemani dondurur.
            //integer kizardi object yaptik

            if ((Integer) sayi%2==0){//integer a cast ettik ki kizarikligi gitsin cunku yukarida object demistik
                itr.remove();
            }else{
                System.out.print(sayi + " ");
            }
            }

        }













    }

