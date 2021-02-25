import java.io.IOException;

public class IbClass implements Ib {
    @Override
    public void IbMethod() throws IOException {
        System.out.println("Ib Method");
    }

    @Override
    public void show() {
        System.out.println("show method");
    }

    @Override
    public void IaMethod() {
        System.out.println("Ia Method");
    }

    public static void main(String[] args) throws IOException {
        Ia ia = new IbClass();
    }
}
