/*
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPool implements Runnable{
    int i;
    public MyThreadPool(int i){
        this.i = i;
        TreeMap
    }

    public void run(){
        LinkedList
        System.out.println("Start of Thread: "+i);
        HashMap
        for(int i=0;i<5;i++){
            System.out.println(i);
            try
            {
                throw new NullPointerException();

            }
            finally
            {
                System.out.println("Executing finally block");

            }
        }
        Map
        System.out.println("End of Thread: "+i);
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newCachedThreadPool();
        MyThreadPool s = new MyThreadPool(1);
        s.notifyAll();
       for (int i=1;i<100;i++)
        pool.execute(s);
       s.wait();
       Thread.sleep(4000);
        for (int i=100;i<200;i++)
            pool.execute(new MyThreadPool(i));


        pool.shutdown();
    }

}
*/
