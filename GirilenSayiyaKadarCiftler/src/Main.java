import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Lütfen sayı giriniz:");
        int sayi = new Scanner(System.in).nextInt();
        int total = 0;
        int counter = 0;
        for(int i = 0; i<=sayi;i++){
            if(i%12==0){
                total+=i;
                counter++;
            }
        }

        System.out.println("Ortalama : "+(total/counter));
    }
}
