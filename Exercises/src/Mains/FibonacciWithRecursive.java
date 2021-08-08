package Mains;

import java.util.Scanner;

public class FibonacciWithRecursive {
    public static void main(String[] args) {
        System.out.print("Kaç tane sayı istiyorsunuz: ");
        int number = new Scanner(System.in).nextInt();
        for(int i = 1; i<=number; i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
    static int fibonacci(int number){
        if(number==1||number==2){
            return 1;
        }
        return fibonacci(number-1)+fibonacci(number-2);
    }
}
