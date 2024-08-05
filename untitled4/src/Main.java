public class Main {
    public static void main(String[] args) {

        DortIslem dortIslem = new DortIslem();

        int a = dortIslem.Topla(3,4);
        int b = dortIslem.Cikar(8,1);
        int c = dortIslem.Carp(2,5);
        float d = dortIslem.Bol(3,4);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}