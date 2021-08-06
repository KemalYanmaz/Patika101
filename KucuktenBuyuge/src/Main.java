import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 number to sort");

        int[] numbers = new int[3];

        for(int i = 0; i<3;i++){
            numbers[i]= scanner.nextInt();
            scanner.nextLine();
        }

        if(numbers[0]<numbers[1]){
            if(numbers[0]<numbers[2]){
                if(numbers[1]<numbers[2]){
                    System.out.println(numbers[0]+"<"+numbers[1]+"<"+numbers[2]);
                }
            }else{
                System.out.println(numbers[2]+"<"+numbers[0]+"<"+numbers[1]);
            }
        }else{
            if(numbers[1]<numbers[2]){
                if(numbers[0]<numbers[2]){
                    System.out.println(numbers[1]+"<"+numbers[0]+"<"+numbers[2]);
                }
            }else{
                System.out.println(numbers[1]+"<"+numbers[2]+"<"+numbers[0]);
            }
        }


    }
}
