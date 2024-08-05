import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        /* ArrayList sayilar = new ArrayList();

        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");

        sayilar.remove(0);
        System.out.println(sayilar.get(0)); // 1 değerini silmiş olduk bu nedenle sonuçlar değişti.

        for (Object i:sayilar) {
            System.out.println(i);
        } */





        //(Tür korumalı arraylist kullanımı)
        /* ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("İstanbul");
        sehirler.add("İzmir");
        sehirler.add("Bursa");

        sehirler.remove("İstanbul");

        for(String sehir:sehirler) {
            System.out.println(sehir);
        } */

        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(1,"Engin","Demiroğ"));
        customers.add(new Customer(2,"Engin","Demiroğ"));
        customers.add(new Customer(3,"Engin","Demiroğ"));

        customers.remove(new Customer(1,"Engin","Demiroğ"));

        for(Customer customer:customers) {
            System.out.println(customer.firstName);
        }

        HashMap<String,String> sozluk = new HashMap<String,String>();
        sozluk.put("book","kitap");
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisayar");

        for (String item:sozluk.keySet()) {
            System.out.println("Eleman-"+item+" Değer-"+sozluk.get(item));
        }

        System.out.println(sozluk);
        System.out.println(sozluk.size());
    }
}