// Print the pattern
/*
            1
        1   2   1
      1   3   3   1
    1   4   6   4    1
 */

 public class Pascals_Triangle{
    static int factorial(int n){
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }

    static int ncr(int n,int r){
        return factorial(n)/(factorial(n-r)*factorial(r));
    }

    public static void main(String args[]){
        int i,j;
        for(i=0;i<=4;i++){
            for(j=0;j<=4-i;j++){
                System.out.print(" ");
            }

            for(j=0;j<=i;j++){
                System.out.print(" "+ncr(i,j));
            }

            System.out.println();
        }
    }
}