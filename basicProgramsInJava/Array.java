public class Array {
    public static void main(String args[]){
        int i,j;
        int[] arr1 = {1,3,4,5};
        int[] arr2 = {4,3,9,1};
        int len1=arr1.length;
        int len2=arr2.length;
        int[] arr = new int[len1+len2];

        System.out.println("Array 1");
        for(i=0;i<len1;i++){
            arr[i]=arr1[i];
            System.out.print(arr1[i]+" ");
        }

        System.out.println("\nArray 2");
        for(j=0;j<len2;j++){
            arr[len1+j]=arr2[j];
            System.out.print(arr2[j]+" ");
        }

        System.out.println("\nMerged array");
        for(i=0;i<len1+len2;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
