import java.awt.desktop.PreferencesEvent;
import java.util.Scanner;

public class HesapMak {

    static int sum(int n1,int n2){
        return n1+n2;
    }
    static int minus(int n1,int n2){
        return n1-n2;
    }
    static int times(int n1,int n2){
        return n1*n2;
    }
    static int divide(int n1,int n2){
        return n1/n2;
    }
    static int pow(int n1,int n2){
        int result = 1;
        for(int i=1;i<=n2;i++){
            result *=n1;
        }
        return result;
    }
    static int mod(int n1,int n2){
        return n1%n2;
    }

    static int alan(int n1,int n2){
        return n1*n2;
    }

    static int cevre(int n1,int n2){
        return 2*(n1+n2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selection;

        String menu = "1-Toplama işlemi\n" +
                "2-Çıkarma işlemi\n" +
                "3-Çarpma işlemi\n" +
                "4-Bölme işlemi\n" +
                "5-Üslü sayı hesaplama\n" +
                "6-Mod alma\n" +
                "7-Dikdörtgen alan ve çevre hesabı\n" +
                "0-Çıkış yap";
        int sayi1,sayi2;
        while(true) {
            System.out.println(menu);
            System.out.println("Bir işlem seçiniz: ");
            selection = scanner.nextInt();
            if(selection==0){
                break;
            }
            switch (selection) {
                case 1:
                    System.out.println("Sayıları aralarında bir boşluk bırakarak yazınız.");
                    System.out.println("Sayıların toplamı: " + sum(scanner.nextInt(), scanner.nextInt()));
                    break;
                case 2:
                    System.out.println("Sayıları aralarında bir boşluk bırakarak yazınız.");
                    System.out.println("Sayıların farkı: " + minus(scanner.nextInt(), scanner.nextInt()));
                    break;
                case 3:
                    System.out.println("Sayıları aralarında bir boşluk bırakarak yazınız.");
                    System.out.println("Sayıların çarpımı: " + times(scanner.nextInt(), scanner.nextInt()));
                    break;
                case 4:
                    System.out.println("Sayıları aralarında bir boşluk bırakarak yazınız.");
                    System.out.println("Sayıların bölümü: " + divide(scanner.nextInt(), scanner.nextInt()));
                    break;
                case 5:
                    System.out.println("Sayıları aralarında bir boşluk bırakarak yazınız.");
                    sayi1 = scanner.nextInt();
                    sayi2 = scanner.nextInt();
                    System.out.println(sayi1+"^"+sayi2+"="+pow(sayi1,sayi2));
                    break;
                case 6:
                    System.out.println("Sayıları aralarında bir boşluk bırakarak yazınız.");
                    sayi1 = scanner.nextInt();
                    sayi2 = scanner.nextInt();
                    System.out.println(sayi1+"%"+sayi2+"="+mod(sayi1,sayi2));
                    break;
                case 7:
                    System.out.println("Sayıları aralarında bir boşluk bırakarak yazınız.");
                    sayi1 = scanner.nextInt();
                    sayi2 = scanner.nextInt();
                    System.out.println("Alan:"+alan(sayi1,sayi2)+"\nÇevre:"+cevre(sayi1,sayi2));
                    break;
            }
        }
    }

}