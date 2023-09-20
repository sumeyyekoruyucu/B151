package javaders.day44lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InterviewQuestion {
    public static void main(String[] args) {

        //ex 1: size verilen bir array in "Mountain(dag,tepe) Array" olup olmadigini gosteren kodu yaziniz.
        //             [0,2,5,3,1,-2]

        int[]arr={0,2,5,1,-2};
        //Array i liste cevirelim cunku listte cok method var listi kullanmak daha kolay

        List<Integer>myList=new ArrayList<>();
        Arrays.stream(arr).forEach(t->myList.add(t));
        //forEach her bir elemani alip benim listime ekliycek.
        //forEach sadece yazdirmada deghil her islemde kullanila bilir akistaki elemanlri liste ekledik burda
        System.out.println(myList);//[0, 2, 5, 3, 1, -2]

       //listteki max elemani bulalim
       int max= myList.stream().reduce(Math::max).get();
       System.out.println(max);//5

        //list teki max elemanin indexini bulalim

        int idxOfMax=myList.indexOf(max);
        System.out.println(idxOfMax);//2

        //max elemana kadar ki tum elemanlari bir listin icine koy,kopy yap,sort ile sirala copy si ilkiyle ayni mi kontrol et

        List<Integer>firstList=new ArrayList<>();
        myList.stream().filter(t->myList.indexOf(t)<=idxOfMax).forEach(t->firstList.add(t));
        System.out.println(firstList);//[0, 2, 5]

        List<Integer>firstListCopy=new ArrayList<>();
        firstList.stream().forEach(t->firstListCopy.add(t));
        System.out.println(firstListCopy);//[0, 2, 5]

        Collections.sort(firstListCopy);

        boolean rule1=firstList.equals(firstListCopy);
        System.out.println(rule1);//true

        //max elemandan sonraki tum elemanlari bir listin icine koy,kopy yap,sort ile sirala copy si ilkiyle ayni mi kontrol et
        List<Integer>secondList=new ArrayList<>();
        myList.stream().filter(t->myList.indexOf(t)>=idxOfMax).forEach(t->secondList.add(t));
        System.out.println(secondList);//[5, 1, -2]

        List<Integer>secondListCopy=new ArrayList<>();
        myList.stream().filter(t->myList.indexOf(t)>=idxOfMax).forEach(t->secondListCopy.add(t));
        System.out.println(secondListCopy);//[5, 1, -2]

        Collections.sort(secondListCopy);
        Collections.reverse(secondListCopy);
        System.out.println(secondListCopy);

        boolean rule2=secondList.equals(secondListCopy);
        System.out.println(rule2);//true

        System.out.println("Is the array mountain array? "+ (rule1&&rule2));
        //Is the array mountain array? true





    }
}
