public class BilgiIslem extends Memur{

    private String gorev;
    public BilgiIslem(String adsoyad, String telefon, String eposta, String departman, String mesai,String gorev) {
        super(adsoyad, telefon, eposta, departman, mesai);
        this.gorev = gorev;
    }

    @Override
    void giris() {
        System.out.println(this.getAdsoyad()+ "(Bilgi İşlem) giriş yaptı.");
    }

    @Override
    void cikis() {
        System.out.println(this.getAdsoyad()+ "(Bilgi İşlem) çıkış yaptı.");
    }

    @Override
    void yemekhane() {
        System.out.println(this.getAdsoyad()+ "(Bilgi İşlem) yemekhaneye giriş yaptı.");
    }

    @Override
    public void calis() {
        System.out.println(this.getAdsoyad()+ "(Bilgi İşlem) çalışmaya başladı.");
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }
}
