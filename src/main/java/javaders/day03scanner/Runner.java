package javaders.day03scanner;

public class Runner {

    public static void main(String[] args) {

        //Objekt nasil olusturlur?
        //Class ISmi + Objekt Ismi + Atama Operatoru + "new " + Constructor
           Car           myCar          =                new      Car();

        //"new" keywordu sifirdan yeni bir Obje olusturmak icin kullanilir.
        //Consturctor Java da nesneleri olusturmak icin kullanilan özel bir methoddur.


        System.out.println(myCar.fiyat);
        System.out.println( myCar.model);


        myCar.hareket();
        myCar.dur();






        Student Sumeyye = new Student ();
        System.out.println("Sumeyye.adress = " + Sumeyye.adress);
        System.out.println("Sumeyye.grade = " + Sumeyye.grade);
        System.out.println("Sumeyye.name = " + Sumeyye.name);
        Sumeyye.feed();
        Sumeyye.study();

     
        byte grade = Sumeyye.grade;
        System.out.println("grade = " + grade);
        
        

    }



}
