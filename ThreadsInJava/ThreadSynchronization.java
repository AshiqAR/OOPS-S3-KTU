/*
Write a Java program that shows thread synchronization
*/

class Display{
    Display(){}
    synchronized void display(int n){
        try{
            for(int i=1;i<5;i++){
                System.out.println(i*n);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

class myThread1 extends Thread{
    int n;
    Display d;
    myThread1(int n,Display d){
        this.n = n;
        this.d = d;
    }
    public void run(){
        d.display(n);
    }
}

class myThread2 extends Thread{
    int n;
    Display d;
    myThread2(int n,Display d){
        this.n = n;
        this.d = d;
    }
    public void run(){
        d.display(n);
    }
}

public class ThreadSynchronization {
    public static void main(String[] args) {
        Display d = new Display();

        myThread1 t1 = new myThread1(1, d);
        myThread2 t2 = new myThread2(10, d);

        t1.start();
        t2.start();
    }
}
