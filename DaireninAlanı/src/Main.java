import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen dairenin yarıçapını giriniz: ");
        int r = scanner.nextInt();
        System.out.print("Lütfen dairenin merkez açı ölçüsünü giriniz: ");
        int a = scanner.nextInt();

        double alan = (Math.PI* (r*r)*a)/360;
        System.out.println("Yarıçapı "+ r+" Merkez açı ölçüsü "+ a +" olan dairenin alanı: "+alan+ "bulundu.");
    }
}
