import java.util.Scanner;

public class KDVHesaplama {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ürünün KDV'li tutarını giriniz.");
        int fiyat = scanner.nextInt();


        if(fiyat<=1000){
            System.out.println("KDV oranı 18%");
            System.out.println("KDV Tutarı: "+ fiyat*(18.0/118));
        }else{
            System.out.println("KDV oranı 8%");
            System.out.println("KDV Tutarı: "+ fiyat*(8.0/108));
        }

    }
}
