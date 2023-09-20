package javaders.day36exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("src/main/java/javaders/day36exceptions/TextFile");

            int i=0;
            while((i=fis.read())!=-1){
                System.out.print((char)i);
            }
            //read() kirmizi 4 secenek cikti ilkini sectik coklu(multiple) catch block(genelde bu tercih edilir)
        } catch (FileNotFoundException e) {
           // throw new RuntimeException(e);
            System.out.println("Path is wrong or the file does not exist");
        } catch (IOException e) {
            //throw new RuntimeException(e);
            System.out.println("Some characters could not be read");

            /*Learn Java earn money,
             Java is OOP Language.
            OOP has 4 principles
            1)Inheritance
            2)Polymorphism: i) Overloading    ii)Overriding
            3)Encapsulation
            4)Abstraction: i) Abstract Class ii)Interface

             */
        }
    }
}
