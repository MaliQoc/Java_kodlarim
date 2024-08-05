import java.util.Scanner;
import matematik.*; //* ifadesi matematik paketindeki tüm ifadeleri alır. Tek tek menü ya da modülleri eklemeye uğraşmazsınız.

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("İsminizi giriniz: ");
        String isim = input.nextLine();

        System.out.println("Merhaba " + isim);

        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.topla(2,3));

        Logaritma logaritma = new Logaritma();
        System.out.println(logaritma.logaritmaHesapla());
    }
}