import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tutar giriniz: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Kartno giriniz: ");
        String cardNo = scanner.nextLine();
        System.out.print("Son kullanma tarihini giriniz: ");
        String expiredDate = scanner.nextLine();
        System.out.print("Güvenlik kodunu giriniz: ");
        String cvc = scanner.nextLine();

        System.out.print("1-)A Bankası\n2-)B Bankası\n3-)C Bankası\nBanka Seçiniz: ");
        int selection = scanner.nextInt();

        switch (selection){
            case 1:
                ABankasi aBankasi = new ABankasi("A Bankası","31232131","31221312");
                aBankasi.connect();
                aBankasi.payment(price,cardNo,expiredDate,cvc);
                break;

            default:
                System.out.println("Geçerli banka giriniz !");
        }
    }
}
