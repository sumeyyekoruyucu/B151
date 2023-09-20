package javaders.day44lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) throws IOException {

        //ex 1:verilen text file icindeki text i konsola yazdiran kodu yaziniz.

        Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).forEach(System.out::println);
        //forEach(t-> System.out::println(t)) seklinde de olur.
        //lines methodu Paths.get ile calisir.
        //Satirlarin altalta olmasini istedigimiz icin "ln" i silmedik
        /*

    Notlar :

           1) lines methoduna dosya yolunu yazmak için Paths classından get methodunu kullanmalıyız.
           2) foreach() methodu ile satır satır okuma yaptık.
           3) Files classındaki lines methodu datayı Stream olarak verir. Bu sebeple stream'deki bütün
              methodları burada kullanabiliriz.

 */

        //ex 2:Verilen bir text file icindeki text i buyuk harflerle konsola yazdiran kodu yaziniz
        Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).map(String::toUpperCase).
                forEach(System.out::println);

        //ex 3:Verilen bir text file icindeki textlerde java kelimesinin olup olmadigini kontrol kodu yaziniz.
        boolean r1=Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).anyMatch(t->t.contains("Java"));
        System.out.println(r1);

        //ex 4:Verilen bir text file icindeki textlerde kullanilan farkli kelimeleri bir list icinde return ediniz.
        List<String> words= Files.
                              lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).
                               map(t->t.replaceAll("\\p{Punct}","").split(" ")).
                               flatMap(Arrays::stream).//flat:duz arraylerin duvarini yik,dumduz et.elemanlari stream(akisa)e koy
                               distinct().
                               collect(Collectors.toList());
        System.out.println(words);
        //t yi aldigimizda satiri almis oluyoruz
        //map i tekrar tekrar kullanabiliriz.replaceAll icin baska,split icin baska...hatta boyle okunurluk icin daha iyi olur.
        /*
                                 map(t->t.replaceAll("\\p{Punct}", "")).
                                map(t->t.split(" ")).
         */

        //Example 5: Verilen text file icindeki text'de toplam kac harf kullanildigini gosteren kodu yaziniz.
       long numOfLetters=Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("[^A-Za-z]","")).
                map(t->t.split("")).
                flatMap(Arrays::stream).
                count();//long olarak uzunluk verir.//count tan sonra nokta(.)koy baska method gelmez.en son bu kullanilir.
        System.out.println(numOfLetters);


        //Lambda da 2 tip method var .
        // bazilari kendinden sonra method kullanmaya musade etmez(terminal method)  or: (sum(),count(),anyMatch())
        //bazilari kendinden sonra method kullanmaya musade eder

        //Example 6: Verilen text file icindeki text'de kullanilan tum harfleri alfabetik olarak ters sirada bir listin
//           icinde return eden kodu yaziniz

        List<String> allletters= Files.
                lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("[^A-Za-z]","")).
                map(t->t.split("")).
                flatMap(Arrays::stream).
                sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(allletters);
        //istersek distinct de yazariz tekrarsiz olur.ama soruda istemedi istemezse yapmamaliyiz.



    }
}
