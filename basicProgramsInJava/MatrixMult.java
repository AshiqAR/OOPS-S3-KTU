import java.util.Scanner;

public class MatrixMult {
    public static void main(String[] args) {
        int r1,c1,r2,c2,i,j,k;
        Scanner s = new Scanner(System.in);
        System.out.println("Matrix A");
        System.out.print("Enter the no. of rows and columns in Matrix A: ");
        r1 = s.nextInt();
        c1 = s.nextInt();
        int[][] m1 = new int[r1][c1];
        System.out.println("Enter Matrix A");
        for(i =0 ;i<r1;i++){
            for(j=0;j<c1;j++){
                m1[i][j] = s.nextInt(); 
            }
        }

        System.out.println("Matrix B");
        System.out.print("Enter the no. of rows and columns in Matrix B: ");
        r2 = s.nextInt();
        c2 = s.nextInt();
        int[][] m2 = new int[r2][c2];
        System.out.println("Enter Matrix B");
        for(i =0 ;i<r2;i++){
            for(j=0;j<c2;j++){
                m2[i][j] = s.nextInt(); 
            }
        }

        if(c1 != r2){
            System.out.println("Multiplication not compatible");
            return;
        }
        
        int[][] ab = new int[r1][c2];
        for(i=0;i<r1;i++){
            for(j=0;j<c2;j++){
                ab[i][j] = 0;
                for(k=0;k<c1;k++){
                    ab[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        System.out.println("Matrix A*B");
        for(i=0;i<r1;i++){
            for(j=0;j<c2;j++){
                System.out.print(ab[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
