import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***Calculator***");

        System.out.print("Please enter first number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Please enter second number: ");
        double number2 = scanner.nextDouble();

        System.out.println("Choose: ");
        System.out.println("1-Addition\n2-Substraction\n3-Multiplication\n4-Division");

        switch (scanner.nextInt()){
            case 1:
                System.out.println(number1+ "+"+ number2 + "="+ (number1+number2));
                break;
            case 2:
                System.out.println(number1 +"-"+number2+"="+(number1-number2));
                break;
            case 3:
                System.out.println(number1+"*"+number2+"="+(number1*number2));
                break;
            case 4:
                System.out.println(number1+"/"+number2+"="+(number1/number2));
                break;
        }
    }
}
