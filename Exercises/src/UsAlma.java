public class UsAlma {
    public static void main(String[] args) {
        System.out.println(usAl(3,5));
    }

    static int usAl(int number1,int number2){
        if(number2==1){
            return number1;
        }
        return number1* usAl(number1,number2-1);
    }
}
