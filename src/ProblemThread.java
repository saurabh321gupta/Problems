import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProblemThread {
    public static void main(String[] args) throws IOException {
//        Runnable rOdd = new Runnable() {
//            @Override
//            public void run() {
//                while (true){
//                    long num = Math.round(Math.random()*100.0);
//                    if(num%2==0){
//                        num++;
//                    }
//                    System.out.println(num);
//                }
//            }
//        };
//
//        Runnable rEven = new Runnable() {
//            @Override
//            public void run() {
//                while(true){
//                    long num = Math.round(Math.random()*100.0);
//                    if(num%2!=0){
//                        num++;
//                    }
//                    System.out.println(num);
//
//                }
//
//            }
//        };
//
//        Thread t1 = new Thread(rEven);
//        Thread t2 = new Thread(rOdd);
//
//        t1.start();
//        t2.start();


        List<String> list = new ArrayList(){{
            add("one");
            add("three");
            add("two");
        }};

        list.forEach(x->list.remove("two"));

    }
}
