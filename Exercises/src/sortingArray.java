import java.util.Scanner;

public class sortingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutunu girin: ");
        int boyut = scanner.nextInt();
        int[] dizi = new int[boyut];
        System.out.print("Dizinin elemanlarını girin: ");
        for(int i=0;i<dizi.length;i++){
            System.out.println("Eleman "+(i+1));
            dizi[i]= scanner.nextInt();
        }

        for(int i =0;i<dizi.length;i++){
            for(int j=0;j<dizi.length;j++){
                int temp;
                if(dizi[i]<dizi[j] && i>j){
                    temp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = temp;
                }
            }
        }

        for(int i:dizi){
            System.out.print(i+" ");
        }

    }
}
