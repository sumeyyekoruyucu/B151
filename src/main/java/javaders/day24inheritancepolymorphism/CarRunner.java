package javaders.day24inheritancepolymorphism;

public class CarRunner {
    public static void main(String[] args) {

       Toyota t1=new Toyota();//yeni obje olusturulurken kullandigimiz kelime Constructor olur
        /*burda parantez ici bos old icin ici bos olan Constructor lari yazdirir
       Car constructor 1
       Toyota Constructor 1
       Constructor olustururken once babayi sonra cocugu ureteceksin.Java sirasiyla yazdirir
       Parent class a super class da denir
       child class a Sub class da denir*/

        /*
        Toyota t1=new Toyota("Prius");
        Car constructor 1(parent te nos olanbos olan)
        Toyota Constructor 2 (toyota da stringli olan)

        public Toyota(String s){
        super(5);
       Toyota Constructor  daki super() icine sayi koyarsak
       parent taki int li olani kullanir
         Car constructor 2
         Toyota Constructor 2

         Toyotanin icini bos birakip class daki bos olana
         super yaparsak
         once toyotada bos olan sonra bos olana
         super yapar deger yazarsak parent taki int li olana gider

         Car constructor 2
         Toyota Constructor 1

         */
        Honda h1=new Honda();
        String s="Ali";

        Volvo v1=new Volvo();
        v1.move();



    }
}
