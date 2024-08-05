import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.fiyat = 10;
        product.isim = "Mouse";

        manager.add(product);
        DatabaseHelper.Crud.Delete();
        DatabaseHelper.Crud.Update();
    }
}