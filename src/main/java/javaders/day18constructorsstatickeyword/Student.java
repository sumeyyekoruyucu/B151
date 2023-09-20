package javaders.day18constructorsstatickeyword;

public class Student {
    /*
    1)"static" class member'lar(variable+method+constructor+code blacks) tum objeler tarafindan paylasilir.
    2) static class member lar daki degisiklikler tum objeler tarafindan otomatik olarak gorulur.
    3) static class member lar gokteki ay in dunyaya bagli oldugu gibi class a baglidirlar.
    bu yuzden static variable lara class variable da denir
    4) Static class member larin nasil calistigini anlamak icin cizim yapip static olanlari class a
    olmayanlari object e baglayarak dusunmek bu konuyu kolaylastirir.
    5) static class member lari cagirmak icin object olusturmak gerekmez ve tavsiye edilmez.
    ama non-static class member lari cagirmak icin object olusturmak sarttir.

     */
    public static int numOfRegisterdStd=0;
    public int num=0;

    public Student() {
        numOfRegisterdStd++;
        num++;
    }

    public static void main(String[] args) {
        System.out.println(numOfRegisterdStd);//0

        Student s1= new Student();
        System.out.println(numOfRegisterdStd);//1
        Student s2= new Student();
        Student s3= new Student();

        System.out.println(numOfRegisterdStd);//3
        System.out.println(s1.num);//1









    }
}
