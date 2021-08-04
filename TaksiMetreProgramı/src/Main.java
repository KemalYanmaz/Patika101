import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen mesafeyi giriniz:");
        int mesafe = scanner.nextInt();

        double ucret  = 10;

        ucret+= mesafe * 2.20;
        if(ucret< 20){
            System.out.println("Ödenecek Ücret: 20 TL");
        }else{
            System.out.println("Ödenecek Ücret:" + ucret + " TL");
        }
    }
}
