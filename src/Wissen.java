import java.util.concurrent.ThreadPoolExecutor;

public class Wissen extends Thread{
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        new Wissen().start();
        for (int i=1000;i<2000;i++){
            System.out.println(i);
        }
    }
}
