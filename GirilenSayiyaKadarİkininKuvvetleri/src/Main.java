import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");

        int number = new Scanner(System.in).nextInt();

        System.out.println("3'ün katları:");
        for(int i = 1; i<number;i*=3){
            System.out.println(i+",");
        }
        System.out.println("4'ün katları:");
        for(int i = 1;i<number;i*=4){
            System.out.println(i+",");
        }

    }
}
