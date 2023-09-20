package javaders.day25polymorphism;

public class StudentRunner {
    public static void main(String[] args) {

        Student s1=new Student();
        //s1. yaptigimizda stdName ve age i goruruz. stdId yi goremeyiz private ol icin(Encapsulation)
        // ama istersek okuyabiliriz java bunu saglamis. olusturuldugu class da sag tus  + generate + getter + stdId yapariz
        //  sadece ihtiyac halinde yapariz ayni arabanin kaputu gibi
        //s1. yaptigimizda stdId degil ama degerini bulacagimiz method gelir onu da sout ta yazdiririz

        System.out.println(s1.getStdId());

        System.out.println(s1.getGpa());

        System.out.println(s1.isSuccessful());

        s1.setGpa(3.99); //degisiklik sadece bu objede(s1) olur.studentin class da olmaz.asli korunur,orada ilk deger gorunur
        System.out.println(s1.getGpa());







    }
}
