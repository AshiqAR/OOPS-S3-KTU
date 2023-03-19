import java.util.Scanner;

public class secondSmallestInArray {
    public static void main(String[] args) {
        int n,i;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers");
        for(i=0;i<n;i++)
            arr[i] = s.nextInt();
        if(n == 0 || n == 1){
            System.out.println("There is no second smallest element in the array");
            return;
        }
        int s1=arr[0],s2=arr[0];
        for(i =0;i<n;i++){
            if(arr[i] < s1)
                s1 = arr[i];
            if(arr[i] > s2)
                s2 = arr[i];
        }
        for(i=0;i<n;i++){
            if(arr[i] > s1 && arr[i] < s2)
                s2 = arr[i];
        }
        
        if(s1!= s2)
            System.out.println("Second Smallest element in the array is : "+ s2);
        else
            System.out.println("All elements are equal in the array");
    }
}
