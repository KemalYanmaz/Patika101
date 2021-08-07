import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mesafe,yas,tip;
        double price,discount,pricewithDiscount;
        System.out.print("Gidilecek mesafe: ");
        mesafe = scanner.nextInt();
        while(mesafe<0){
            System.out.println("Hatalı veri girdiniz.");
            System.out.print("Gidilecek mesafe: ");
            mesafe = scanner.nextInt();
        }
        System.out.print("Yaşınız: ");
        yas = scanner.nextInt();
        System.out.print("Yolculuk Tipi:\n1-)Gidiş\n2-)Gidiş-Dönüş");
        tip = scanner.nextInt();
        price = 0.1*mesafe;
        discount = 0;
        if(yas<12){
            discount+=price/2;
        }else if(yas>=12 && yas<24){
            discount+=price*0.1;
        }else if(yas>65){
            discount+=price*0.3;
        }
        System.out.println("İndirimli Fiyat: "+(price-discount) );
        if(tip==2){
            discount+=(price-discount)*0.2;
            System.out.println("Toplam Tutar = "+ (price-discount)*2);
        }else{
            System.out.println("Toplam Tutar = "+ (price-discount));

        }

    }
}
