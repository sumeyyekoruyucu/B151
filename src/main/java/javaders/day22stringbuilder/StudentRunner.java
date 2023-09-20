package javaders.day22stringbuilder;

public class StudentRunner {
    public static void main(String[] args) {
         // public oldugu icin diger class dan ulastim
        //diger class daki stdName static olmadigi icin obje olusturmaliyiz
        Student std1=new Student();
        System.out.println(std1.stdName);

        System.out.println(std1.age);
        // eee buna da ulastik
        // ayni package de oldugumuz icin public ile default un farki olmaz
        // farkli package da ise public olan gozukur ama default olan gozukmez
    }
}
