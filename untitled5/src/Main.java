public class Main {
    public static void main(String[] args) {

        Product product = new Product();

        product.isim = "Laptop";
        product.kod = 1;
        product.aciklama = "Asus Laptop";
        product.fiyat = 5000;
        product.stokMiktarı = 3;

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
    }
}