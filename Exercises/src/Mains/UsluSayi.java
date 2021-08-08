package Mains;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int taban,us,result=1;
        System.out.print("Taban sayıyı giriniz: ");
        taban = scanner.nextInt();
        System.out.print("Üssü giriniz:");
        us = scanner.nextInt();
        int total = 1;

        for(int i = 1;i<=us;i++){
            total*=taban;
        }
        System.out.println("Answer: "+ total);


    }
}
