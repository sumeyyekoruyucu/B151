package javaders.day25polymorphism;

public class Student {
    public String stdName="Tom Hanks";
    public int age=23;

    //Encapsulation nedir? Data saklamaktir.(Data hiding)
    //Datayi nasil saklarsin? Access Modifier'ini "private" yaparak.
    private String stdId ="AC2023102T";
    private double gpa =3.87;

    private boolean successful=false;

    //Ozel datalarin butun class'lara acik olmasini engellememiz gerekir.
    // Cunku bir data tum classlara aciksa hacklenebilir



    //Encapsulation yaptigimiz data yi istersek diger class lardan okuyabiliriz
    //Nasil okuruz?
    //get method olusturarak Encapsulation edilmis datanin degerini okuyabilirz
    //i)get method'lari hep "public" olur
    // ii)get method'un "return type"'i okudugu variable'in return type'i ile ayni olur
    //iii)get method bir boolean variable icin olusturulduysa ismi "is" ile baslar


    //maus sag tus + generate + getter + stdId
    //get methodlarin ismi hep getle baslar devami variablenin ismi; getStdId
    //get methodlarin return type i bastakiyle ayni olur

    //Encapsulation yapilan variable in Data type i boolean ise get method ismi "is" ile baslar
    // Sadece boolean get ile baslamaz

    public String getStdId() {
        return stdId;
    }

        /*
        diger class lardan gorunmesin ama degeri okunsun derse private yap,sonra getter
        diger class lardan gorunmesin ve okunmasin derse private yap,getter yapma
         */

    public double getGpa() {
        return gpa;
    }


    public boolean isSuccessful() {   //true false mi? o yuzden is ile baslar
        return successful;
    }
    //Encapsulation yaptigimiz data'yi istersek diger class'lardan  nasil degistirebiliriz?
    //Nasil degistirebiliriz?//"set method" olusturarak Encapsulate edilmis data'nin degerini degistirebiliriz
    //i)set method'lari hep "public" olur ii)set method'un "return type"'i hep "void" olur.
    //iii)set method parametre kullanir, parametre'nin data type'i variable ile ayni olur.
    //iv)set method kullanarak varolan object uzerinde degisiklikler yaparak o object'i sanki yeni bir object'mis gibi kullanabiliriz.
    //Note: getmethod'larin diger adi "getter", set method'larin diger adi "setter" dir.

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    //set methodlarin return type i hep void olur yeni bir data vermez, degistirir
    //set methodlar mutlaka parametre kullanir yeni deger girmek icin
    //set methodlar da boolean dahil hepsi set ile baslar

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
}
