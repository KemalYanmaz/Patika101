import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        int tempNumber = number;
        int basamakSayisi = 0;
        int sayi;
        int result = 0;
        int basPow;
        while(tempNumber!=0){
            basamakSayisi++;
            tempNumber/=10;
        }

        tempNumber = number;

        while(tempNumber!=0){
            sayi = tempNumber%10;
            basPow=1;
            for(int i=1;i<=basamakSayisi;i++){
                basPow*=sayi;
            }
            result +=basPow;
            tempNumber/=10;
        }

        if(result==number){
            System.out.println("That is an Armstrongnumber");
        }
else{
            System.out.println("That is not an Armstrongnumber");

        }
    }
}


/*
* N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
* */