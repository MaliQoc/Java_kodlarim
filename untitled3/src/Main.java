import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //sayiBulmaca();
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int c = topla(5,7);
        int toplam2 = topla2(2,3,4,5,6,10);
    }

    /* public static void sayiBulmaca() {

        Scanner input = new Scanner(System.in);

        int[] sayilar = new int[] {1,2,3,4,5,6};

        System.out.println("Dizide aranacak sayıyı gir: ");
        int aranacak = input.nextInt();

        boolean varMi = false;

        for (int sayi: sayilar) {
            if(sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        if(varMi) {
            System.out.println(aranacak + " sayısı mevcuttur.");
        } else {
            System.out.println(aranacak + " sayısı mevcut değildir.");
        } */

    public static String sehirVer() {
        return "Ankara";
    }

    public static int topla(int a,int b) {
        return a + b;
    }

    public static int topla2(int... sayilars) {
        int toplam = 0;
        for (int sayi:sayilars) {
            toplam += sayi;
        }
        return toplam;
    }
}