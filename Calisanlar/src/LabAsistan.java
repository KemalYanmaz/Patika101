public class LabAsistan extends Asistan{

    public LabAsistan(String adsoyad, String telefon, String eposta, String bolum, String unvan, String ofisSaati) {
        super(adsoyad, telefon, eposta, bolum, unvan, ofisSaati);
    }

    public void LablaraGir(){
        System.out.println(this.getAdsoyad()+ " Labaratuara girdi.");
    }

    public void derseGir(){
        System.out.println(this.getAdsoyad()+ " derse girdi");
    }
}
