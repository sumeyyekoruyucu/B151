package practices.day_01_practice;

public class Q04_Hipotenus {
    //Hipotenus hesaplayan bir kod yaziniz

    public static void main(String[] args) {

        System.out.println(hipotenusHesaplama(3,4));

        

    }

    public static double hipotenusHesaplama(double x, double y){
    


     double hipotenus = Math.sqrt(x*x+y*y);

        System.out.println("Hello World, bence artik eve gidelim bukadar yeter.hava cok sicak ");


     return hipotenus;



    }





}
