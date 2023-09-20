package advancedpractices.day07;

import java.util.HashMap;

public class Order { //siparis
    private static int orderCount=1000;//sayac baslangic degeri

    //hem pizza hem de adedini soylemek icin  map kullanmaliyiz

    private int orderCode;//siparis kodu
    private HashMap<MenuItem,Integer>items=new HashMap<>();//items Hash map inin icinde(pizza,2 adet)
    // items:secenekler  , pizza icin string yazmadik cunku MenuItem class inda string variable olusturmustuk onu kullandik
    private double totalAmount=0;

    public Order() {
        orderCode=orderCount++;//sayac

    }
    public void addItem(MenuItem item,int adet){
        items.put(item,adet);//items secenekler hashmap ine arguman olarak verilen item yani seceenek(pizza) eklenir.
        totalAmount+=item.getPrice()*adet;
    }

    public int getOrderCode() {
        return orderCode;
    }

    public HashMap<MenuItem, Integer> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
