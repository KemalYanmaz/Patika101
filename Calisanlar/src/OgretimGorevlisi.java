public class OgretimGorevlisi extends Akademisyen {

    private String kapiNo;
    public OgretimGorevlisi(String adsoyad, String telefon, String eposta, String bolum, String unvan,String kapiNo) {
        super(adsoyad, telefon, eposta, bolum, unvan);
        this.kapiNo = kapiNo;
    }

    @Override
    public void derseGir() {
        System.out.println(this.getAdsoyad()+ "(ÖğretimGörevlisi) derse girdi.");
    }

    @Override
    void giris() {
        System.out.println(this.getAdsoyad()+ "(ÖğretimGörevlisi) giriş yaptı..");
    }

    @Override
    void cikis() {
        System.out.println(this.getAdsoyad()+ "(ÖğretimGörevlisi) çıkış yaptı.");

    }

    @Override
    void yemekhane() {
        System.out.println(this.getAdsoyad()+ "(ÖğretimGörevlisi) yemekhaneye girdi.");
    }

    public void senatoToplanti(){
        System.out.println(this.getAdsoyad()+ "(ÖğretimGörevlisi) senato toplantısı düzenliyor.");
    }

    public void sinavYap(){
        System.out.println(this.getAdsoyad()+ "(ÖğretimGörevlisi) sınav yapıyor.");
    }

    public void setKapiNo(String kapiNo){
        this.kapiNo = kapiNo;
    }

    public String getKapiNo(){
        return this.kapiNo;
    }
}
