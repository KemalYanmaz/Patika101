package Mains;

public class AsalSayilar {
    public static void main(String[] args) {
        boolean assal;
        for(int i=2;i<=100;i++){
            assal=true;
            for(int j=1;j<i;j++){
                if(i%2==0){
                    assal=false;
                }
            }

            if(assal||i==2){
                System.out.print(i+" ");
            }
        }
    }
}
