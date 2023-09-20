package javaders.day33maps;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {

    /*
       1) TreeMap "thread-safe" ve "synchranized" degildir.
       Note: Map ler de multi thread kullanmaniz gerektiginde sadece hashtable kullanabilirsiniz
       diger ikisi thread safe degildir.

       2) TreeMap ler value larda null kullanimina musaade eder ,key lerde etmez
       3) TreeMap entry leri key lerine gore natural order a gore siraya koyar. bu yuzden cooook yavastir.
     */

    public static void main(String[] args) {

        long t1=System.nanoTime();

        TreeMap<String,Integer> countryPopulations =new TreeMap<>();

        countryPopulations.put("USA",400000000);
        countryPopulations.put("Netherland",18000000);
        countryPopulations.put("Turkiye",83000000);
        countryPopulations.put("Belgium",12000000);
        countryPopulations.put("Mexico",125000000);
        countryPopulations.put("Brasil",215000000);
        countryPopulations.put("France",75000000);
        countryPopulations.put("Finland",8000000);
        countryPopulations.put("Germany",85000000);
        countryPopulations.put("Madagaskar",3000000);

        System.out.println(countryPopulations);
        long t2 =System.nanoTime();

        HashMap<String,Integer> countryPop =new HashMap<>();

        countryPop.put("USA",400000000);
        countryPop.put("Netherland",18000000);
        countryPop.put("Turkiye",83000000);
        countryPop.put("Belgium",12000000);
        countryPop.put("Mexico",125000000);
        countryPop.put("Brasil",215000000);
        countryPop.put("France",75000000);
        countryPop.put("Finland",8000000);
        countryPop.put("Germany",85000000);
        countryPop.put("Madagaskar",3000000);

        TreeMap<String,Integer> countryPop2=new TreeMap<>(countryPop);

        System.out.println(countryPop2);

        long t3= System.nanoTime();

        System.out.println(t2-t1);//669200
        System.out.println(t3-t2);//82700

    }
}
