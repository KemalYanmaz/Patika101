import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Boyunuzu Girin: ");
        double boy = scanner.nextDouble();
        System.out.print("Kilonuzu Girin: ");
        int kilo = scanner.nextInt();

        System.out.println("Vücut kitle endeksiniz: "+ kilo/(boy*boy));
    }
}
