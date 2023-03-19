// find smallest and largest number in an Array

public class SmallLarg {
    public static void main(String args[]){
        int[] arr = {7,1,6,4,5,12,3};
        int len = arr.length;
        int small=arr[0];
        int larg=arr[0];
        System.out.println("Array");
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+"  ");
            if(arr[i]<small)
                small=arr[i];
            if(arr[i]>larg)
                larg = arr[i];
        }
        System.out.println();
        System.out.println("Largest Number: "+larg);
        System.out.println("Smallest Number: "+small);
    }
}
