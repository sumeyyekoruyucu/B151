package javaders.day25polymorphism;

public class AnimalRunner {
    public static void main(String[] args) {

        Animal a1=new Animal();

        System.out.println(a1.add(3,5));
        System.out.println(a1.circleArea(5.0));
        a1.move();
        System.out.println(a1.multiply(3,5));


    }
}
