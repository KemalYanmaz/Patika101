public class Asistan extends Akademisyen{

    String ofisSaati;

    public Asistan(String adsoyad, String telefon, String eposta, String bolum, String unvan,String ofisSaati) {
        super(adsoyad, telefon, eposta, bolum, unvan);
        this.ofisSaati = ofisSaati;
    }

    @Override
    public void derseGir() {
        System.out.println(this.getAdsoyad()+"(Asistan) derse giriyor.");
    }

    @Override
    void giris() {
        System.out.println(this.getAdsoyad()+"(Asistan) giriş yaptı.");
    }

    @Override
    void cikis() {
        System.out.println(this.getAdsoyad()+"(Asistan) çıkış yaptı.");
    }

    @Override
    void yemekhane() {
        System.out.println(this.getAdsoyad()+ "(Asistan) yemekhaneye gidiyor.");
    }

    public void quizYap(){
        System.out.println(this.getAdsoyad()+"(Asistan) quiz yapıyor.");
    }

    public String getOfisSaati() {
        return ofisSaati;
    }

    public void setOfisSaati(String ofisSaati) {
        this.ofisSaati = ofisSaati;
    }
}
