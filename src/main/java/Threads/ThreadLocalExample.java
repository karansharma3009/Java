package Threads;


public class ThreadLocalExample implements Runnable{

    private ThreadLocal<String> threadLocal = new ThreadLocal<String>();


    @Override
    public void run() {
        threadLocal.set(Math.random()+"NUMBER");
        String s = threadLocal.get();
        String s2 = s.replace("NUMBER","CHANTA");
        System.out.println(s2);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

        System.out.println(threadLocal.get());
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLocalExample obj = new ThreadLocalExample();
        for(int i=0 ; i<10; i++){
            Thread t = new Thread(obj,""+i);
            t.start();
            t.join();
        }

}
}
