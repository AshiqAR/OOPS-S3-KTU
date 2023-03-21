
/*

Write a Java program that implements a multi-threaded program which has three 
threads. First thread generates a random integer every 1 second. If the value is even, 
second thread computes the square of the number and prints. If the value is odd the 
third thread will print the value of cube of the number.

*/

import java.util.*;

class RandomInt implements Runnable{
    RandomInt(){
    }
    public void run(){
        int n;
        Random r = new Random();
        try{
            for(int i=0;i<10;i++){
                n = r.nextInt(100);
                if(n%2 == 0){
                    Even e = new Even(n);
                    e.start();
                }
                else{
                    Odd o = new Odd(n);
                    o.start();
                }
                Thread.sleep(1000);
                System.out.println("----------------------------------------------");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

class Odd extends Thread{
    int n;
    Odd(int n){
        this.n = n;
    }
    public void run(){
        System.out.println("n = "+ n+", is odd so its cube = "+n*n*n);
    }
}

class Even extends Thread{
    int n;
    Even(int n){
        this.n = n;
    }
    public void run(){
        System.out.println("n = "+ n+", is even so its square = "+n*n);
    }
}

public class MultiThreading{
    public static void main(String[] args) {
        Runnable r = new RandomInt();
        Thread th = new Thread(r);
        th.start();
    }
}
