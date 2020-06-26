public class WissenRunnable implements Runnable {
    public void run() {
        for(int i=0;i<1000;i++)
        System.out.println(i);
    }

    public static void main(String[] args) {
        Thread t = new Thread(new WissenRunnable());
        t.yield();
        t.start();
        for(int i=1000;i<2000;i++)
            System.out.println(i);
    }
}
