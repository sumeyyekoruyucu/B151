package javaders.day28interface;
/*
1) Class (Child) ==> Class : extends
   interface(Child) ==> interface :extends
   Class(Child) ==> interface :implements(ama mutlaka child da override edilmeli)
   interface(Child)  ==>Class : OLAMAZ

 */
/*
             ABSTRACT CLASS ILE INTERFACE ARASINDAKI FARKLAR NELERDIR?

  1) method olarak;

 Abstract class lar hem "abstract" hemde "concrete" methodlar icerebilir.
  fakat interface lar sadece "abstract"method icerir.
  Ama interface lerde istersek "default" ve "static" keywordunu kullanarak "concrete" method uretebiliriz

 2) variable olarak;

  Abstract Class lar icinde her turlu variable olusturulabilir,
  interfece ler icindeki variable lar public,static ve final olmak zorundadir

  3)Interface in var olus sebebi;

   Abstract Class lar multiple inheritance desteklemez ama interface ler destekler

  4) Interface Class'in childi olamaz ama "Abstract Class" class in child i olabilir
  5) "Abstract Class" larda costructor vardir ama object uretmez,
  interface lerde constructor yoktur.Bu yuzden object uretilemez

 */
public interface Mammal extends Animal {

    String feedBaby="Milk";
    int age = 6;

}
