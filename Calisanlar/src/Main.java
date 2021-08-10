public class Main {
    public static void main(String[] args) {
        OgretimGorevlisi ogretimGorevlisi = new OgretimGorevlisi("Kemal Yanmaz","536532103","ulaskemalyanmaz@gmail.com","Matematik","Öğretmen","12");
        GuvenlikGorevlisi guvenlikGorevlisi = new GuvenlikGorevlisi("Ulaş Yanmaz","1235646","dsaasd","das","08:00-16:00","SRC");

        Calisan[] calisans = new Calisan[2];

        calisans[0]=ogretimGorevlisi;
        calisans[1]=guvenlikGorevlisi;

        for (Calisan calisan:calisans) {
            calisan.giris();
            calisan.yemekhane();
            calisan.cikis();
        }
    }
}
