package javaders.day25polymorphism;

public class Animal {
    /*
    1) Parent taki method ile child da override edilen methodun access modifier lari ayni olabilir
    2) Child daki override edilen methodun access modifier i parent taki method un access modifier dan daha dar olamaz
    3) parent taki method un access modifier i Child daki override edilen methodun access modifierindan daha dar olabilir
    4) Methodun return type i primitive ise overriding yapildiginda return type degistirilemez
    5) Methodun return type i void ise overriding yapildiginda return type degistirilemez
    6) Child da override edilen methodun return type i ile Parent taki methodun return type i arasinda
    " IS A" iliskisi varsa return type degistirilebilir. Aksi takdirde degistirilemez(ornek3: burda Animal Child da Cat)
     Mesela Integer Wrapper class ile Long Wrapper class arasinda "IS A"iliskisi yoktur
     o yuzden return type integer oldugunda Long a degistirilemez
    7) Return Type  Wrapper Class oldugunda overridding yaparken return type degistirilemez
    8) "Final method"lar override edilemezler.(Final method=degistirilemez method demektir)
    "Final method"lar in body si degistirilemez ama override ederken method body yi degistiririz.
     bu bir celiskidir bu yuzden java final methodlarin override edilmesine musade etmez
    9) "Static method" lar override edilemezler.Cunku Static method lar tum child lar icin ortak methodlardir
    bir child ortak methodu degistirdiginde diger child lar bundan etkilenir
    bu etkilenme ummadik sonuclar ortaya cikabilir bu yuzden java static method lari  override edilemsine musaade etmez
    10) Private methodlar override edilemez.zaten diger class goremez ki override etsin
     */
    public void move(){ //move:hareket etmek  (protected de olabilir)
        System.out.println("Animals move...");
    }

    public int add(int a,int b){
        return a+b;
    }

    public Animal create(){ //create methodunu kullanana Animal objesini ver
        return new Animal();
    }
    public Integer multiply(Integer a,Integer b) { // (Integer Numberin cocugu oldugundan Integer i Number yapabiliriz)
        return a * b;
    }

    public final double circleArea(double r){
        return 3.14*r*r;
    }


}
