import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i=1;i<=number;i++){
            for(int j=1;j<=(number-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
