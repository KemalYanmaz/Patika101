import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int numberOfLecture= 0;
        int matematik,fizik,turkce,kimya,muzik;
        System.out.print("Matematik Notunuz: ");
        matematik = scanner.nextInt();
        System.out.println("Fizik Notunuz: ");
        fizik = scanner.nextInt();
        System.out.println("Türkçe Notunuz: ");
        turkce = scanner.nextInt();
        System.out.println("Kimya Notunuz: ");
        kimya = scanner.nextInt();
        System.out.println("Müzik Notunuz: ");
        muzik = scanner.nextInt();

        if(isValid(fizik)){
            total += fizik;
            numberOfLecture++;
        }
        if(isValid(matematik)){
            total+=matematik;
            numberOfLecture++;
        }
        if(isValid(turkce)){
            total+=turkce;
            numberOfLecture++;
        }
        if(isValid(kimya)){
            total+=kimya;
            numberOfLecture++;
        }
        if(isValid(muzik)){
            total+=muzik;
            numberOfLecture++;
        }

        if(total/numberOfLecture>55){
            System.out.println("Tebrikler geçtiniz.");
        }else{
            System.out.println("Geçemediniz.");
        }
    }

    static boolean isValid(int point){
        if(point >=0 && point <=100){
            return true;
        }
        return false;
    }

}

