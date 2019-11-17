package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task  implements Runnable {

    private String s ;
    public Task(String s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            System.out.println(s);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Task2  implements Runnable {

    private String s ;
    public Task2 (String s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            System.out.println("--->"+ s);
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Printer {
    private volatile boolean isEvenGlobal = true;

  public synchronized void  printOdd(int num)
    {
      //  System.out.println(isEvenGlobal+"inside PrintOdd");
        if(!isEvenGlobal) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(" num - ODD " + (num+1) );
        isEvenGlobal = false;
        notifyAll();

    }

   public synchronized  void  printEven(int num)
    {
     //  System.out.println("Inside PE"+ isEvenGlobal);
    if (isEvenGlobal) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
         System.out.println(" num EVEN " + (num+2));
        isEvenGlobal = true;
        notifyAll();

    }

}
// Using Thread Class here instead of Runnable Interface .
class Task3  extends Thread {

    int num = 0;
    int max =0;
    private String s;
    Printer print ;
    boolean iseven ;

    public Task3(String s , int max, boolean iseven , Printer p ) {
        this.s = s;
        this.iseven = iseven;
        this.max = max;
        this.print = p ;

    }

    @Override
    public void run() {
        try {
            while (num < max) {
                if ( !iseven) {
                    print.printOdd(num);
                }
                if ( iseven) {
                    print.printEven(num);
                }
                num+=2;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
public class  ThreadPoolEx
{
    public static void main(String[] args) throws InterruptedException {


        // Problem Statement 2 - >
        //creating ThreadPool of 2 thread - This will ensure not more thant 2 thread are open at a time
       ExecutorService pool = Executors.newFixedThreadPool(2);
        Runnable r1 = new Task("task 1");
        Runnable r2 = new Task2("task2 1");
        Runnable r3 = new Task("task 2");
        Runnable r4 = new Task("task 3");
        Runnable r5 = new Task("task 4");
        Runnable r6 = new Task2("task2 2");

        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);
        pool.execute(r6);
        pool.shutdown();;


        // Problem Statement 2 - >
        // Printing Odd and even number alternatively using two threads .
        Printer p = new Printer();
        Task3 taskEven = new Task3(" EVEN TRHEAD " ,10 , true , p);
        Thread t = new Thread(taskEven);
        Task3 taskOdd = new Task3(" ODD THREAD " , 10, false , p);
        Thread t2 = new Thread(taskOdd);
        t2.start();
       // Thread.sleep(1000);
        t.start();


    }
}



