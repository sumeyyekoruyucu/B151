package javaders.day45lambda;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

       elemanlariYazdir1(nums);
        System.out.println();
       elemanlariYazdir2(nums);
        System.out.println();
       ciftElYazdir1(nums);
        System.out.println();
       ciftElYazdir2(nums);
        System.out.println();
        tekElKareYazdir(nums);
        System.out.println();
        tekElKüpTekrarsizYazdir(nums);
        System.out.println();
        System.out.println(distinctCiftElKareTop(nums));
        System.out.println(distinctCiftElKareCarp(nums));
        maxDeger(nums);
        System.out.println(listeninMaxElemani(nums));
        System.out.println(listeninMaxElemani2(nums));
        listeninMaxElemani3(nums);
        listeninMaxElemani4(nums);
        minDeger(nums);


    }

    //1)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void elemanlariYazdir1(List<Integer>nums){
        for(Integer w:nums){
            System.out.print(w+" ");
        }
    }

    //2)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void elemanlariYazdir2(List<Integer>nums){
        nums.stream().forEach(t-> System.out.print(t+" "));
    }

    //3)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void ciftElYazdir1(List<Integer>nums){
        for (Integer w:nums) {
            if (w%2==0){
                System.out.print(w+" ");
            }
        }
    }

    //4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void ciftElYazdir2(List<Integer>nums){
        nums.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));
    }

    //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void tekElKareYazdir(List<Integer>nums){
        nums.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));
    }

    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void tekElKüpTekrarsizYazdir(List<Integer>nums){
        nums.stream().filter(t->t%2!=0).map(t->t*t*t).distinct().forEach(t-> System.out.print(t+" "));
    }

    //7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz
    public static int distinctCiftElKareTop(List<Integer>nums){
       return nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
       //reduce(Math::addExact)
    }

    //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz
    public static int distinctCiftElKareCarp(List<Integer>nums){
        return nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(Math::multiplyExact).get();
                //reduce(1,(t,u)->t*u)
    }


    //9)Liste ogelerinden max degeri veren bir method olusturunuz
    public static void maxDeger(List<Integer>nums){

        //1.yol
        int max=nums.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u ? t:u);
        System.out.println(max);
        //2.yol
        int max2=nums.stream().distinct().reduce(Math::max).get();//reduce den sonra forEach olmaz konteynir a at asagida yazdir
        System.out.println(max2);
    }
        //3.yol
        public static int listeninMaxElemani(List<Integer> nums){
            return nums.stream().max(Integer::compareTo).get();

        }
        //4.yol
        public static int listeninMaxElemani2(List<Integer> nums) {
        return nums.
                stream().max(Comparator.naturalOrder()).get();
    }
    //5.yol
       public static void  listeninMaxElemani3(List<Integer> nums) {
        int max3=nums.stream().distinct().sorted().reduce((t,u)->u).get();
           System.out.println(max3);


}
    //6.yol
    public static void  listeninMaxElemani4(List<Integer> nums) {
        Integer max4=nums.stream().distinct().reduce(nums.get(0),(t,u)->t>u? t:u);
        System.out.println(max4);
    }
        //hoca 1 ve 6 yi begendi

    //10)Liste ogelerinden minumum degeri veren method olusturunuz.

    public static void minDeger(List<Integer>nums){
        int min=nums.stream().distinct().reduce(Integer.MAX_VALUE,(t,u)->t<u ? t:u);
        System.out.println(min);
    }





}

