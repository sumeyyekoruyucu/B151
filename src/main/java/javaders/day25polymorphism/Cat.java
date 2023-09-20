package javaders.day25polymorphism;

public class Cat  extends Animal{

    //Child da access modifier parent tan daha dar kapsamli olamaz (ayni veya daha genis olmali)
    // return type primitive de parent tan farkli olamaz(int).
    // return type ama aile ismi ile return type yaptiysak degistirebilirsin(3.ornek)
    @Override
    public void move() {
        System.out.println("Cats move...");
    }

    @Override
    public int add(int a, int b) {
        return a+b+1;
    }

    @Override
    public Cat create() { //return type olan Animali degistirip Cat yazdik sorun olmadi
        return new Cat();
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return 2*a*b;
    }
   /* @Override
    public final double circleArea(double r){
        return 3.14*r*r;
    }hata verdi final method override edilemez
     */

}
