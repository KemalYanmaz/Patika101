package Mains;

import java.util.Scanner;

public class AsalRecursive {
    public static void main(String[] args) {
        System.out.println("Sayı giriniz: ");
        if(asal(new Scanner(System.in).nextInt(),2)){
            System.out.println("Sayı asal");
        }else{
            System.out.println("Sayı asal değil");
        }
    }

    static boolean asal(int number,int i){
        if(number<=2){
            return (number==2)?true:false;
        }
        if(number%i==0){
            return false;
        }
        if(i*i>number){
            return true;
        }
        return asal(number,i+1);
    }
}
