import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14,elma= 3.67, domates = 1.11,muz = 0.95,patlican = 5.0;
        double ucret = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç kilo armut alacaksınız? :");
        ucret+= armut * scanner.nextInt();
        System.out.print("Kaç kilo Elma alacaksınız? :");
        ucret+= elma * scanner.nextInt();
        System.out.print("Kaç kilo Domates alacaksınız? :");
        ucret += domates * scanner.nextInt();
        System.out.print("Kaç kilo Muz alacaksınız? :");
        ucret += muz * scanner.nextInt();
        System.out.print("Kaç kilo Patlıcan alacaksınız? :");
        ucret += patlican * scanner.nextInt();
        System.out.println("Toplam tutar: "+ ucret + " TL ");
    }
}
