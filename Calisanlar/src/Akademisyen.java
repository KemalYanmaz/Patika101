public abstract class Akademisyen extends Calisan{
    String bolum;
    String unvan;


    public Akademisyen(String adsoyad, String telefon, String eposta, String bolum, String unvan) {
        super(adsoyad, telefon, eposta);
        this.bolum = bolum;
        this.unvan = unvan;
    }

    public abstract void derseGir();

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
}
