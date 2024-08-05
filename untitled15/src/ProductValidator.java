public class ProductValidator {
    /* public static boolean yapsaydık productmanagerda validator.isvalid değil de sadece productvalidator yazabilecektik yani new e gerek kalmayacaktı.
    Fakat bu sefer de new olmiyacağı için iş bitince bellekten atılmaz bu nedenle belleği etkin kullanabilmek adına bu taktiklere sık başvurmayız. */

    static {
        System.out.println("Static yapıcı blok çalıştı.");
    }
    //C# ta yapıcı blok staticte de çalışır amnca javada ayriyeten static oluşturmaak gerekiyor.
   public ProductValidator(){
       System.out.println("Yapıcı blok çalıştı.");
   }
    public boolean isValid(Product product) {
        if (product.fiyat > 0 && !product.isim.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void birsey() {

    }

    //ana class static olamaz ama ana class içerisinde başka bir static class oluşturabiliriz. Buna inner class denir.
    //Örneğin gruplandırma işlerinde kullanılır.
    public static class BaskaBirClass{
        public static void Sil() {

        }
    }
}
