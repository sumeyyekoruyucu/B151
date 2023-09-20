package javaders.day28interface;

public class Cat implements Mammal{


    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }

    public static void main(String[] args) {
        System.out.println(Animal.age);
        System.out.println(Mammal.feedBaby);
        System.out.println(Mammal.age);
        System.out.println(age);
        //interface ismi secmezsen kendinden sonra ilk babasina(Mammal) bakar. yoksa dedesine(Animal)
        // Ama hep interface ismiyle cagrilir direk age yazdirilmaz
        //Interface lerde variable cagirirken Interface adini kullanarak cagirin
        //Bu hep static variable olmanin geregidir hem de okunurlugu artirir.

    }
}
