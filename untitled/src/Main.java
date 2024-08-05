import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ogrSayi = 12;
        System.out.println("Öğrenci sayım: " + ogrSayi);

        if(ogrSayi < 15) {
            System.out.println("Sayi");
        }
        else {
            System.out.println("Sayi değil");
        }




        for(int i = 1;i <= 10;i += 2) {
            System.out.println(i);
        }

        System.out.println("Döngü Bitti");





        int a = 2;
        while (a<10) {
            System.out.println(a);
            a += 2;
        }

        System.out.println("Döngü Bitti");





        int j = 0;
        do {
            System.out.println("Loglandı");
            System.out.println(j);
            j += 2;
        } while (j<10);
        System.out.println("Do-While Döngüsü Bitti.");





        System.out.println("Harf Notunuzu Giriniz: ");
        char grade = input.next().charAt(0);

        System.out.println("Harf Notunuz: " + grade);


        switch(grade) {
            case 'A':
                System.out.println("Mükemmel: Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok Güzel: Geçtiniz");
                break;
            case 'C':
                System.out.println("İyi: Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil: Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız");
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız");
                break;
        }
    }
}