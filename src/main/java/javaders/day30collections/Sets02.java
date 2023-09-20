package javaders.day30collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02 {
    public static void main(String[] args) {

        //ex 1: ogrenci e mail adreslerinik Natural order da siralanmis olarak depolayiniz

        //1.Yol

        long t1 = System.nanoTime();//benim kullandigim süreyi nano saniye olarak aliyo
        TreeSet<String> emails = new TreeSet<>();
        emails.add("abc@gmail.com");
        emails.add("abd@gmail.com");
        emails.add("abe@gmail.com");
        emails.add("abf@gmail.com");
        emails.add("abg@gmail.com");
        emails.add("abh@gmail.com");
        emails.add("abi@gmail.com");
        emails.add("abj@gmail.com");
        emails.add("abk@gmail.com");
        emails.add("abl@gmail.com");
        System.out.println(emails);

        long t2 = System.nanoTime();

        //treeset cok yavas,her eleman eklemede tekrar tekrar siralama yapar(9 kez)
        //2.yol
        HashSet<String> emailsHs = new HashSet<>();
        emailsHs.add("abc@gmail.com");
        emailsHs.add("abd@gmail.com");
        emailsHs.add("abe@gmail.com");
        emailsHs.add("abf@gmail.com");
        emailsHs.add("abg@gmail.com");
        emailsHs.add("abh@gmail.com");
        emailsHs.add("abi@gmail.com");
        emailsHs.add("abj@gmail.com");
        emailsHs.add("abk@gmail.com");
        emailsHs.add("abl@gmail.com");

        TreeSet<String> emailsHsTs = new TreeSet<>(emailsHs);
        System.out.println(emailsHsTs);
        // Hashset ile hizlica eleman ekleyip elamanlar bittikten sonra treeset e ceviririz.Boyle daha hizli

        long t3 = System.nanoTime();
        System.out.println(t2 - t1);//891000  tree set(yavas)
        System.out.println(t3 - t2);//65000   hashset
    }
}