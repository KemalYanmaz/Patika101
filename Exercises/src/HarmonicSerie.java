import java.util.Scanner;

public class HarmonicSerie {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        double total = 0.0;
        for(double i=1;i<=number;i++){
            total+=1/i;
        }
        System.out.println(total);

    }
}
