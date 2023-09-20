package javaders.day18constructorsstatickeyword;

import java.util.Arrays;

public class StudentRunner {
    public static void main(String[] args) {
        //static olan "numOfRegisterdStd" variable ini cagirmak icin sadece class ismini kullandik , object olusturmadik

        System.out.println(Student.numOfRegisterdStd);

        // static olmayan "num" variable ini cagirmak icin object olusturduk.

        Student s1= new Student();
        System.out.println(s1.num);

        // static olan "numOfRegisterdStd" variable ini object uzerinden de ulasabilirsiniz ama bu hatadir.
        System.out.println(s1.numOfRegisterdStd);

























    }

}
