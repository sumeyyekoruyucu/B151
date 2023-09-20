package javaders.day22stringbuilder;

public class Student {

    //StudentName public oldugu icin diger class lardan ulasilabilir
    // ama static olmadigi icin class ismiyle ulasilamaz
    //obje olusturulmasi gerekir
    public  String stdName="Ali Can";

    // Access modifier i default olan ile public olan class member lar ayni package icinde
    //kullanildiklarinda ayni ozellikleri gosterirler
    //Fakat farkli package e gectiginizde public olanalara ulasilabilir
    //default olanlara ulasilamaz
    int age =23;

    private String healthCondition ="Cancer";
    // Access modifier i private olan class memberlar
    //sadece olusturulduklari class icinden gorulebilirler
    //olusturuldukleri class in disina ciktiginizda gorunmez ulasilmaz olurlar
    //Ayni package da baska class da gorulmezler


    //Ayni package de public,default,protected gorulur.
    //Farkli package de sadece public gorulur
    //Farkli package de protected olanlar sadece child class lardan gorulur ama default olanlar asla gorulmez
    //Private kendi class i haric hicbir yerden gorulemez
    protected int salary=3000;

    //class lar private,protected olamaz methodlar olabilir
    //class lar public ve default olabilir.Ama Public tercih edilir. class lar private,protected olamaz
}
