import java.util.Scanner;

public class sortingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matris = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int i=0;i< matris.length;i++){
            for(int j=0;j<matris[i].length;j++){
                System.out.print(matris[i][j]+ " ");
            }
            System.out.println();
        }

        int[][] transpose = new int[3][3];
        for(int i=0;i< transpose.length;i++){
            for(int j=0;j<transpose[i].length;j++){
                transpose[j][i]= matris[i][j];
            }
        }

        for(int i=0;i< transpose.length;i++){
            for(int j=0;j< transpose[i].length;j++){
                System.out.print(transpose[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
