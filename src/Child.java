import java.io.IOException;

public class Child extends Base{
    @Override
    public void show(){
        System.out.println("Child Method");
    }

    public static void main(String[] args) throws IOException {
        Base b1 = new Base();
        Base b2 = new Child();
        Child c = new Child();

        b1.show();
        b2.show();
        c.show();

    }
}
