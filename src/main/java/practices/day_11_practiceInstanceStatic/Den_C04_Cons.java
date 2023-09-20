package practices.day_11_practiceInstanceStatic;

public class Den_C04_Cons {


    public static void main(String[] args) {

        C04_Constructor obj=new C04_Constructor("Honda","Civic",2020,"Benzin");
        //Biz honda,civic,2020,benzin yazdik create yaptik kendi duzenledi ve
        //C04_Constructor class inda kendi otomatik constructor olusturdu.
        //mrk,mdl,yl,ykt diye biz duzenledik ama kendimiz istedigimiz icin o otomatiik
        //honda,civic,i,benzin yapmisti.
        // tam tersini de yapabiliriz C04_Constructor class inda sag tik, generate,constructor da yapabilirdik

        System.out.println(obj.marka);//Honda
        System.out.println(obj.model);//Civic
        System.out.println(obj.yil);//2020
        System.out.println(obj.yakit);//Benzin
    }
}
