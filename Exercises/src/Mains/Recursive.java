package Mains;

public class Recursive {
    public static void main(String[] args) {
        desen(16,true);
    }
    static int desen(int number,boolean yon){

        if(yon){
            System.out.print(number+" ");
            return desen(number-5,(number-5)>0);
        }else{
            System.out.println(number+" ");
            return desen(number+5,false);
        }

    }
}
