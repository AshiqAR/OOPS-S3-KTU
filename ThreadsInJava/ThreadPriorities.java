// Java program to demonstrate thread Priorities in java

import java.util.*;


public class ThreadPriorities extends Thread{
    int n;
    ThreadPriorities(int n){
        this.n = n;
    }
    public void run(){
        System.out.println("Thread"+n+" Running....");
    }
    public static void main(String[] args) {
        ThreadPriorities t1 = new ThreadPriorities(1);
        ThreadPriorities t2 = new ThreadPriorities(2);
        ThreadPriorities t3 = new ThreadPriorities(3);

        System.out.println("Initial Priority of thread1 : "+t1.getPriority());
        System.out.println("Initial Priority of thread2 : "+t2.getPriority());
        System.out.println("Initial Priority of thread3 : "+t3.getPriority());
        System.out.println();

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        System.out.println("Priority of Thread1: "+t1.getPriority());
        t2.start();
        System.out.println("Priority of Thread2: "+t2.getPriority());
        t3.start();
        System.out.println("Priority of Thread3: "+t3.getPriority());
    }
}