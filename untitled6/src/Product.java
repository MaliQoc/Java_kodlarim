public class Product {

    /* public Product(){} //maindeki çalışacak kısımların constructorı */
    //attribute | field
    private int sayi;
    private String isim;
    private String aciklama;
    private double fiyat;
    private int stokMiktarı;
    private String kod;

    public int getSayi() {
        return sayi;
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;
    }

    public String getIsim() {
        return isim;
    }

    public String setIsim(String isim) {
        return this.isim = isim;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public int getStokMiktarı() {
        return stokMiktarı;
    }

    public void setStokMiktarı(int stokMiktarı) {
        this.stokMiktarı = stokMiktarı;
    }

    public String getKod() {
        return this.isim.substring(0,1) + sayi;
    }
}
