/*
Write a Java program to create two threads: One for displaying all odd number between 
1 and 100 and second thread for displaying all even numbers between 1 and 100.

*/

import java.util.*;

class Display{
    synchronized void display(int n){
        if(n%2 == 1){
            System.out.println("Odd Numbers");
        }
        else{
            System.out.println("Even Numbers");
        }

        for(int i=n;i<100;i=i+2){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}

class OddThread extends Thread{
    Display d;
    OddThread(Display d){
        this.d = d;
    }
    public void run(){
        d.display(1);
    }
}
class EvenThread extends Thread{
    Display d;
    EvenThread(Display d){
        this.d = d;
    }
    public void run(){
        d.display(2);
    }
}



public class Odd_Even_Thread {
    public static void main(String[] args) {
        Display d = new Display();
        OddThread od = new OddThread(d);
        EvenThread ev = new EvenThread(d);

        od.start();
        ev.start();
    }
}
