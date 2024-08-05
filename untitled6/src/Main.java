public class Main {
    public static void main(String[] args) {

        Product product = new Product();

        product.setIsim("Laptop");
        product.setSayi(1);
        product.setAciklama("Asus Laptop");
        product.setFiyat(5000);
        product.setStokMiktarı(3);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());
    }
}