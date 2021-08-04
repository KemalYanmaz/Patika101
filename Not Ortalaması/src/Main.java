import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        int matematik,fizik,kimya,turkce,tarih,muzik;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        matematik = scanner.nextInt();
        System.out.print("Fizik Notunuz: ");
        fizik = scanner.nextInt();
        System.out.print("Kimya Notunuz: ");
        kimya = scanner.nextInt();
        System.out.print("Türkçe Notunuz: ");
        turkce = scanner.nextInt();
        System.out.print("Tarih Notunuz: ");
        tarih = scanner.nextInt();
        System.out.print("Müzik Notunuz: ");
        muzik = scanner.nextInt();

        double ortalama = (matematik+fizik+kimya+turkce+tarih+muzik)/6.0;

        System.out.println((ortalama>60) ? "Sınıfı Geçti." : "Sınıfta Kaldı.");

    }

}
