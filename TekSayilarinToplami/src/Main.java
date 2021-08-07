import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter number(To exit enter oddone");
        int sayi = scanner.nextInt();
        while(sayi%2==0){
            numbers.add(sayi);
            System.out.println("Enter number(To exit enter oddone");
            sayi=scanner.nextInt();
        }
        int total = 0;

        for(int number: numbers){
            if(number%4==0){
                total+= number;
            }
        }
        System.out.println("Total is :" +total);
    }
}
