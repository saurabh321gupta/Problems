public class B {
    volatile static int a =0;
    public static void main(String[] args) {
        /*int x =1;
        A a = new A();
        A b = new A();
        System.out.println("A.x=   "+A.x);
        System.out.println("a.x=   "+a.x);
        System.out.println("b.x=   "+b.x);
        System.out.println("----------a.x=10-----------");
        a.x=10;
        System.out.println("A.x=   "+A.x);
        System.out.println("a.x=   "+a.x);
        System.out.println("b.x=   "+b.x);
        System.out.println("----------b.x=20-----------");
        b.x=20;
        System.out.println("A.x=   "+A.x);
        System.out.println("a.x=   "+a.x);
        System.out.println("b.x=   "+b.x);*/
        long x = 218400;
        long y = 58632000;
        long m = 1000000007;
        //x=x%m;
        //y=y%m;
        System.out.println((x*y)%m);
    }
}
