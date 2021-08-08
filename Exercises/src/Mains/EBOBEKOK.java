package Mains;

import java.util.Scanner;

public class EBOBEKOK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1,number2,ebob=1,ekok=1;
        System.out.print("Birinci sayıyı giriniz: ");
        number1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        number2 = scanner.nextInt();


        for(int i=((number1>number2)?number1:number2);i>=1;i--){
            if(number1%i==0 && number2%i==0){
                ebob=i;
                break;
            }
        }

        for(int i=1;i<=number1*number2;i++){
            if(i%number1==0&&i%number2==0){
                ekok =i;
                break;
            }
        }
        System.out.println("Ebob:"+ebob);
        System.out.println("Ekok:"+ekok);
    }
}
