package Mains;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        int prev1=1;
        int prev2=0;
        int tempprev=0;
        System.out.print(prev2+" "+prev1+" ");
        for(int i=1;i<=number;i++){
            tempprev=prev1+prev2;
            System.out.print(tempprev+" ");
            prev2=prev1;
            prev1=tempprev;
        }
    }
}
