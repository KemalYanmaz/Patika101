import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counterRight = 3;
        String name,password;
        int balance = 1500;
        int selection;
        int price;





        while(counterRight>0){
            System.out.print("Kullanıcı Adı: ");
            name = scanner.nextLine();
            System.out.print("Şifre: ");
            password = scanner.nextLine();

            if(name.equals("Admin")&&password.equals("Password")){
                System.out.println("Merhaba kodluyoruz bankasına hoşgeldiniz.");

                do{
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçin.\n" +
                            "1-)Para Yatırma\n" +
                            "2-)Para Çekme\n" +
                            "3-)Bakiye Sorgulama\n" +
                            "4-)Çıkış Yap");
                    selection = scanner.nextInt();

                    switch (selection){
                        case 1:{
                            System.out.println("Para Yatırma Ekranı");
                            System.out.print("Lütfen Yatırmak istediğiniz ücreti giriniz: ");
                            balance+=scanner.nextInt();
                            break;
                        }
                        case 2:{
                            System.out.println("Para Çekme Ekranı");
                            System.out.print("Lütfen çekmek istediğiniz ücreti giriniz: ");
                            price = scanner.nextInt();
                            if(balance-price>=0){
                                balance-=price;
                                System.out.println(price+ " çekildi.Yeni bakiye: "+ balance);
                            }else{
                                System.out.println("Bakiye yetersiz.");
                            }
                            break;
                        }
                        case 3:{
                            System.out.println("Bakiyeniz: "+balance);
                            break;
                        }
                    }
                }while(selection!=4);
                System.out.println("Tekrar görüşmek üzere");
                break;

            }else{
                counterRight--;
                if(counterRight==0){
                    System.out.println("Hesabınız bloke olmuştur.");
                }else{
                    System.out.println("Hatalı kullanıcı adı veya şifre.\nTekrar Deneyiniz.\nKalan Hakkınız: "+counterRight);

                }
            }
        }


    }
}
