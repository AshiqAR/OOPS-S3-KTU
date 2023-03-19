import java.util.Scanner;

public class Transpose{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("MATRIX");
        System.out.print("Enter the number of rows and columns: ");
        int r = s.nextInt();
        int c = s.nextInt();
        int[][] matA = new int[r][c];
        System.out.println("Enter the elements of the matrix");
        int i,j;
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                matA[i][j] = s.nextInt();
            }
        }
        int[][] transA = new int[c][r];

        System.out.println("Entered Matrix");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print(matA[i][j]+" ");
                transA[j][i] = matA[i][j];
            }
            System.out.println(" ");
        }

        System.out.println("Transpose Matrx");
        for(i=0;i<c;i++){
            for(j=0;j<r;j++){
                System.out.print(transA[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}