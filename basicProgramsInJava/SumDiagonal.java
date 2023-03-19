public class SumDiagonal{
    public static void main(String args[]){
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int row=3,col=3;
        int sum = 0;

        System.out.println("Matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat[i][j]+" ");
                if(i==j){
                    sum+=mat[i][j];
                }
            }
            System.out.println();
        }

        if(row!=col){
            System.out.println("Matrix is not a square matrix");
        }
        else{
            System.out.println("Sum of diagonal elements = "+sum);
        }
    }
}