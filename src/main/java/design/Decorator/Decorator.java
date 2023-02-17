package design.Decorator;

/**
 * @Author zhoujiacheng
 * @Date 2023-02-15
 **/
public class Decorator implements Sourceable{

    private Sourceable sourceable;

    public Decorator(Sourceable sourceable) {
        this.sourceable = sourceable;
    }

    @Override
    public void method1() {
        System.out.println("before decorator!");
        sourceable.method1();
        System.out.println("after decorator!");
    }

    public static void main(String[] args) {
        Source source = new Source();

        source.method1();

        Decorator decorator = new Decorator(source);

        decorator.method1();
    }
}
