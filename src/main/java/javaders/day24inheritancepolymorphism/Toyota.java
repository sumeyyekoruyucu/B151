package javaders.day24inheritancepolymorphism;

public class Toyota extends Car{
    public void hybrid(){
        System.out.println("Toyota uses hybrid engine... ");
    }

    //Constructor olusturalim
    //method kucuk harfle constructor buyuk harfle olusturulur
    public Toyota(){
        System.out.println("Toyota Constructor 1");
    }

    public Toyota(String s){
        super(5);//5 herhangi bir deger(parent taki int li olani kullanir)
        System.out.println("Toyota Constructor 2");
    }


}
