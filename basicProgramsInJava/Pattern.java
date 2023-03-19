public  class Pattern{
    public static void main(String args[]){
        
        int i,j,k;
        int n=4;
        for(i=1;i<=n;i++){
            k=i;
            for(j=1;j<=n;j++){
                if(i>=n-j+1)
                    System.out.print(k++ +" ");
                else
                    System.out.print("  ");
            }
            k=k-2;
            for(;j<n+i;j++){
                System.out.print(k-- +" ");
            }
            System.out.println();
        }
    }
}