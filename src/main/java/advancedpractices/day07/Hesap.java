package advancedpractices.day07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hesap {
        private ArrayList<Order> orders = new ArrayList<>();

        public void add (Order order){
            orders.add(order);
        }

        public double getTotalAmount(){//toplam siparis tutari
            return orders.
                    stream().
                    mapToDouble(Order::getTotalAmount).//degerleri double olarak topla bana ver
                    sum();//toplar...sum() methodu noktalar...terminal method(foreach gibi)
        }
        public void printHesap(){

            System.out.println("************* HESAP FISI *****************");

            for (Order order:orders) {//restouranta gelen lerin hepsinin siparisi
                System.out.println("Siparis kodu : "+order.getOrderCode());
                System.out.println("Yiyecekler : ");
                HashMap<MenuItem,Integer>items=order.getItems();//kisi kisi

                for (Map.Entry<MenuItem,Integer>entry:items.entrySet()) {

                    MenuItem item=entry.getKey();
                    int adet= entry.getValue();
                    System.out.printf("%-20s  %d x  %.2f TL "+
                            item.getName(),adet,item.getPrice());//souf formatli yazdirmayi saglar
                    //% formatli yazdirmak icin
                    // eksi(-) sola yatirmak icin
                    // 20 karakter ayir
                    // string ise s ,tamsayi ise d ,ondalikli da f harfi
                    //.2 noktadan sonra iki basamak anlaminda

                }
                System.out.println(order.getTotalAmount());//kisi odemesi(tum yediklerinin)

            }
            System.out.println(getTotalAmount());//toplam masa odemesi
        }




}
