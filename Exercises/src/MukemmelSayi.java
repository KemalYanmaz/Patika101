import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi=scanner.nextInt();
        int total = 0;
        for(int i=1;i<sayi;i++){
            if(sayi%i==0){
                total+=i;
            }
        }
        if(total == sayi){
            System.out.println(sayi+" bir mükemmel sayıdır.");
        }else{
            System.out.println(sayi+" bir mükemmel sayı değildir.");

        }


    }
}
