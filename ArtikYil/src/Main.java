import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yıl giriniz: ");
        int year = scanner.nextInt();

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println(year+" is an ArtikYil");
                }else{
                    System.out.println(year+" is not an ArtikYil");
                }
            }else{
                System.out.println(year+" is an Artik Yil");
            }
        }
    }
}
