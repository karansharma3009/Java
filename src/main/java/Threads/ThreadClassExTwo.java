package Threads;

 class ThreadClass extends Thread {

     public ThreadClass(String t)
     {
         super(t);
     }
     @Override
     public void run()
     {
         System.out.println("thread is running name -> "+ this.getName());
     }
}


class ThreadClassThree extends Thread {

    public ThreadClassThree(String t)
    {
        super(t);
    }
    @Override
    public void run()
    {
        System.out.println("thread is running name -> "+ this.getName());
    }
}

public class  ThreadClassExTwo
{
    public static void main (String[] args)
    {
        // creating two threads
        ThreadClass t1 = new ThreadClass("geek1");
        ThreadClass t2 = new ThreadClass("geek2");
        ThreadClassThree t3 = new ThreadClassThree("geek3");

        // getting the above created threads names.


        t1.start();
        t2.start();
        t3.start();
       // t1.start();
    }
}