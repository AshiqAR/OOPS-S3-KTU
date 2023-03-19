
public class GCD {
    public static void main(String args[]){
        int n1 = 12;
        int n2 = 0;
        if(n1>n2){
            int temp = n1;
            n1=n2;
            n2=temp;
        }
        int i;
        
        for(i=n1;i>=1;i--){
            if(n1%i==0 && n2%i==0){
                System.out.println("GCD of "+n1+","+n2+": "+ i);
                break;
            }
        }
        
        for(i=n2;;i++){
            if(i%n1==0 && i%n2==0){
                System.out.println("LCM of "+n1+","+n2+": "+ i);
                break;
            }
        }
        
    }
}
