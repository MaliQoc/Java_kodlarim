
public class Main {
    public static void main(String[] args) {

        String ogr1 = "Ali";
        String ogr2 = "Hasan";
        String ogr3 = "Ozan";

        System.out.println(ogr1);
        System.out.println(ogr2);
        System.out.println(ogr3);



        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Ali";
        ogrenciler[1] = "Hasan";
        ogrenciler[2] = "Ozan";

        for(int i = 0; i < ogrenciler.length;i++) {
            System.out.println(ogrenciler[i]);
        }

        for(String ogrenci:ogrenciler) {
            System.out.println(ogrenci);
        }



        double[] myList = {1.2,1.3,4.3,5.6};
        double total = 0;
        double max = myList[0];

        for (double number:myList) {

            if(max<number) {
                max = number;
            }

            total += number;
            System.out.println(number);
        }

        System.out.println("En Büyük: " + max);
        System.out.println("Toplam: " + total);




        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Ankara";
        sehirler[0][2] = "İzmir";
        sehirler[1][0] = "Bursa";
        sehirler[1][1] = "Antalya";
        sehirler[1][2] = "Adana";
        sehirler[2][0] = "Mersin";
        sehirler[2][1] = "Hatay";
        sehirler[2][2] = "Diyarbakır";

        for(int k = 0; k <= 2; k++) {
            for(int l = 0; l <= 2; l++) {
                System.out.println(sehirler[k][l]);
            }
        }




        String mesaj = "Bugün hava çok sıcak.";
        System.out.println(mesaj);

        System.out.println("Eleman Sayısı: " + mesaj.length());
        System.out.println("5.eleman: " + mesaj.charAt(4));
        System.out.println(mesaj.concat("Yaşasın!"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));

        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("a"));

        String yeniMesaj = mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5));

        for(String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

    }
}