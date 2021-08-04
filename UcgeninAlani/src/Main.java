import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b,c;
        System.out.println("Lütfen üçgenin 3 kenarını giriniz.");
        System.out.print("a:");
        a = scanner.nextInt();
        scanner.nextLine();
        System.out.print("b:");
        b = scanner.nextInt();
        scanner.nextLine();
        System.out.print("c:");
        c = scanner.nextInt();
        scanner.nextLine();

        int u = (a+b+c)/2;

        System.out.println("Alan: "+ Math.sqrt(u*(u-a)*(u-b)*(u-c)));

    }
}
