public class B {
    volatile static int a =0;
    public static void main(String[] args) {
        int x =1;
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
        System.out.println("b.x=   "+b.x);
    }
}
