public abstract class Calisan {
    private String adsoyad;
    private String telefon;
    private String eposta;

    public Calisan(String adsoyad,String telefon,String eposta){
        this.adsoyad = adsoyad;
        this.telefon = telefon;
        this.eposta = eposta;
    }

    abstract void giris();
    abstract void cikis();
    abstract void yemekhane();

    public String getAdsoyad() {
        return adsoyad;
    }

    public void setAdsoyad(String adsoyad) {
        this.adsoyad = adsoyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }
}
