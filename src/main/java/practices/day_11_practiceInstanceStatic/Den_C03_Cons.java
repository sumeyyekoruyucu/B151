package practices.day_11_practiceInstanceStatic;

public class Den_C03_Cons {


    public static void main(String[] args) {

        //C03_Constructor deki variablelar instance(static degil) oldugundan
        //obje olusturmaliyiz

       C03_Constructor obj1=new C03_Constructor();//esitligin sag tarafi objenin constructor idir.

        //Constructor parametresiz ici bos oldugundan(default) degisiklikleri olusturdugumuz obje uzerinden
        // kendimiz assigne ettik
       obj1.marka="Mercedes";
       obj1.model="C180";
       obj1.yil=2023;
       obj1.yakit="Benzin";

        System.out.println(obj1.marka);//Mercedes
        System.out.println(obj1.model);//C180
        System.out.println(obj1.yil);//2023
        System.out.println(obj1.yakit);//Benzin






    }
}
