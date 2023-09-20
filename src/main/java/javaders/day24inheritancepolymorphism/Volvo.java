package javaders.day24inheritancepolymorphism;


public class Volvo extends Car{
    public void secure(){
        System.out.println("Volvo is the most secure car in the world...");
    }
    // sag tik generate+overide methods+car class+move sec=move methodunu sec
    // super move u sil. sout icinde ozellestir override etmis olursun
    // override edince sol kenarda hiza bolumunde O harfi cikiyor ona bas parenta git (kolaylik)

    @Override //bu bir Annotation dir. @ isareti ile baslayanlar.Override Annotation i override kurallarini kontrol eder
    public void move() {
        System.out.println("Volvo moves...");

    }
}
