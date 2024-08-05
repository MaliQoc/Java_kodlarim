import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Asal sayı gir: ");
        int num = input.nextInt();

        int a = num % 2;
        boolean isPrime = true;

        if (num == 1) {
            System.out.println("Zaa bu sayı asal değildir.");
            return;
        }

        if (num < 1) {
            System.out.println("Geçersiz sayı girdin.");
        }

        for (int i = 2;i < num;i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println("Tamam sayı asal.");
        }
        else {
            System.out.println("Zaa bu sayı asal değildir.");
        }





        System.out.println("Mükemmel sayı gir: ");
        int num2 = input.nextInt();

        int total = 0;

        for (int j = 1;j < num2;j++) {
            if (num2 % j == 0) {
                total += j;
            }
        }

        if (total == num2) {
            System.out.println("Tamam bu mükemmel sayı.");
        }
        else {
            System.out.println("Zaa bu sayı mükemmel sayı değildir.");
        }

    }
}