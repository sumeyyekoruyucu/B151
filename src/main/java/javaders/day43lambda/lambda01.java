package javaders.day43lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class lambda01 {
    public static void main(String[] args) {

        Course turkishDay = new Course("Turkish Daytime QA",213,"Spring",97);
        Course turkishNight = new Course("Turkish Nightime QA",245,"Winter",98);
        Course englishDay = new Course("English Daytime Java Dev",121,"Spring",91);
        Course englishNight = new Course("English Nighttime Java Dev",137,"Winter",95);

        List<Course> courseList =new ArrayList<>();
        courseList.add(turkishDay);
        courseList.add(turkishNight);
        courseList.add(englishDay);
        courseList.add(englishNight);

        System.out.println(isAvgScoreGreaterThanANumber(courseList,90));
        System.out.println(isAnyCourseNameContainsQa(courseList,"QA"));
        System.out.println(getCourseNamesWhoseAvgMax(courseList));
        System.out.println(getCourseBetterThanLastTwo(courseList));
        System.out.println(getHighestThird(courseList));
        System.out.println(getCourseWhoseRegisteredStdLessThanNumber(courseList,150));

    }
     //Example 1 :Tum average score larin 90 dan buyuk olup olmadigini kontrol eden methodu olusturunuz.
    //avg diye parametre koyduk ki soruda 90 dese de biz her sayi icin kontrol edebilelim.listin icinde ol icin bide list koyduk
    public static boolean isAvgScoreGreaterThanANumber(List<Course>courseList,int avg){
       return courseList.stream().allMatch(t->t.getAverageScore()>avg);
    }
     //Example 2: En az bir kurs isminin QA icerip icermedigini kontrol eden methodu olusturunuz
    public static boolean isAnyCourseNameContainsQa(List<Course>courseList,String word){
        return courseList.stream().anyMatch(t->t.getCourseName().contains(word));
    }
    //Example 3: En yuksek average score'a sahip kurs ismini veren code'u yaziniz.
    public static String getCourseNamesWhoseAvgMax(List<Course>courseList) {
        Course course = courseList.stream().sorted(Comparator.comparing(Course::getAverageScore).reversed()).findFirst().get();
        return course.getCourseName();

        /* return courseList.stream().
            sorted(Comparator.comparing(Course::getAverageScore).reversed()).
            findFirst(). get().getCourseName();
          Seklinde de return edebiliriz ama yukaridaki gibi atarsak sadece ismi degil digerleri ile ilgili
          islemleri de atadigimiz kelimeyle yapabiliriz.
         */
    }

    //Example 4:Average score'u en dusuk olan ilk iki kurs disindaki tum kurslari return eden method'u olusturunuz

        public static List<Course>getCourseBetterThanLastTwo(List<Course>courseList){
            return courseList.
                    stream().
                    sorted(Comparator.comparing(Course::getAverageScore)).
                    skip(2).
                    collect(Collectors.toList());

        }

     //Example 5: Average score'u ustten ucuncu olan kursu veren method'u olusturunuz.
    public static Course getHighestThird(List<Course>courseList){
       return courseList.stream().sorted(Comparator.comparing(Course::getAverageScore).reversed()).
        skip(2).limit(1).collect(Collectors.toList()).get(0);
        //get kursu listini degil elemani versin diye
    }

    //Example 6 : Ogrenci sayisi 150'den az olan kurslari return eden mehod'u olusturunuz.
    public static List<Course>getCourseWhoseRegisteredStdLessThanNumber(List<Course>courseList,int numOfStd){
       return courseList.stream().filter(t->t.getNumOfStudents()<numOfStd).collect(Collectors.toList());

    }



}
