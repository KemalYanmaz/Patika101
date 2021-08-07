import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("The month you birth: ");
        int month = scanner.nextInt();
        System.out.print("The day you birth: ");
        int day = scanner.nextInt();

        if((month==3 && day>=21)||(month==4 && day<=20)){
            System.out.println("Burç : Koç");
        }else if((month==4 && day>=21)||(month==5 && day<=21)) {
            System.out.println("Burç : Boğa");
        }else if((month==5 && day>=22)||(month==6 && day<=22)) {
            System.out.println("Burç : İkizler");
        }else if((month==6 && day>=23)||(month==7 && day<=22)) {
            System.out.println("Burç : Yengeç");
        }else if((month==7 && day>=23)||(month==8 && day<=22)) {
            System.out.println("Burç : Aslan");
        }else if((month==8 && day>=22)||(month==9 && day<=22)) {
            System.out.println("Burç : Başak");
        }else if((month==9 && day>=22)||(month==10 && day<=22)) {
            System.out.println("Burç : Terazi");
        }else if((month==10 && day>=23)||(month==11 && day<=21)) {
            System.out.println("Burç : Akrep");
        }else if((month==11 && day>=22)||(month==12 && day<=21)) {
            System.out.println("Burç : Yay");
        }else if((month==12 && day>=22)||(month==1 && day<=21)) {
            System.out.println("Burç : Oğlak");
        }else if((month==1 && day>=22)||(month==2 && day<=19)) {
            System.out.println("Burç : Kova");
        }else if((month==2 && day>=20)||(month==3 && day<=20)) {
            System.out.println("Burç : Balık");
        }
        }
}
