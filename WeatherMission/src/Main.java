import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter heat: ");
        int heat = scanner.nextInt();

        if(heat<5){
            System.out.println("The weather is good to ski");
        }else if(heat>=5 &&heat<15){
            System.out.println("The weather is good to go cinema");
        }else if(heat>=15 && heat <25){
            System.out.println("The weather is good to do picnic");
        }else if(heat>=25){
            System.out.println("The weather is good to swim");
        }

    }
}
