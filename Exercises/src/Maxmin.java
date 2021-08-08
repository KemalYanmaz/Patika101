import java.util.Scanner;

public class Maxmin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max=0, min=0,number;
        System.out.println("Kaç adet sayı gireceksiniz: ");
        int adet = scanner.nextInt();


        for(int i=1;i<=adet;i++){
            System.out.print(i+"'inci sayıyı giriniz: ");
            number = scanner.nextInt();

            if(number>max){
                max = number;
            }
            if(number<min){
                min = number;
            }
        }

        System.out.println("Max "+max);
        System.out.println("Min "+min);
    }
}
