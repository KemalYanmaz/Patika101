import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = scanner.nextInt();
        System.out.println("Enter the r:");
        int r = scanner.nextInt();
        int _n=n;
        int _r=r;
        System.out.println("C(n,r) = n!/(r!*(n-r)!): ");
        for(int i=n;i>0;i--){
            _n*=i;
        }
        System.out.println(_n);
        for(int i=r;i!=1;i--){
            _r*=i;
        }
        int _nr=n-r;
        for(int i=_nr;i!=1;i--){
            _nr*=i;
        }
        System.out.println(_n/(_r*_nr));



    }
}

