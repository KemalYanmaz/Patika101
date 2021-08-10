public class GuvenlikGorevlisi extends Memur{

    String belge;

    public GuvenlikGorevlisi(String adsoyad, String telefon, String eposta, String departman, String mesai,String belge) {
        super(adsoyad, telefon, eposta, departman, mesai);
    }

    @Override
    void giris() {
        System.out.println(this.getAdsoyad()+"(Güvenlik Görevlisi) giriş yaptı.");
    }

    @Override
    void cikis() {
        System.out.println(this.getAdsoyad()+"(Güvenlik Görevlisi) çıkış yaptı.");
    }

    @Override
    void yemekhane() {
        System.out.println(this.getAdsoyad()+"(Güvenlik Görevlisi) yemekhaneye giriş yaptı.");
    }

    @Override
    public void calis() {
        System.out.println(this.getAdsoyad()+"(Güvenlik Görevlisi) çalışmaya başladı.");
    }
}
