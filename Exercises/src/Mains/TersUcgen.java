package Mains;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı girin:");
        int number = scanner.nextInt();

        for(int i=number;i>=1;i--){
            for(int j=1;j<=(number-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
