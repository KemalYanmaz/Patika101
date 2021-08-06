import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.println("Password: ");
        String password = scanner.nextLine();

        if(username.equals("patika") && password.equals("java1234")){
            System.out.println("Login successful");
        }else{
            if(!password.equals("java1234")){
                System.out.println("Password is wrong. Do you want reset your password? ");
                if(scanner.nextLine().equals("Yes")){
                    System.out.print("Enter your new password: ");
                    String newPassword = scanner.nextLine();
                    if(newPassword.equals("java1234")){
                        System.out.println("New password must be different than old password.");
                    }else{
                        System.out.println("New password created.");
                    }
                }else{
                    System.out.println("Login is terminated.");
                }
            }
        }


    }
}
